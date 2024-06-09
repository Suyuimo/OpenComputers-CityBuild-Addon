package de.suyuimo.opencomputerscitybildaddon;


import de.suyuimo.opencomputerscitybildaddon.blocks.BlockManager;
import de.suyuimo.opencomputerscitybildaddon.items.ItemManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(OpenComputers_CityBild_Addon.MODID)
public class OpenComputers_CityBild_Addon {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "opencomputers_citybild_addon";
    private static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    public OpenComputers_CityBild_Addon() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockManager.register(modEventBus);
        ItemManager.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }


}
