package com.txuritan.patch.main.util;

import java.io.File;

import com.txuritan.patch.main.Patch;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;

public class CoreConfig
{
	public static boolean test;
	
	public static void init(File configFile)
	{
		Configuration config = new Configuration((new File(Loader.instance().getConfigDir(), "Txuritan/Patch-Core.cfg")));
		
		config.load();
		
		test = config.get(config.CATEGORY_GENERAL, "Test Boolean", true).getBoolean(false);
		
		config.save();
	}
	
	public static void logger()
	{
		if(test)
		{
			Patch.logger.setParent(FMLCommonHandler.instance().getFMLLogger());
			Patch.logger.info("Test boolean works");
		}
	}
}
