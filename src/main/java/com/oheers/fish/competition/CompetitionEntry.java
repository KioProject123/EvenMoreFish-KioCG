package com.oheers.fish.competition;

import com.oheers.fish.fishing.items.Fish;
import org.jetbrains.annotations.NotNull;

import java.time.Instant;
import java.util.UUID;

public class CompetitionEntry implements Comparable<CompetitionEntry> {

    private final UUID player;
    private final Fish fish;
    private long time;
    private float value;

    CompetitionEntry(UUID player, Fish fish, CompetitionType type) {
        this.player = player;
        this.fish = fish;
        this.time = Instant.now().toEpochMilli();

        if (type == CompetitionType.LARGEST_FISH) this.value = fish.getLength();
        else this.value = 1;
    }

    /**
     * Increases the player's "score" by a set amount. The time that the entry was made will always be set to the current
     * epoch millisecond and will be unaffected by an increaseAmount that is not 1.
     *
     * @param increaseAmount The amount to increase the player's score by.
     */
    public void incrementValue(float increaseAmount) {
        this.value += Math.abs(increaseAmount);
        this.time = Instant.now().toEpochMilli();
    }

    public Fish getFish() {
        return fish;
    }

    public long getTime() {
        return time;
    }

    public int getHash() {
        return this.hashCode();
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public UUID getPlayer() {
        return player;
    }

    @Override
    public int compareTo(@NotNull CompetitionEntry entry) {
        // if o's value and this's value are equal, use the time caught instead
        if (entry.getValue() != this.value) {
            return (entry.getValue() > this.value) ? 1 : -1;
        } else {
            return (entry.getTime() > this.time) ? 1 : -1;
        }
    }


    @Override
    public String toString() {
        return "CompetitionEntry[" + this.player + ", " + value + ", " + time + "]";
    }
}
