
package net.mcreator.craftindustry.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;

public class BorgirItem extends Item {
	public BorgirItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(63).rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(14).saturationMod(8f)

						.build()));
		setRegistryName("borgir");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 40;
	}
}
