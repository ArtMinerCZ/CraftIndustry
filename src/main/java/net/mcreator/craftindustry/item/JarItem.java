
package net.mcreator.craftindustry.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class JarItem extends Item {
	public JarItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("jar");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
