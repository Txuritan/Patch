package com.txuritan.patch.main.util;

import java.io.File;

import com.txuritan.patch.main.Patch;
import com.txuritan.patch.main.blocks.BlocksIDs;

import cpw.mods.fml.common.Loader;
import net.minecraftforge.common.Configuration;

public class BlockConfig
{
	public static void init(File configFile)
	{
		Configuration config = new Configuration((new File(Loader.instance().getConfigDir(), "Txuritan/Patch-Blocks.cfg")));
		
		config.load();
		
		BlocksIDs.oreChromedigizoidID = config.getBlock("Chromedigizoid Ore", 2001).getInt();
		BlocksIDs.oreCopperID = config.getBlock("Copper Ore", 2002).getInt();
		BlocksIDs.oreLeadID = config.getBlock("Lead Ore", 2003).getInt();
		BlocksIDs.oreMagiciteID = config.getBlock("Magicite Ore", 2004).getInt();
		BlocksIDs.oreMechaID = config.getBlock("Mecha Ore", 2005).getInt();
		BlocksIDs.oreMeowiumID = config.getBlock("Meowium Ore", 2006).getInt();
		
		config.save();
	}
}
