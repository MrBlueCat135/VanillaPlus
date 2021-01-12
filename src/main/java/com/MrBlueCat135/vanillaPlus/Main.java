package com.MrBlueCat135.vanillaPlus;

import com.MrBlueCat135.vanillaPlus.registry.ModBlocks;
import com.MrBlueCat135.vanillaPlus.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {

    public static final String MOD_ID = "vplus";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
