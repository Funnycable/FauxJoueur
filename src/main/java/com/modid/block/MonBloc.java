package com.modid.block;

import net.minecraft.block.Block;

public class MonBloc extends Block {
    super(FabricBlockSettings.create()
        .mapColor(MapColor.BRIGHT_GREEN) // Définit la couleur de la carte
            .material(Material.STONE)       // Définit le matériau (ex: pierre, bois, etc.)
            .strength(1.0f)                  // Résistance du bloc
        );
        }
    }
}