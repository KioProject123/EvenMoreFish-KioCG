package com.oheers.fish.config;

import com.oheers.fish.EvenMoreFish;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Xmas2022Config {

    private final EvenMoreFish plugin;
    private FileConfiguration config;
    public HashMap<Integer, Material> fillerDefault = new HashMap<>();

    public Xmas2022Config (EvenMoreFish plugin) {
        this.plugin = plugin;
        reload();
    }

    public void reload() {
        File xmas2022File = new File(this.plugin.getDataFolder(), "xmas2022.yml");

        if (!xmas2022File.exists()) {
            xmas2022File.getParentFile().mkdirs();
            this.plugin.saveResource("xmas2022.yml", false);
        }

        this.config = new YamlConfiguration();

        try {
            this.config.load(xmas2022File);
        } catch (IOException | org.bukkit.configuration.InvalidConfigurationException e) {
            e.printStackTrace();
        }

        fillerDefault.clear();
        generateDefaultFiller();
    }

    public void generateDefaultFiller() {
        List<String> layoutArray = this.config.getStringList("gui.advent-calendar.filler-settings.layout");
        List<String> planArray = this.config.getStringList("gui.advent-calendar.filler-settings.plan");

        for (int i=0; i < layoutArray.size(); i++) {
            String line = layoutArray.get(i);
            for (int j = 0; j < layoutArray.get(i).length(); j++) {
                char materialID = line.charAt(j);
                if (materialID != 'X') {
                    fillerDefault.put(((i * 9) + j), Material.valueOf(planArray.get(Integer.parseInt(String.valueOf(materialID)))));
                }
            }
        }
    }

    public String getGUIName() {
        return this.config.getString("gui.advent-calendar.title");
    }

    public FileConfiguration getConfig() {
        return this.config;
    }

    public String getFoundFishName() {
        return this.config.getString("gui.advent-calendar.filler-settings.fish-name", "&#74d680Day {day} - {name}");
    }

    public String getLockedFishName() {
        return this.config.getString("gui.advent-calendar.filler-settings.locked-fish-name", "&cDay {day} - ???");
    }

    public List<String> getFoundFishLore() {
        return this.config.getStringList("gui.advent-calendar.fish-lore");
    }

    public Material getLockedFishMaterial() {
        return Material.valueOf(this.config.getString("gui.advent-calendar.fish-material", "BARRIER"));
    }

    public List<String> getLockedFishLore() {
        return this.config.getStringList("gui.advent-calendar.locked-fish-lore");
    }
}
