package net.juliantexo.obsidiantools.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier OBSIDIAN = new ForgeTier(4, 2031, 12.0F, 4.0f, 15, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.OBSIDIAN));
}
