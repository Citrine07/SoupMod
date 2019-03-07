package com.citrine.soupmod;

import com.citrine.soupmod.init.ModRecipes;
import com.citrine.soupmod.proxy.CommonProxy;
import com.citrine.soupmod.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) 
	{
		ModRecipes.init();
	}
	
	@EventHandler
	public static void init(FMLPostInitializationEvent event) 
	{
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) 
	{
		
	}
}