package net.juliantexo.obsidiantools;

import com.mojang.logging.LogUtils;
import net.juliantexo.obsidiantools.block.VanillaBlocks;
import net.juliantexo.obsidiantools.item.ModItems;
import net.juliantexo.obsidiantools.item.VanillaItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ObsidianTools.MOD_ID)
public class ObsidianTools
{
    public static final String MOD_ID = "obsidiantools";
    private static final Logger LOGGER = LogUtils.getLogger();
    public ObsidianTools()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //new mod stuff
        ModItems.register(modEventBus);

        //overridden vanilla stuff
        VanillaItems.register(modEventBus);
        VanillaBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        }
    }
}
