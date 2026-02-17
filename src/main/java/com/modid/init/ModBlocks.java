package com.modid.init;

import com.modid.block.MonBloc;

public class ModBlocks {
    package com.modid.init;

import com.modid.block.MonBloc;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

    public class ModBlocks {
        public static final Block MON_BLOC = new MonBloc();

        public static void registerBlocks() {
            Registry.register(Registry.BLOCK, new Identifier("modid", "mon_bloc"), MON_BLOC);
        }
    }

}
