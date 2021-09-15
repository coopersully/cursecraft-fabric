package me.coopersully.Cursecraft.registry;

import me.coopersully.Cursecraft.Main;
import me.coopersully.Cursecraft.armorMaterials.MetalArmorMaterial;
import me.coopersully.Cursecraft.items.AristotellianCompassItem;
import me.coopersully.Cursecraft.items.BogieBlasterItem;
import me.coopersully.Cursecraft.items.SMDModuleItem;
import me.coopersully.Cursecraft.items.WonderBoxItem;
import me.coopersully.Cursecraft.toolMaterials.BlankAxeItem;
import me.coopersully.Cursecraft.toolMaterials.BlankHoeItem;
import me.coopersully.Cursecraft.toolMaterials.BlankPickaxeItem;
import me.coopersully.Cursecraft.toolMaterials.ReinforcedGoldToolMaterial;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ccItems {

    // Creative Item Groups
    public static final ItemGroup CURSECRAFT = FabricItemGroupBuilder.build(
            new Identifier(Main.MOD_ID, "cursecraft"),
            () -> new ItemStack(ccItems.BATTERIES)
            );

    // Regular Items
    public static final Item BATTERIES = new Item(new Item.Settings().group(ccItems.CURSECRAFT));
    public static final Item METAL_SCRAP = new Item(new Item.Settings().group(ccItems.CURSECRAFT));
    public static final Item PLASTIC = new Item(new Item.Settings().group(ccItems.CURSECRAFT));
    public static final Item TAPE = new Item(new Item.Settings().group(ccItems.CURSECRAFT));
    public static final Item METAL_INGOT = new Item(new Item.Settings().group(ccItems.CURSECRAFT));
    public static final Item METAL_PLATE = new Item(new Item.Settings().group(ccItems.CURSECRAFT));
    public static final Item COMPUTER_PARTS = new Item(new Item.Settings().group(ccItems.CURSECRAFT));
    public static final Item AQUATIC_ESSENCE = new Item(new Item.Settings().group(ccItems.CURSECRAFT).rarity(Rarity.RARE));
    public static final Item DARK_ESSENCE = new Item(new Item.Settings().group(ccItems.CURSECRAFT).rarity(Rarity.RARE));
    public static final Item DIVINE_ESSENCE = new Item(new Item.Settings().group(ccItems.CURSECRAFT).rarity(Rarity.RARE));
    public static final Item LIGHT_ESSENCE = new Item(new Item.Settings().group(ccItems.CURSECRAFT).rarity(Rarity.RARE));
    public static final Item LIVING_ESSENCE = new Item(new Item.Settings().group(ccItems.CURSECRAFT).rarity(Rarity.RARE));
    public static final Item MAGIC_ESSENCE = new Item(new Item.Settings().group(ccItems.CURSECRAFT).rarity(Rarity.RARE));
    public static final Item MALFORMED_ESSENCE = new Item(new Item.Settings().group(ccItems.CURSECRAFT).rarity(Rarity.RARE));
    public static final Item UNDEAD_ESSENCE = new Item(new Item.Settings().group(ccItems.CURSECRAFT).rarity(Rarity.RARE));
    public static final Item UNIVERSE_ESSENCE = new Item(new Item.Settings().group(ccItems.CURSECRAFT).rarity(Rarity.EPIC));
    public static final Item VOIDIAN_ESSENCE = new Item(new Item.Settings().group(ccItems.CURSECRAFT).rarity(Rarity.RARE));
    public static final WonderBoxItem WONDER_BOX = new WonderBoxItem(new Item.Settings().group(ccItems.CURSECRAFT).rarity(Rarity.RARE));

    public static final AristotellianCompassItem ARISTOTELLIAN_COMPASS = new AristotellianCompassItem(new Item.Settings().group(ccItems.CURSECRAFT).rarity(Rarity.RARE));
    public static final BogieBlasterItem BOGIE_BLASTER = new BogieBlasterItem(new Item.Settings().group(ccItems.CURSECRAFT).rarity(Rarity.EPIC));

    public static final Item REINFORCED_GOLD_INGOT = new Item(new Item.Settings().group(ccItems.CURSECRAFT));
    public static final Item GOLD_PLATE = new Item(new Item.Settings().group(ccItems.CURSECRAFT));

    public static final Item STICKY_SLIME = new Item(new Item.Settings().group(ccItems.CURSECRAFT));
    public static final Item SMD_MODULE = new SMDModuleItem(new Item.Settings().group(ccItems.CURSECRAFT));

    // Tools & Weapons
    public static ToolItem REINFORCED_GOLD_SWORD = new SwordItem(ReinforcedGoldToolMaterial.TOOL_MATERIAL, 1, -1.6f, new Item.Settings().group(ccItems.CURSECRAFT));
    public static ToolItem REINFORCED_GOLD_PICKAXE = new BlankPickaxeItem(ReinforcedGoldToolMaterial.TOOL_MATERIAL, 0, -1.2f, new Item.Settings().group(ccItems.CURSECRAFT));
    public static ToolItem REINFORCED_GOLD_AXE = new BlankAxeItem(ReinforcedGoldToolMaterial.TOOL_MATERIAL, 3, -0.8f, new Item.Settings().group(ccItems.CURSECRAFT));
    public static ToolItem REINFORCED_GOLD_SHOVEL = new ShovelItem(ReinforcedGoldToolMaterial.TOOL_MATERIAL, 0, -1.0f, new Item.Settings().group(ccItems.CURSECRAFT));
    public static ToolItem REINFORCED_GOLD_HOE = new BlankHoeItem(ReinforcedGoldToolMaterial.TOOL_MATERIAL, 0, -2.0f, new Item.Settings().group(ccItems.CURSECRAFT));

    public static ToolItem LIMBONIC_SWORD = new SwordItem(ToolMaterials.DIAMOND, 0, 0, new Item.Settings().group(ccItems.CURSECRAFT));
    public static ToolItem LIMBONIC_PICKAXE = new BlankPickaxeItem(ToolMaterials.DIAMOND, 0, 0, new Item.Settings().group(ccItems.CURSECRAFT));
    public static ToolItem LIMBONIC_AXE = new BlankAxeItem(ToolMaterials.DIAMOND, 0, 0, new Item.Settings().group(ccItems.CURSECRAFT));
    public static ToolItem LIMBONIC_SHOVEL = new ShovelItem(ToolMaterials.DIAMOND, 0, 0, new Item.Settings().group(ccItems.CURSECRAFT));
    public static ToolItem LIMBONIC_HOE = new BlankHoeItem(ToolMaterials.DIAMOND, 0, 0, new Item.Settings().group(ccItems.CURSECRAFT));

    public static ToolItem INDUSTRIAL_HAMMER = new BlankPickaxeItem(ToolMaterials.IRON, 0, 0, new Item.Settings().group(ccItems.CURSECRAFT));

    // Armor Items
    public static final ArmorMaterial METAL_ARMOR_MATERIAL = new MetalArmorMaterial();
    public static final Item METAL_HELMET = new ArmorItem(METAL_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ccItems.CURSECRAFT));
    public static final Item METAL_CHESTPLATE = new ArmorItem(METAL_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ccItems.CURSECRAFT));
    public static final Item METAL_LEGGINGS = new ArmorItem(METAL_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ccItems.CURSECRAFT));
    public static final Item METAL_BOOTS = new ArmorItem(METAL_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ccItems.CURSECRAFT));

    // Block-related Items
    public static final BlockItem METAL_BLOCK = new BlockItem(ccBlocks.METAL_BLOCK, new Item.Settings()
            .group(ccItems.CURSECRAFT)
            .maxCount(16)
    );

    public static final BlockItem PLASTIC_BLOCK = new BlockItem(ccBlocks.PLASTIC_BLOCK, new Item.Settings()
            .group(ccItems.CURSECRAFT)
            .maxCount(64)
    );

    public static final BlockItem STARWOOD_LOG = new BlockItem(ccBlocks.STARWOOD_LOG, new Item.Settings()
            .group(ccItems.CURSECRAFT)
            .maxCount(64)
    );

    public static final BlockItem STARWOOD_PLANKS = new BlockItem(ccBlocks.STARWOOD_PLANKS, new Item.Settings()
            .group(ccItems.CURSECRAFT)
            .maxCount(64)
    );

    public static final BlockItem STARWOOD_STAIRS = new BlockItem(ccBlocks.STARWOOD_STAIRS, new Item.Settings()
            .group(ccItems.CURSECRAFT)
            .maxCount(64)
    );

    public static final BlockItem STARWOOD_SLAB = new BlockItem(ccBlocks.STARWOOD_SLAB, new Item.Settings()
            .group(ccItems.CURSECRAFT)
            .maxCount(64)
    );

    public static final BlockItem STARWOOD_LEAVES = new BlockItem(ccBlocks.STARWOOD_LEAVES, new Item.Settings()
            .group(ccItems.CURSECRAFT)
            .maxCount(64)
    );

    public static final BlockItem STICKY_SLIME_BLOCK = new BlockItem(ccBlocks.STICKY_SLIME_BLOCK, new Item.Settings()
            .group(ccItems.CURSECRAFT)
            .maxCount(64)
    );

    public static final BlockItem ADVANCED_WORKBENCH = new BlockItem(ccBlocks.ADVANCED_WORKBENCH, new Item.Settings()
            .group(ccItems.CURSECRAFT)
            .maxCount(64)
    );

    public static final BlockItem UNLAND = new BlockItem(ccBlocks.UNLAND, new Item.Settings()
            .group(ccItems.CURSECRAFT)
            .maxCount(64)
    );

    public static final BlockItem UNEARTH = new BlockItem(ccBlocks.UNEARTH, new Item.Settings()
            .group(ccItems.CURSECRAFT)
            .maxCount(64)
    );

    public static void register() {

        // Regular Items
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "batteries"), BATTERIES);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "metal_scrap"), METAL_SCRAP);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "plastic"), PLASTIC);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "tape"), TAPE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "metal_ingot"), METAL_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "metal_plate"), METAL_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "computer_parts"), COMPUTER_PARTS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "aquatic_essence"), AQUATIC_ESSENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "dark_essence"), DARK_ESSENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "divine_essence"), DIVINE_ESSENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "light_essence"), LIGHT_ESSENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "living_essence"), LIVING_ESSENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "magic_essence"), MAGIC_ESSENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "malformed_essence"), MALFORMED_ESSENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "undead_essence"), UNDEAD_ESSENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "universe_essence"), UNIVERSE_ESSENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "voidian_essence"), VOIDIAN_ESSENCE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "wonder_box"), WONDER_BOX);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "aristotellian_compass"), ARISTOTELLIAN_COMPASS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "bogie_blaster"), BOGIE_BLASTER);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "reinforced_gold_ingot"), REINFORCED_GOLD_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "gold_plate"), GOLD_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sticky_slime_ball"), STICKY_SLIME);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "smd_module"), SMD_MODULE);

        // Tools & Weapons
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "reinforced_gold_sword"), REINFORCED_GOLD_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "reinforced_gold_pickaxe"), REINFORCED_GOLD_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "reinforced_gold_axe"), REINFORCED_GOLD_AXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "reinforced_gold_shovel"), REINFORCED_GOLD_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "reinforced_gold_hoe"), REINFORCED_GOLD_HOE);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "limbonic_sword"), LIMBONIC_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "limbonic_pickaxe"), LIMBONIC_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "limbonic_axe"), LIMBONIC_AXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "limbonic_shovel"), LIMBONIC_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "limbonic_hoe"), LIMBONIC_HOE);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "industrial_hammer"), INDUSTRIAL_HAMMER);
        
        // Armor Items
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "metal_helmet"), METAL_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "metal_chestplate"), METAL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "metal_leggings"), METAL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "metal_boots"), METAL_BOOTS);

        // Block-related Items
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "metal_block"), METAL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "plastic_block"), PLASTIC_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "starwood_log"), STARWOOD_LOG);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "starwood_planks"), STARWOOD_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "starwood_stairs"), STARWOOD_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "starwood_slab"), STARWOOD_SLAB);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "starwood_leaves"), STARWOOD_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sticky_slime_block"), STICKY_SLIME_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "advanced_workbench"), ADVANCED_WORKBENCH);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "unland"), UNLAND);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "unearth"), UNEARTH);

    }

}