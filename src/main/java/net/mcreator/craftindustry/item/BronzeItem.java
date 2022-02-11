
package net.mcreator.craftindustry.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.craftindustry.init.CraftindustryModTabs;

public class BronzeItem extends Item {
	public BronzeItem() {
		super(new Item.Properties().tab(CraftindustryModTabs.TAB_CRAFT_INDUSTRY).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("bronze");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
