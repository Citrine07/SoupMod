package com.citrine.soupmod.items.food;

import com.citrine.soupmod.Main;
import com.citrine.soupmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class FoodEffectBase extends FoodBase
{
	PotionEffect effect;
	
	public FoodEffectBase(String name, int amount, float saturation, boolean isAnimalFood, PotionEffect effect) 
	{
		super(name, amount, saturation, isAnimalFood);
		setAlwaysEdible();
		
		this.effect = effect;
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) 
	{
		if(!worldIn.isRemote) 
		{
			player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));
		}
	}
}