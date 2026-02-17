package com.modid;

import com.modid.init.ModBlocks;
import net.fabricmc.api.ModInitializer;

public class ModId implements ModInitializer {
    @Override
    public void onInitialize() {
        ModBlocks.ModBlocks.registerBlocks();
    }
}
