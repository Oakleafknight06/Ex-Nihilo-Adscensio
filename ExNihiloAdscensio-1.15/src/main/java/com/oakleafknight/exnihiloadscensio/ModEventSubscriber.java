package com.oakleafknight.exnihiloadscensio;

import com.oakleafknight.exnihiloadscensio.block.DustBlock;
import com.oakleafknight.exnihiloadscensio.init.ModBlocks;
import com.oakleafknight.exnihiloadscensio.init.ModItemGroups;
import com.oakleafknight.exnihiloadscensio.item.PebbleItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistryEntry;

@EventBusSubscriber(modid = ExNihiloAdscensio.MODID, bus = EventBusSubscriber.Bus.MOD)
public final class ModEventSubscriber {

    @SubscribeEvent
    public static void  onRegisterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                //Pebbles
                setup(new PebbleItem(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "stone_pebble"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "andesite_pebble"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "diorite_pebble"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "granite_pebble"),
                //Ore Bits
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "ore_chunk"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "ore_piece"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "mini_coal"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "mini_charcoal"),
                //MISC
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "silkworm"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "cooked_silkworm"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "wood_chippings"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "porcelain_clay"),
                //Grassy seeds
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "ancient_spores"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "grass_seeds"),
                //Tree seeds
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "oak_seed"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "dark_oak_seed"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "birch_seed"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "acacia_seed"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "spruce_seed"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "jungle_seed"),
                //Crop Seeds
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "sugarcane_seeds"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "cactus_seeds"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "carrot_seeds"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "potato_seeds"),
                //Meshes
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "mesh"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "flint_mesh"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "iron_mesh"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "diamond_mesh"),
                //crooks
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "compressed_crook"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "crook"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "bone_crook"),
                //Hammers
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "wooden_hammer"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "compressed_wooden_hammer"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "stone_hammer"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "compressed_stone_hammer"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "iron_hammer"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "compressed_iron_hammer"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "diamond_hammer"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "compressed_diamond_hammer"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "double_compressed_diamond_hammer"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "chicken_stick"),
                //Misc Tools
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "unfired_clay_bucket"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "clay_bucket"),
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "wooden_bucket"),

                //BlockItems
                setup(new BlockItem(ModBlocks.DUST, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "dust"),
                //Barrels
                setup(new BlockItem(ModBlocks.STONE_BARREL, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "stone_barrel"),
                setup(new BlockItem(ModBlocks.GLASS_BARREL, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "glass_barrel"),
                setup(new BlockItem(ModBlocks.OAK_BARREL, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "oak_barrel"),
                setup(new BlockItem(ModBlocks.DARK_OAK_BARREL, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "dark_oak_barrel"),
                setup(new BlockItem(ModBlocks.SPRUCE_BARREL, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "spruce_barrel"),
                setup(new BlockItem(ModBlocks.BIRCH_BARREL, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "birch_barrel"),
                setup(new BlockItem(ModBlocks.ACACIA_BARREL, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "acacia_barrel"),
                setup(new BlockItem(ModBlocks.JUNGLE_BARREL, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "jungle_barrel"),
                //Sieves
                setup(new BlockItem(ModBlocks.OAK_SIEVE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "oak_sieve"),
                setup(new BlockItem(ModBlocks.DARK_OAK_SIEVE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "dark_oak_sieve"),
                setup(new BlockItem(ModBlocks.SPRUCE_SIEVE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "spruce_sieve"),
                setup(new BlockItem(ModBlocks.BIRCH_SIEVE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "birch_sieve"),
                setup(new BlockItem(ModBlocks.ACACIA_SIEVE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "acacia_sieve"),
                setup(new BlockItem(ModBlocks.JUNGLE_SIEVE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "jungle_sieve"),
                //Heavy sieves
                setup(new BlockItem(ModBlocks.HEAVY_OAK_SIEVE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "heavy_oak_sieve"),
                setup(new BlockItem(ModBlocks.HEAVY_DARK_OAK_SIEVE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "heavy_dark_oak_sieve"),
                setup(new BlockItem(ModBlocks.HEAVY_SPRUCE_SIEVE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "heavy_spruce_sieve"),
                setup(new BlockItem(ModBlocks.HEAVY_BIRCH_SIEVE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "heavy_birch_sieve"),
                setup(new BlockItem(ModBlocks.HEAVY_ACACIA_SIEVE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "heavy_acacia_sieve"),
                setup(new BlockItem(ModBlocks.HEAVY_JUNGLE_SIEVE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "heavy_jungle_sieve"),
                //crucibles
                setup(new BlockItem(ModBlocks.UNFIRED_CRUCIBLE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "unfired_crucible"),
                setup(new BlockItem(ModBlocks.CRUCIBLE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "crucible"),
                setup(new BlockItem(ModBlocks.OAK_CRUCIBLE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "oak_crucible"),
                setup(new BlockItem(ModBlocks.DARK_OAK_CRUCIBLE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "dark_oak_crucible"),
                setup(new BlockItem(ModBlocks.SPRUCE_CRUCIBLE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "spruce_crucible"),
                setup(new BlockItem(ModBlocks.BIRCH_CRUCIBLE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "birch_crucible"),
                setup(new BlockItem(ModBlocks.ACACIA_CRUCIBLE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "acacia_crucible"),
                setup(new BlockItem(ModBlocks.JUNGLE_CRUCIBLE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "jungle_crucible")

        );
    }
    
    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                setup(new DustBlock(1, Block.Properties.create(Material.SAND)), "dust"),
                //Barrels
                setup(new Block(Block.Properties.create(Material.ROCK)), "stone_barrel"),
                setup(new Block(Block.Properties.create(Material.GLASS)), "glass_barrel"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "oak_barrel"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "dark_oak_barrel"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "spruce_barrel"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "birch_barrel"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "acacia_barrel"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "jungle_barrel"),
                //Sieves
                setup(new Block(Block.Properties.create(Material.WOOD)), "oak_sieve"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "dark_oak_sieve"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "spruce_sieve"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "birch_sieve"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "acacia_sieve"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "jungle_sieve"),
                //Heavy Sieves
                setup(new Block(Block.Properties.create(Material.WOOD)), "oak_heavy_sieve"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "dark_oak_heavy_sieve"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "spruce_heavy_sieve"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "birch_heavy_sieve"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "acacia_heavy_sieve"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "jungle_heavy_sieve"),
                //Crucibles
                setup(new Block(Block.Properties.create(Material.CLAY)), "unfired_crucible"),
                setup(new Block(Block.Properties.create(Material.CLAY)), "crucible"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "oak_crucible"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "dark_oak_crucible"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "spruce_crucible"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "birch_crucible"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "acacia_crucible"),
                setup(new Block(Block.Properties.create(Material.WOOD)), "jungle_crucible")
        );
    }


    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(ExNihiloAdscensio.MODID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }

}
