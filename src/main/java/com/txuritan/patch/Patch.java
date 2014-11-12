package com.txuritan.patch;

import java.util.logging.Logger;

import com.txuritan.patch.core.Plugins;
import com.txuritan.patch.core.ref.Crafting;
import com.txuritan.patch.core.ref.proxy.ProxyCommon;
import com.txuritan.patch.core.util.Config;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(modid = Info.MODID, version = Info.VER, name = Info.NAME, dependencies = Info.DEP)
public class Patch
{
	@SidedProxy(clientSide = Info.CLIENT, serverSide = Info.COMMON)
	public static ProxyCommon proxy;
	
	public static final Logger logger = Logger.getLogger("Patch");
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent p1)
    {
		Config.init(p1.getSuggestedConfigurationFile());
		
		Plugins.preinit(p1);
    }
	
	@EventHandler
    public void init(FMLInitializationEvent p2)
    {
		Plugins.init(p2);
		
		Crafting.recipes();
    }
	
	@EventHandler
    public void postInit(FMLPostInitializationEvent p3)
    {
		Plugins.postinit(p3);
    }
	
}