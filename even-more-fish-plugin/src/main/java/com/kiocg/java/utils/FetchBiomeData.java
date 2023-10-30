package com.kiocg.java.utils;

import org.bukkit.block.Biome;

import java.util.Collections;
import java.util.List;

public class FetchBiomeData {
    public static List<Biome> get(final String fish) {
        switch (fish) {
            case "河豚":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.海洋},
                                               FishBiome.BiomeSeason.夏);
            case "鳀鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.海洋},
                                               FishBiome.BiomeSeason.春, FishBiome.BiomeSeason.秋);
            case "金枪鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.海洋},
                                               FishBiome.BiomeSeason.夏, FishBiome.BiomeSeason.冬);
            case "沙丁鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.海洋},
                                               FishBiome.BiomeSeason.春, FishBiome.BiomeSeason.秋, FishBiome.BiomeSeason.冬);
            case "鲷鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.森林, FishBiome.BiomeType.河流});
            case "大嘴鲈鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.山区});
            case "小嘴鲈鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.森林, FishBiome.BiomeType.河流},
                                               FishBiome.BiomeSeason.春, FishBiome.BiomeSeason.秋);
            case "虹鳟鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.森林, FishBiome.BiomeType.河流, FishBiome.BiomeType.山区},
                                               FishBiome.BiomeSeason.夏);
            case "鲑鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.森林, FishBiome.BiomeType.河流},
                                               FishBiome.BiomeSeason.秋);
            case "大眼鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.森林, FishBiome.BiomeType.河流, FishBiome.BiomeType.山区},
                                               FishBiome.BiomeSeason.秋);
            case "河鲈":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.森林, FishBiome.BiomeType.河流, FishBiome.BiomeType.山区},
                                               FishBiome.BiomeSeason.冬);
            case "鲤鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.山区, FishBiome.BiomeType.黑森林, FishBiome.BiomeType.荒地, FishBiome.BiomeType.蘑菇岛});
            case "鲶鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.森林, FishBiome.BiomeType.河流, FishBiome.BiomeType.黑森林, FishBiome.BiomeType.沼泽},
                                               FishBiome.BiomeSeason.春, FishBiome.BiomeSeason.夏, FishBiome.BiomeSeason.秋);
            case "狗鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.森林, FishBiome.BiomeType.河流},
                                               FishBiome.BiomeSeason.夏, FishBiome.BiomeSeason.冬);
            case "太阳鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.森林, FishBiome.BiomeType.河流},
                                               FishBiome.BiomeSeason.春, FishBiome.BiomeSeason.夏);
            case "红鲻鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.海洋},
                                               FishBiome.BiomeSeason.夏, FishBiome.BiomeSeason.冬);
            case "鲱鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.海洋},
                                               FishBiome.BiomeSeason.春, FishBiome.BiomeSeason.冬);
            case "鳗鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.海洋},
                                               FishBiome.BiomeSeason.春, FishBiome.BiomeSeason.秋);
            case "章鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.海洋},
                                               FishBiome.BiomeSeason.夏);
            case "红鲷鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.海洋},
                                               FishBiome.BiomeSeason.夏, FishBiome.BiomeSeason.秋, FishBiome.BiomeSeason.冬);
            case "鱿鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.海洋},
                                               FishBiome.BiomeSeason.冬);
            case "海参":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.海洋},
                                               FishBiome.BiomeSeason.秋, FishBiome.BiomeSeason.冬);
            case "大海参":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.海洋},
                                               FishBiome.BiomeSeason.夏, FishBiome.BiomeSeason.秋);
            case "鬼鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.溶洞});
            case "石鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.溶洞});
            case "冰柱鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.溶洞});
            case "岩浆鳗鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.溶洞});
            case "沙鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.沙漠});
            case "蝎鲤鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.沙漠});
            case "比目鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.海洋},
                                               FishBiome.BiomeSeason.春, FishBiome.BiomeSeason.夏);
            case "午夜鲤鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.森林, FishBiome.BiomeType.山区},
                                               FishBiome.BiomeSeason.秋, FishBiome.BiomeSeason.冬);
            case "鲟鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.山区},
                                               FishBiome.BiomeSeason.夏, FishBiome.BiomeSeason.冬);
            case "虎纹鳟鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.森林, FishBiome.BiomeType.河流},
                                               FishBiome.BiomeSeason.秋, FishBiome.BiomeSeason.冬);
            case "大头鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.山区});
            case "罗非鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.海洋},
                                               FishBiome.BiomeSeason.夏, FishBiome.BiomeSeason.秋);
            case "鲢鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.森林, FishBiome.BiomeType.山区});
            case "麻哈脂鲤":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.森林},
                                               FishBiome.BiomeSeason.夏);
            case "青花鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.海洋},
                                               FishBiome.BiomeSeason.秋, FishBiome.BiomeSeason.冬);
            case "西鲱":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.森林, FishBiome.BiomeType.河流},
                                               FishBiome.BiomeSeason.春, FishBiome.BiomeSeason.夏, FishBiome.BiomeSeason.秋);
            case "蛇齿单线鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.森林, FishBiome.BiomeType.河流, FishBiome.BiomeType.山区},
                                               FishBiome.BiomeSeason.冬);
            case "大比目鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.海洋},
                                               FishBiome.BiomeSeason.春, FishBiome.BiomeSeason.夏, FishBiome.BiomeSeason.冬);
            case "木跃鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.黑森林});
            case "虚空鲑鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.沼泽});
            case "史莱姆鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.蘑菇岛});
            case "狮子鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.海洋});
            case "蓝铁饼鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.森林, FishBiome.BiomeType.河流});
            case "黄貂鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.海洋});
            case "午夜鱿鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.深海},
                                               FishBiome.BiomeSeason.冬);
            case "幽灵鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.深海},
                                               FishBiome.BiomeSeason.冬);
            case "水滴鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.深海},
                                               FishBiome.BiomeSeason.冬);
            case "绯红鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.海洋},
                                               FishBiome.BiomeSeason.夏);
            case "鮟鱇鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.河流},
                                               FishBiome.BiomeSeason.秋);
            case "传说之鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.山区},
                                               FishBiome.BiomeSeason.春);
            case "冰川鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.森林},
                                               FishBiome.BiomeSeason.冬);
            case "变种鲤鱼":
                return FishBiome.findFishBiome(new FishBiome.BiomeType[]{FishBiome.BiomeType.荒地});
        }
        return Collections.emptyList();
    }
}
