package com.MrBlueCat135.vanillaPlus.registry;

import com.MrBlueCat135.vanillaPlus.Main;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item NETHERITE_NUGGET = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings()
            .group(ItemGroup.MISC)); //Creative item tab
    public static final BlockItem RUBY_ORE = new BlockItem(ModBlocks.RUBY_ORE, new Item.Settings()
            .group(ItemGroup.MISC)); //Creative item tab
    public static final BlockItem COMPRESSED_WOOD_BLOCK = new BlockItem(ModBlocks.COMPRESSED_WOOD_BLOCK, new Item.Settings()
            .group(ItemGroup.MISC)); //Creative item tab
    public static final BlockItem DOUBLE_COMPRESSED_WOOD_BLOCK = new BlockItem(ModBlocks.DOUBLE_COMPRESSED_WOOD_BLOCK, new Item.Settings()
            .group(ItemGroup.MISC)); //Creative item tab
    public static final BlockItem COMPRESSED_COBBLESTONE_BLOCK = new BlockItem(ModBlocks.COMPRESSED_COBBLESTONE_BLOCK, new Item.Settings()
            .group(ItemGroup.MISC)); //Creative item tab
    public static final BlockItem DOUBLE_COMPRESSED_COBBLESTONE_BLOCK = new BlockItem(ModBlocks.DOUBLE_COMPRESSED_COBBLESTONE_BLOCK, new Item.Settings()
            .group(ItemGroup.MISC)); //Creative item tab
    public static final BlockItem COMPRESSED_IRON_BLOCK = new BlockItem(ModBlocks.COMPRESSED_IRON_BLOCK, new Item.Settings()
            .group(ItemGroup.MISC)); //Creative item tab
    public static final BlockItem DOUBLE_COMPRESSED_IRON_BLOCK = new BlockItem(ModBlocks.DOUBLE_COMPRESSED_IRON_BLOCK, new Item.Settings()
            .group(ItemGroup.MISC)); //Creative item tab
    public static final BlockItem COMPRESSED_GOLD_BLOCK = new BlockItem(ModBlocks.COMPRESSED_GOLD_BLOCK, new Item.Settings()
            .group(ItemGroup.MISC)); //Creative item tab
    public static final BlockItem DOUBLE_COMPRESSED_GOLD_BLOCK = new BlockItem(ModBlocks.DOUBLE_COMPRESSED_GOLD_BLOCK, new Item.Settings()
            .group(ItemGroup.MISC)); //Creative item tab
    public static final BlockItem COMPRESSED_DIAMOND_BLOCK = new BlockItem(ModBlocks.COMPRESSED_DIAMOND_BLOCK, new Item.Settings()
            .group(ItemGroup.MISC)); //Creative item tab
    public static final BlockItem DOUBLE_COMPRESSED_DIAMOND_BLOCK = new BlockItem(ModBlocks.DOUBLE_COMPRESSED_DIAMOND_BLOCK, new Item.Settings()
            .group(ItemGroup.MISC)); //Creative item tab
    public static final BlockItem COMPRESSED_NETHERITE_BLOCK = new BlockItem(ModBlocks.COMPRESSED_NETHERITE_BLOCK, new Item.Settings()
            .group(ItemGroup.MISC)); //Creative item tab
    public static final BlockItem DOUBLE_COMPRESSED_NETHERITE_BLOCK = new BlockItem(ModBlocks.DOUBLE_COMPRESSED_NETHERITE_BLOCK, new Item.Settings()
            .group(ItemGroup.MISC)); //Creative item tab

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "netherite_nugget"), NETHERITE_NUGGET);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "compressed_wood_block"), COMPRESSED_WOOD_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "double_compressed_wood_block"), DOUBLE_COMPRESSED_WOOD_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "compressed_cobblestone_block"), COMPRESSED_COBBLESTONE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "double_compressed_cobblestone_block"), DOUBLE_COMPRESSED_COBBLESTONE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "compressed_iron_block"), COMPRESSED_IRON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "double_compressed_iron_block"), DOUBLE_COMPRESSED_IRON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "compressed_gold_block"), COMPRESSED_GOLD_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "double_compressed_gold_block"), DOUBLE_COMPRESSED_GOLD_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "compressed_diamond_block"), COMPRESSED_DIAMOND_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "double_compressed_diamond_block"), DOUBLE_COMPRESSED_DIAMOND_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "compressed_netherite_block"), COMPRESSED_NETHERITE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "double_compressed_netherite_block"), DOUBLE_COMPRESSED_NETHERITE_BLOCK);
    }
}