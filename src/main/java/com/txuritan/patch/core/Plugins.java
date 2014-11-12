package com.txuritan.patch.core;

import com.txuritan.patch.core.plugins.*;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Plugins
{
	public static void preinit(FMLPreInitializationEvent p1)
	{
		if (Loader.isModLoaded("GregTech"))
		{
			GregTech.disable();
		}
		
		//Minecraft.recipes();
	}
	public static void init(FMLInitializationEvent p2)
	{
		
	}
	public static void postinit(FMLPostInitializationEvent p3)
	{
		
	}
}
