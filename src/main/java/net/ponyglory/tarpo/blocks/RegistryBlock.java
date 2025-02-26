package net.ponyglory.tarpo.blocks;

import com.google.common.base.Supplier;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.ponyglory.tarpo.Tarpo;
import net.ponyglory.tarpo.item.RegistryItem;
import net.ponyglory.tarpo.itemgroup.baseGroup;

public class RegistryBlock {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Tarpo.MOD_ID);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, ItemGroup group) {
        RegistryItem.ITEMS.register(name, 
            () -> new BlockItem(block.get(), 
                new Item.Properties().tab(group)));
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, ItemGroup group) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, group);
        return toReturn;
    }


    // DIVINITY
    // BUILD BLOCKS
    public static final RegistryObject<Block> MRABLE = registerBlock(
        "mrable",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(5f)),
        baseGroup.DIVINITY_GROUP
    );
    public static final RegistryObject<Block> MRABLE_BRICK = registerBlock(
        "mrable_brick",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(5f)),
        baseGroup.DIVINITY_GROUP
    );


    // PRANA
    // ORES
    public static final RegistryObject<Block> AMBER_ORE = registerBlock(
        "amber_ore",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(5f)),
        baseGroup.PRANA_GROUP
    );
    public static final RegistryObject<Block> RUBE_ORE = registerBlock(
        "rube_ore",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(5f)),
        baseGroup.PRANA_GROUP
    );
    public static final RegistryObject<Block> YIN_ORE = registerBlock(
        "yin_ore",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(5f)),
        baseGroup.PRANA_GROUP
    );
    public static final RegistryObject<Block> YAN_ORE = registerBlock(
        "yan_ore",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(5f)),
        baseGroup.PRANA_GROUP
    );


    // MANA
    // ORES
    public static final RegistryObject<Block> SAPFIRE_ORE = registerBlock(
        "sapfire_ore",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(5f)),
        baseGroup.MANA_GROUP
    );
    public static final RegistryObject<Block> DIRTY_MANA_ORE = registerBlock(
        "dirty_mana_ore",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(5f)),
        baseGroup.MANA_GROUP
    );
    public static final RegistryObject<Block> MERCURY_ORE = registerBlock(
        "mercury_ore",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(5f)),
        baseGroup.MANA_GROUP
    );
    public static final RegistryObject<Block> MIXED_CRISTALLITE_ORE = registerBlock(
        "mixed_cristallite_ore",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(5f)),
        baseGroup.MANA_GROUP
    );


    // CHI
    // ORES
    public static final RegistryObject<Block> SCRAP_ORE = registerBlock(
        "scrap_ore",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(5f)),
        baseGroup.CHI_GROUP
    );
    public static final RegistryObject<Block> TITANE_ORE = registerBlock(
        "titane_ore",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(5f)),
        baseGroup.CHI_GROUP
    );
    public static final RegistryObject<Block> VOID_ORE = registerBlock(
        "void_ore",
        () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(5f)),
        baseGroup.CHI_GROUP
    );
    
    
    
    // TEST 3D MODEL
    public static final RegistryObject<Block> TABURET = registerBlock(
        "taburet",
        () -> new ModBlocks.Taburet(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(1).harvestTool(ToolType.AXE).requiresCorrectToolForDrops().strength(2f).noOcclusion()),
        baseGroup.CREATIVE_GROUP
    );
}
