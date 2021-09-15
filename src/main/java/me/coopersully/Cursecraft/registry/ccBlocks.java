package me.coopersully.Cursecraft.registry;

import me.coopersully.Cursecraft.Main;
import me.coopersully.Cursecraft.registry.Block.AdvancedWorkbenchBlock;
import me.coopersully.Cursecraft.registry.Block.StarwoodStairsBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ccBlocks {

    public static final Block METAL_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .strength(5.0f, 30)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .sounds(BlockSoundGroup.METAL)
    );

    public static final Block PLASTIC_BLOCK = new Block(FabricBlockSettings
            .of(Material.ORGANIC_PRODUCT)
            .strength(0.1f)
            .breakByHand(true)
            .sounds(BlockSoundGroup.WART_BLOCK)
    );

    public static final PillarBlock STARWOOD_LOG = new PillarBlock(FabricBlockSettings
            .of(Material.WOOD)
            .strength(3.0f, 10)
            .sounds(BlockSoundGroup.WOOD)
            .breakByHand(true)
            .breakByTool(FabricToolTags.AXES, 0)
    );

    public static final Block STARWOOD_PLANKS = new Block(FabricBlockSettings
            .of(Material.WOOD)
            .strength(3.0f, 10)
            .breakByHand(true)
            .breakByTool(FabricToolTags.AXES)
            .sounds(BlockSoundGroup.WOOD)
    );

    public static final Block STARWOOD_STAIRS = new StarwoodStairsBlock(STARWOOD_PLANKS.getDefaultState(), FabricBlockSettings
            .of(Material.WOOD)
            .strength(3.0f, 10)
            .breakByHand(true)
            .breakByTool(FabricToolTags.AXES)
            .sounds(BlockSoundGroup.WOOD)
    );

    public static final Block STARWOOD_SLAB = new SlabBlock(FabricBlockSettings
            .of(Material.WOOD)
            .strength(3.0f, 10)
            .breakByHand(true)
            .breakByTool(FabricToolTags.AXES)
            .sounds(BlockSoundGroup.WOOD)
    );

    public static final Block STARWOOD_LEAVES = new LeavesBlock(FabricBlockSettings
            .of(Material.LEAVES)
            .strength(0.2f)
            .breakByHand(true)
            .breakByTool(FabricToolTags.SHEARS)
            .sounds(BlockSoundGroup.GRASS)
            .nonOpaque()
    );

    public static final Block STICKY_SLIME_BLOCK = new SlimeBlock(FabricBlockSettings
            .of(Material.SOLID_ORGANIC)
            .sounds(BlockSoundGroup.SLIME)
            .velocityMultiplier(0.1f)
            .jumpVelocityMultiplier(0.175f)
    );

    public static final Block ADVANCED_WORKBENCH = new AdvancedWorkbenchBlock(FabricBlockSettings
            .of(Material.WOOD)
            .sounds(BlockSoundGroup.WOOD)
    );

    public static void register() {

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "metal_block"), METAL_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "plastic_block"), PLASTIC_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "starwood_log"), STARWOOD_LOG);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "starwood_planks"), STARWOOD_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "starwood_stairs"), STARWOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "starwood_slab"), STARWOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "starwood_leaves"), STARWOOD_LEAVES);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "sticky_slime_block"), STICKY_SLIME_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "advanced_workbench"), ADVANCED_WORKBENCH);

    }

}