
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftindustry.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.craftindustry.item.KnifebronzeItem;
import net.mcreator.craftindustry.item.DustcopperItem;
import net.mcreator.craftindustry.item.BronzeItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftindustryModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item KNIFEBRONZE = register(new KnifebronzeItem());
	public static final Item BRONZE = register(new BronzeItem());
	public static final Item DUSTCOPPER = register(new DustcopperItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
