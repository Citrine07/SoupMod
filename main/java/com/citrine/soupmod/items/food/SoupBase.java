package com.citrine.soupmod.items.food;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

public class SoupBase extends FoodBase
{
	private Item ReturnStack;
	
	public SoupBase(String name, int amount, float saturation, boolean isAnimalFood, Item item) 
	{
		super(name, amount, saturation, isAnimalFood);
		this.setMaxStackSize(1);
		this.ReturnStack = item;
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World world, EntityLivingBase living)
	{
		super.onItemUseFinish(stack, world, living);
		return new ItemStack(ReturnStack);
	}
}
