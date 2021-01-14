package com.MrBlueCat135.vanillaPlus.registry;

import com.MrBlueCat135.vanillaPlus.Main;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2) //Iron Pickaxe or higher is needed to get drops
            .requiresTool() //Cannot be obtained by hand
            .strength(5,6) //Same settings as a diamond block, hardness is related to break time and resistance is blast resistance
            .sounds(BlockSoundGroup.METAL) //Sounds made when the block is walked on
            .luminance(15)); //Light emmited from block
    public static final Block RUBY_ORE = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 2) //Iron Pickaxe or higher is needed to get drops
            .requiresTool() //Cannot be obtained by hand
            .strength(3,3) //Same settings as a diamond ore, hardness is related to break time and resistance is blast resistance
            .sounds(BlockSoundGroup.STONE)); //Sounds made when the block is walked on

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "ruby_ore"), RUBY_ORE);
    }
}