
package net.mcreator.craftindustry.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.craftindustry.procedures.ChillPepperEatenProcedure;
import net.mcreator.craftindustry.init.CraftindustryModTabs;

public class ChillPepperItem extends Item {
	public ChillPepperItem() {
		super(new Item.Properties().tab(CraftindustryModTabs.TAB_CRAFT_INDUSTRY_COOKING).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.5f)

						.build()));
		setRegistryName("chill_pepper");
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ChillPepperEatenProcedure.execute(entity);
		return retval;
	}
}
