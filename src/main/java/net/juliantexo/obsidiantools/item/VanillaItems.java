package net.juliantexo.obsidiantools.item;

import net.juliantexo.obsidiantools.ObsidianTools;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class VanillaItems {

    public static final DeferredRegister<Item> VANILLAITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");


    public static void register(IEventBus eventBus){
        VANILLAITEMS.register(eventBus);
    }

}
