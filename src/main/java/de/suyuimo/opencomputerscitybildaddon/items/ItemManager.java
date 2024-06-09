package de.suyuimo.opencomputerscitybildaddon.items;

import de.suyuimo.opencomputerscitybildaddon.OpenComputers_CityBild_Addon;
import de.suyuimo.opencomputerscitybildaddon.blocks.BlockManager;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemManager {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OpenComputers_CityBild_Addon.MODID);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
