package com.kiocg.java.utils;

import com.oheers.fish.EvenMoreFish;
import org.bukkit.block.Biome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.stream.Stream;

public enum FishBiome {
    OCEAN("海洋", BiomeType.海洋, BiomeSeason.春, BiomeSeason.夏, BiomeSeason.秋),
    PLAINS("平原", BiomeType.河流),
    DESERT("沙漠", BiomeType.沙漠, BiomeSeason.夏),
    WINDSWEPT_HILLS("风袭丘陵", BiomeType.山区),
    FOREST("森林", BiomeType.森林),
    TAIGA("针叶林", BiomeType.森林),
    SWAMP("沼泽", BiomeType.沼泽),
    MANGROVE_SWAMP("红树林沼泽", BiomeType.沼泽),
    RIVER("河流", BiomeType.河流),
    FROZEN_OCEAN("冻洋", BiomeType.海洋, BiomeSeason.冬),
    FROZEN_RIVER("冻河", BiomeType.河流, BiomeSeason.冬),
    SNOWY_PLAINS("雪原", BiomeType.河流, BiomeSeason.冬),
    MUSHROOM_FIELDS("蘑菇岛", BiomeType.蘑菇岛),
    BEACH("沙滩", BiomeType.河流),
    JUNGLE("丛林", BiomeType.森林, BiomeSeason.夏),
    SPARSE_JUNGLE("稀疏丛林", BiomeType.森林, BiomeSeason.夏),
    DEEP_OCEAN("深海", BiomeType.深海, BiomeSeason.春, BiomeSeason.秋, BiomeSeason.冬),
    STONY_SHORE("石岸", BiomeType.河流),
    SNOWY_BEACH("积雪沙滩", BiomeType.河流, BiomeSeason.冬),
    BIRCH_FOREST("桦木森林", BiomeType.森林),
    DARK_FOREST("黑森林", BiomeType.黑森林),
    SNOWY_TAIGA("积雪针叶林", BiomeType.森林, BiomeSeason.冬),
    OLD_GROWTH_PINE_TAIGA("原始松木针叶林", BiomeType.森林),
    WINDSWEPT_FOREST("风袭森林", BiomeType.山区),
    SAVANNA("热带草原", BiomeType.荒地, BiomeSeason.夏),
    SAVANNA_PLATEAU("热带高原", BiomeType.荒地, BiomeSeason.夏),
    BADLANDS("恶地", BiomeType.荒地, BiomeSeason.夏),
    WOODED_BADLANDS("疏林恶地", BiomeType.荒地, BiomeSeason.夏),
    WARM_OCEAN("暖水海洋", BiomeType.海洋, BiomeSeason.夏),
    LUKEWARM_OCEAN("温水海洋", BiomeType.海洋, BiomeSeason.春),
    COLD_OCEAN("冷水海洋", BiomeType.海洋, BiomeSeason.秋),
    DEEP_LUKEWARM_OCEAN("温水深海", BiomeType.深海, BiomeSeason.春),
    DEEP_COLD_OCEAN("冷水深海", BiomeType.深海, BiomeSeason.秋),
    DEEP_FROZEN_OCEAN("冰冻深海", BiomeType.深海, BiomeSeason.冬),
    SUNFLOWER_PLAINS("向日葵平原", BiomeType.河流),
    WINDSWEPT_GRAVELLY_HILLS("风袭沙砾丘陵", BiomeType.山区),
    FLOWER_FOREST("繁花森林", BiomeType.森林),
    ICE_SPIKES("冰刺之地", BiomeType.河流, BiomeSeason.冬),
    OLD_GROWTH_BIRCH_FOREST("原始桦木森林", BiomeType.森林),
    OLD_GROWTH_SPRUCE_TAIGA("原始云杉针叶林", BiomeType.森林),
    WINDSWEPT_SAVANNA("风袭热带草原", BiomeType.山区, BiomeSeason.夏),
    ERODED_BADLANDS("风蚀恶地", BiomeType.荒地, BiomeSeason.夏),
    BAMBOO_JUNGLE("竹林", BiomeType.森林, BiomeSeason.夏),
    DRIPSTONE_CAVES("溶洞", BiomeType.溶洞),
    LUSH_CAVES("繁茂洞穴", BiomeType.溶洞),
    DEEP_DARK("深暗之域", BiomeType.溶洞),
    MEADOW("草甸", BiomeType.山区),
    GROVE("雪林", BiomeType.山区, BiomeSeason.冬),
    SNOWY_SLOPES("积雪山坡", BiomeType.山区, BiomeSeason.冬),
    FROZEN_PEAKS("冰封山峰", BiomeType.山区, BiomeSeason.冬),
    JAGGED_PEAKS("尖峭山峰", BiomeType.山区, BiomeSeason.冬),
    STONY_PEAKS("裸岩山峰", BiomeType.山区, BiomeSeason.夏),
    CHERRY_GROVE("樱花树林", BiomeType.山区),

