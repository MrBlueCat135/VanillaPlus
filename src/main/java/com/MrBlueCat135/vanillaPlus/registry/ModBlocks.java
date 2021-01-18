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
            .luminance(15)); //Light emitted from block
    public static final Block RUBY_ORE = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 2) //Iron Pickaxe or higher is needed to get drops
            .requiresTool() //Cannot be obtained by hand
            .strength(3,3) //Same settings as a diamond ore, hardness is related to break time and resistance is blast resistance
            .sounds(BlockSoundGroup.STONE)); //Sounds made when the block is walked on
    public static final Block COMPRESSED_WOOD_BLOCK = new Block(FabricBlockSettings.of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES, 0) //Wooden Axe or higher is needed to break faster
            .strength(3,6) //Hardness is related to break time and resistance is blast resistance
            .sounds(BlockSoundGroup.WOOD)); //Sounds made when the block is walked on
    public static final Block DOUBLE_COMPRESSED_WOOD_BLOCK = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.AXES, 0) //Wooden Axe or higher is needed to break faster
            .strength(5,6) //Hardness is related to break time and resistance is blast resistance
            .sounds(BlockSoundGroup.WOOD)); //Sounds made when the block is walked on
    public static final Block COMPRESSED_COBBLESTONE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 1) //Stone Pickaxe or higher is needed to get drops
            .requiresTool() //Cannot be obtained by hand
            .strength(7,8) //Hardness is related to break time and resistance is blast resistance
            .sounds(BlockSoundGroup.STONE)); //Sounds made when the block is walked on
    public static final Block DOUBLE_COMPRESSED_COBBLESTONE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 1) //Stone Pickaxe or higher is needed to get drops
            .requiresTool() //Cannot be obtained by hand
            .strength(9,10) //Hardness is related to break time and resistance is blast resistance
            .sounds(BlockSoundGroup.STONE)); //Sounds made when the block is walked on
    public static final Block COMPRESSED_IRON_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2) //Stone Pickaxe or higher is needed to get drops
            .requiresTool() //Cannot be obtained by hand
            .strength(10,12) //Hardness is related to break time and resistance is blast resistance
            .sounds(BlockSoundGroup.METAL)); //Sounds made when the block is walked on
    public static final Block DOUBLE_COMPRESSED_IRON_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2) //Stone Pickaxe or higher is needed to get drops
            .requiresTool() //Cannot be obtained by hand
            .strength(12,14) //Hardness is related to break time and resistance is blast resistance
            .sounds(BlockSoundGroup.METAL)); //Sounds made when the block is walked on
    public static final Block COMPRESSED_GOLD_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2) //Stone Pickaxe or higher is needed to get drops
            .requiresTool() //Cannot be obtained by hand
            .strength(14,16) //Hardness is related to break time and resistance is blast resistance
            .sounds(BlockSoundGroup.METAL)); //Sounds made when the block is walked on
    public static final Block DOUBLE_COMPRESSED_GOLD_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2) //Stone Pickaxe or higher is needed to get drops
            .requiresTool() //Cannot be obtained by hand
            .strength(16,18) //Hardness is related to break time and resistance is blast resistance
            .sounds(BlockSoundGroup.METAL)); //Sounds made when the block is walked on
    public static final Block COMPRESSED_DIAMOND_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2) //Stone Pickaxe or higher is needed to get drops
            .requiresTool() //Cannot be obtained by hand
            .strength(18,20) //Hardness is related to break time and resistance is blast resistance
            .sounds(BlockSoundGroup.METAL)); //Sounds made when the block is walked on
    public static final Block DOUBLE_COMPRESSED_DIAMOND_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2) //Stone Pickaxe or higher is needed to get drops
            .requiresTool() //Cannot be obtained by hand
            .strength(20,1200) //Hardness is related to break time and resistance is blast resistance
            .sounds(BlockSoundGroup.METAL)); //Sounds made when the block is walked on
    public static final Block COMPRESSED_NETHERITE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 3) //Stone Pickaxe or higher is needed to get drops
            .requiresTool() //Cannot be obtained by hand
            .strength(60,1200) //Hardness is related to break time and resistance is blast resistance
            .sounds(BlockSoundGroup.NETHERITE)); //Sounds made when the block is walked on
    public static final Block DOUBLE_COMPRESSED_NETHERITE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 3) //Stone Pickaxe or higher is needed to get drops
            .requiresTool() //Cannot be obtained by hand
            .strength(70,1200) //Hardness is related to break time and resistance is blast resistance
            .sounds(BlockSoundGroup.NETHERITE)); //Sounds made when the block is walked on

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "compressed_wood_block"), COMPRESSED_WOOD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "double_compressed_wood_block"), DOUBLE_COMPRESSED_WOOD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "compressed_cobblestone_block"), COMPRESSED_COBBLESTONE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "double_compressed_cobblestone_block"), DOUBLE_COMPRESSED_COBBLESTONE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "compressed_iron_block"), COMPRESSED_IRON_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "double_compressed_iron_block"), DOUBLE_COMPRESSED_IRON_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "compressed_gold_block"), COMPRESSED_GOLD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "double_compressed_gold_block"), DOUBLE_COMPRESSED_GOLD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "compressed_diamond_block"), COMPRESSED_DIAMOND_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "double_compressed_diamond_block"), DOUBLE_COMPRESSED_DIAMOND_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "compressed_netherite_block"), COMPRESSED_NETHERITE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "double_compressed_netherite_block"), DOUBLE_COMPRESSED_NETHERITE_BLOCK);
    }
}