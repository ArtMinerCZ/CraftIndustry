
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftindustry.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.craftindustry.item.TomatoItem;
import net.mcreator.craftindustry.item.OnionItem;
import net.mcreator.craftindustry.item.KnifebronzeItem;
import net.mcreator.craftindustry.item.JarItem;
import net.mcreator.craftindustry.item.DustcopperItem;
import net.mcreator.craftindustry.item.ChillPepperItem;
import net.mcreator.craftindustry.item.BurgerBunItem;
import net.mcreator.craftindustry.item.BronzeItem;
import net.mcreator.craftindustry.item.BorgirItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftindustryModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item BRONZE = register(new BronzeItem());
	public static final Item DUSTCOPPER = register(new DustcopperItem());
	public static final Item KNIFEBRONZE = register(new KnifebronzeItem());
	public static final Item TOMATO = register(new TomatoItem());
	public static final Item ONION = register(new OnionItem());
	public static final Item CHILL_PEPPER = register(new ChillPepperItem());
	public static final Item BURGER_BUN = register(new BurgerBunItem());
	public static final Item JAR = register(new JarItem());
	public static final Item CUPBOARD = register(CraftindustryModBlocks.CUPBOARD, CraftindustryModTabs.TAB_CRAFT_INDUSTRY);
	public static final Item STOVEWOOD = register(CraftindustryModBlocks.STOVEWOOD, CraftindustryModTabs.TAB_CRAFT_INDUSTRY_COOKING);
	public static final Item BORGIR = register(new BorgirItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