    NETHER_WASTES("下界荒地", BiomeType.OTHER, BiomeSeason.NONE),
    SOUL_SAND_VALLEY("灵魂沙峡谷", BiomeType.OTHER, BiomeSeason.NONE),
    CRIMSON_FOREST("绯红森林", BiomeType.OTHER, BiomeSeason.NONE),
    WARPED_FOREST("诡异森林", BiomeType.OTHER, BiomeSeason.NONE),
    BASALT_DELTAS("玄武岩三角洲", BiomeType.OTHER, BiomeSeason.NONE),
    THE_END("末地", BiomeType.OTHER, BiomeSeason.NONE),
    SMALL_END_ISLANDS("末地小型岛屿", BiomeType.OTHER, BiomeSeason.NONE),
    END_MIDLANDS("末地内陆", BiomeType.OTHER, BiomeSeason.NONE),
    END_HIGHLANDS("末地高地", BiomeType.OTHER, BiomeSeason.NONE),
    END_BARRENS("末地荒地", BiomeType.OTHER, BiomeSeason.NONE),
    THE_VOID("虚空", BiomeType.OTHER, BiomeSeason.NONE);

    private final BiomeType biomeType;
    private final List<BiomeSeason> biomeSeasons;

    FishBiome(final String chineseName, final BiomeType biomeType) {
        this(chineseName, biomeType, BiomeSeason.春, BiomeSeason.秋);
    }

    FishBiome(final String chineseName, final BiomeType biomeType, final BiomeSeason... biomeSeasons) {
        this.biomeType = biomeType;
        this.biomeSeasons = Arrays.asList(biomeSeasons);
    }

    public static List<Biome> findFishBiome(final BiomeType[] biomeTypes, final BiomeSeason... biomeSeasons) {
        final List<Biome> biomes = new ArrayList<>();
        Stream.of(values()).filter(fishBiome -> Arrays.stream(biomeTypes).anyMatch(biomeType1 -> biomeType1 == fishBiome.biomeType)
                                                && Arrays.stream(biomeSeasons).anyMatch(fishBiome.biomeSeasons::contains))
              .forEach(fishBiome -> {
                  try {
                      biomes.add(Biome.valueOf(fishBiome.name()));
                  } catch (final IllegalArgumentException iae) {
                      EvenMoreFish.logger.log(Level.SEVERE, fishBiome.name() + " 不是一个有效的群系类型.");
                  }
              });
        return biomes;
    }

    public static List<Biome> findFishBiome(final BiomeType[] biomeTypes) {
        return findFishBiome(biomeTypes, BiomeSeason.春, BiomeSeason.夏, BiomeSeason.秋, BiomeSeason.冬);
    }

    public enum BiomeType {
        山区,
        森林,
        沙漠,
        河流,
        沼泽,
        海洋,
        深海,
        溶洞,
        荒地,
        蘑菇岛,
        黑森林,
        OTHER
    }

    public enum BiomeSeason {
        春,
        夏,
        秋,
        冬,
        NONE
    }
}
