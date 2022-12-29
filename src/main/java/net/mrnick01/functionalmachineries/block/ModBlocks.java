package net.mrnick01.functionalmachineries.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrnick01.functionalmachineries.FunctionalMachineries;
import net.mrnick01.functionalmachineries.item.ModCreativeModeTab;
import net.mrnick01.functionalmachineries.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FunctionalMachineries.MOD_ID);

    public static final RegistryObject<Block> CHROMITE_ORE = registerBlock("chromite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.FM_TAB);
    public static final RegistryObject<Block> DEEPSLATE_CHROMITE_ORE = registerBlock("deepslate_chromite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.FM_TAB);
    public static final RegistryObject<Block> CHROME_BLOCK = registerBlock("chrome_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.FM_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
