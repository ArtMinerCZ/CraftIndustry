
package net.mcreator.craftindustry.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.craftindustry.init.CraftindustryModTabs;

public class BurgerBunItem extends Item {
	public BurgerBunItem() {
		super(new Item.Properties().tab(CraftindustryModTabs.TAB_CRAFT_INDUSTRY_COOKING).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.6f)

						.build()));
		setRegistryName("burger_bun");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 40;
	}
}
