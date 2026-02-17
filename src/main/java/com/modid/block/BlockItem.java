package com.modid.block;

import com.modid.init.ModBlocks;

public class BlockItem {
    package com.modid.init;

import com.modid.block.MonBloc;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

    public class ModItems {
        public static final BlockItem MON_BLOC_ITEM = new BlockItem(ModBlocks.MON_BLOC, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

        public static void registerItems() {
            Registry.register(Registry.ITEM, new Identifier("modid", "mon_bloc"), MON_BLOC_ITEM);
        }
    }

}
