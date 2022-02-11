
package net.mcreator.craftindustry.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class DustcopperItem extends Item {
	public DustcopperItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("dustcopper");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
