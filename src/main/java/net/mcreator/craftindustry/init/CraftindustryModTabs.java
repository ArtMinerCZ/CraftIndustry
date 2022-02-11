
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftindustry.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CraftindustryModTabs {
	public static CreativeModeTab TAB_CRAFT_INDUSTRY;

	public static void load() {
		TAB_CRAFT_INDUSTRY = new CreativeModeTab("tabcraft_industry") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.COPPER_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
