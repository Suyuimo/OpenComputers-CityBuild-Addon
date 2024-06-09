package de.suyuimo.opencomputerscitybildaddon.blocks;

import de.suyuimo.opencomputerscitybildaddon.OpenComputers_CityBild_Addon;
import de.suyuimo.opencomputerscitybildaddon.items.ItemManager;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Properties;
import java.util.function.Supplier;

public class BlockManager {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OpenComputers_CityBild_Addon.MODID);











    private static <T extends Block> RegistryObject<T> registerBlock(String blockId, Supplier<T> block) {
        RegistryObject<T> blockToReturn = BLOCKS.register(blockId, block);
        registerBlockItem(blockId, blockToReturn);
        return blockToReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String blockId, RegistryObject<T> block) {
        return ItemManager.ITEMS.register(blockId,
                () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}

