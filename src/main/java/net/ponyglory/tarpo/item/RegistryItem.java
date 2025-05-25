package net.ponyglory.tarpo.item;


import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.ponyglory.tarpo.Tarpo;
import net.ponyglory.tarpo.item.custom.SpawnEggs;
import net.ponyglory.tarpo.item.enums.itemTier;
import net.ponyglory.tarpo.itemgroup.baseGroup;
import net.ponyglory.tarpo.mobs.ModMobs;
import net.ponyglory.tarpo.mobs.custom.DarkEntity;

import static net.ponyglory.tarpo.mobs.ModMobs.*;

public class RegistryItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Tarpo.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
    
    // ICONS
    public static final RegistryObject<Item> DIVINITY_EDIT = ITEMS.register("divinity-edit",
    ()-> new Item(new Item.Properties().tab(baseGroup.CREATIVE_GROUP)));
    public static final RegistryObject<Item> MANA_EDTI = ITEMS.register("mana-edit",
    ()-> new Item(new Item.Properties().tab(baseGroup.CREATIVE_GROUP)));
    public static final RegistryObject<Item> PRANA_EDIT = ITEMS.register("prana-edit",
    ()-> new Item(new Item.Properties().tab(baseGroup.CREATIVE_GROUP)));
    public static final RegistryObject<Item> CHI_EDIT = ITEMS.register("chi-edit",
    ()-> new Item(new Item.Properties().tab(baseGroup.CREATIVE_GROUP)));
    public static final RegistryObject<Item> START_EDIT = ITEMS.register("start-edit",
    ()-> new Item(new Item.Properties().tab(baseGroup.CREATIVE_GROUP)));
    public static final RegistryObject<Item> CREATIVE_EDIT = ITEMS.register("creative-edit",
    ()-> new Item(new Item.Properties().tab(baseGroup.CREATIVE_GROUP)));


    // BOOKS 
    public static final RegistryObject<Item> DIVINITY_BOOK = ITEMS.register("divinity-book",
    ()-> new bookItem.divinityBook(new Item.Properties().tab(baseGroup.DIVINITY_GROUP).durability(100)));
    public static final RegistryObject<Item> MANA_BOOK = ITEMS.register("mana-book",
    ()-> new bookItem.manaBook(new Item.Properties().tab(baseGroup.MANA_GROUP).durability(100)));
    public static final RegistryObject<Item> PRANA_BOOK = ITEMS.register("prana-book",
    ()-> new bookItem.pranaBook(new Item.Properties().tab(baseGroup.PRANA_GROUP).durability(100)));
    public static final RegistryObject<Item> CHI_BOOK = ITEMS.register("chi-book",
    ()-> new bookItem.chiBook(new Item.Properties().tab(baseGroup.CHI_GROUP).durability(100)));
    public static final RegistryObject<Item> START_BOOK = ITEMS.register("start-book",
    ()-> new bookItem.startBook(new Item.Properties().tab(baseGroup.START_GROUP).durability(100)));


    // DIVINITY
    // WANDS
    public static final RegistryObject<Item> DIVINITY_WAND = ITEMS.register("divinity-wand-tier1-1",
    ()-> new Item(new Item.Properties().tab(baseGroup.DIVINITY_GROUP)));
    public static final RegistryObject<Item> TEST_WAND = ITEMS.register("test_wand",
    () -> new Item(new Item.Properties().tab(baseGroup.DIVINITY_GROUP).durability(100)));
    // ITEMS
    public static final RegistryObject<Item> LEGEND = ITEMS.register("legend",
    ()-> new Item(new Item.Properties().tab(baseGroup.DIVINITY_GROUP)));
    public static final RegistryObject<Item> IDOL_GIBELI = ITEMS.register("idol_gibeli",
    ()-> new Item(new Item.Properties().tab(baseGroup.DIVINITY_GROUP)));
    // INGOT
    public static final RegistryObject<Item> DEVIL_INGOT = ITEMS.register("devil_ingot",
    ()-> new Item(new Item.Properties().tab(baseGroup.DIVINITY_GROUP)));
    public static final RegistryObject<Item> DEVIL_NUGGET = ITEMS.register("devil_nugget",
    ()-> new Item(new Item.Properties().tab(baseGroup.DIVINITY_GROUP)));


    // MANA
    public static final RegistryObject<Item> DIRTY_MANA_CRISTALL = ITEMS.register("dirty_mana_cristall",
    ()-> new Item(new Item.Properties().tab(baseGroup.MANA_GROUP)));
    public static final RegistryObject<Item> SAPFIRE = ITEMS.register("sapfire",
    ()-> new Item(new Item.Properties().tab(baseGroup.MANA_GROUP)));
    // CRISTALL
    public static final RegistryObject<Item> AQUA_CRISTALL = ITEMS.register("aqua_cristall",
    ()-> new Item(new Item.Properties().tab(baseGroup.MANA_GROUP)));
    public static final RegistryObject<Item> EATHER_CRISTALL = ITEMS.register("eather_cristall",
    ()-> new Item(new Item.Properties().tab(baseGroup.MANA_GROUP)));
    public static final RegistryObject<Item> WIND_CRISTALL = ITEMS.register("wind_cristall",
    ()-> new Item(new Item.Properties().tab(baseGroup.MANA_GROUP)));
    public static final RegistryObject<Item> FIRE_CRISTALL = ITEMS.register("fire_cristall",
    ()-> new Item(new Item.Properties().tab(baseGroup.MANA_GROUP)));
    public static final RegistryObject<Item> ELEMENTAL_CRISTALL = ITEMS.register("elemental_cristall",
    ()-> new Item(new Item.Properties().tab(baseGroup.MANA_GROUP)));


    // PRANA
    // MINERALS
    public static final RegistryObject<Item> SHARD_IMMORTAL = ITEMS.register("shard_immortal",
    ()-> new Item(new Item.Properties().tab(baseGroup.PRANA_GROUP)));
    public static final RegistryObject<Item> MERCURY_DROP = ITEMS.register("mercury_drop",
    ()-> new Item(new Item.Properties().tab(baseGroup.PRANA_GROUP)));
    public static final RegistryObject<Item> RUBE = ITEMS.register("rube",
    ()-> new Item(new Item.Properties().tab(baseGroup.PRANA_GROUP)));
    public static final RegistryObject<Item> YAN_SHARD = ITEMS.register("yan_shard",
    ()-> new Item(new Item.Properties().tab(baseGroup.PRANA_GROUP)));
    public static final RegistryObject<Item> YIN_SHARD = ITEMS.register("yin_shard",
    ()-> new Item(new Item.Properties().tab(baseGroup.PRANA_GROUP)));
    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
    ()-> new Item(new Item.Properties().tab(baseGroup.PRANA_GROUP)));
    // EGGS
    public static final RegistryObject<Item> DARK_EGG = ITEMS.register("dark_egg",
            ()-> new SpawnEggs.DarkEggs(ModMobs.DARK, 0x464F56, 0x1D66336,new Item.Properties().tab(baseGroup.PRANA_GROUP)));


    // CHI
    // INGOT
    public static final RegistryObject<Item> TITAN_INGOT = ITEMS.register("titan_ingot",
    ()-> new Item(new Item.Properties().tab(baseGroup.CHI_GROUP)));
    public static final RegistryObject<Item> VOID_INGOT = ITEMS.register("void_ingot",
    ()-> new Item(new Item.Properties().tab(baseGroup.CHI_GROUP)));
    public static final RegistryObject<Item> SCRAP_FRAGMENT = ITEMS.register("scrap_fragment",
    ()-> new Item(new Item.Properties().tab(baseGroup.CHI_GROUP)));
    public static final RegistryObject<Item> STEEL = ITEMS.register("steel",
    ()-> new Item(new Item.Properties().tab(baseGroup.CHI_GROUP)));
    // SWORD
    public static final RegistryObject<Item> BLADE_DOOMED = ITEMS.register("blade_doomed",
    ()-> new SwordItem(itemTier.STEEL, 1, 0f ,new Item.Properties().tab(baseGroup.CHI_GROUP).durability(750)));
}
