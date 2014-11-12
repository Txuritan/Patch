package com.txuritan.patch.core.util;

import java.io.File;

import com.txuritan.patch.Patch;

import net.minecraftforge.common.Configuration;

public class Config
{
	public static void init(File configFile)
	{
		Configuration config = new Configuration(configFile);
		
		config.load();
		
		config.save();
		
	}
}
