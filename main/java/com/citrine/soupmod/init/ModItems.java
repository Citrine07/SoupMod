package com.citrine.soupmod.init;

import java.util.ArrayList;
import java.util.List;

import com.citrine.soupmod.items.food.SoupBase;

import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//soups
	public static final Item BEEF_STEW = new SoupBase("beef_stew", 10, 15.0f, false, Items.BOWL);
	
}
