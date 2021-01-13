package com.MrBlueCat135.vanillaPlus.registry;

import com.MrBlueCat135.vanillaPlus.Main;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModFeatures {
    public static ConfiguredFeature<?, ?> RUBY_ORE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.RUBY_ORE.getDefaultState(),
                    9)) //Vein Size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, //Bottom offset
                    15, //Minimum Y Level
                    30))) //Maximum Y Level
            .spreadHorizontally()
            .repeat(20); //Number of veins per chunk

    public static void registerFeatures(){
        RegistryKey<ConfiguredFeature<?, ?>> rubyOre = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(Main.MOD_ID, "ruby_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, rubyOre.getValue(), RUBY_ORE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, rubyOre);
    }
}
