
package net.mcreator.craftindustry.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.craftindustry.init.CraftindustryModTabs;

public class TomatoItem extends Item {
	public TomatoItem() {
		super(new Item.Properties().tab(CraftindustryModTabs.TAB_CRAFT_INDUSTRY_COOKING).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.3f)

						.build()));
		setRegistryName("tomato");
	}
}
