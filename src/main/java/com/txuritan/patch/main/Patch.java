package com.txuritan.patch.main;

import java.util.logging.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.txuritan.patch.main.blocks.Blocks;
import com.txuritan.patch.main.items.Items;
import com.txuritan.patch.main.lib.EventManager;
import com.txuritan.patch.main.lib.handlers.CoalIngotHandler;
import com.txuritan.patch.main.ref.Crafting;
import com.txuritan.patch.main.ref.proxy.ProxyCommon;
import com.txuritan.patch.main.util.BlockConfig;
import com.txuritan.patch.main.util.CoreConfig;
import com.txuritan.patch.main.util.ItemConfig;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(modid = Info.MODID, version = Info.VER, name = Info.NAME, dependencies = Info.DEP)
public class Patch
{
	@SidedProxy(clientSide = Info.CLIENT, serverSide = Info.COMMON)
	public static ProxyCommon proxy;
	
	public static final Logger logger = Logger.getLogger("Patch");
	
	@Mod.Metadata(Info.MODID)
	public static ModMetadata metadata;
	
	EventManager eventmanager = new EventManager();
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent p1)
    {	
		CoreConfig.init(p1.getSuggestedConfigurationFile());
		
		BlockConfig.init(p1.getSuggestedConfigurationFile());
		
		ItemConfig.init(p1.getSuggestedConfigurationFile());
		
		Blocks.bregistry();
		
		Items.iregistry();
		
		proxy.init();
    }
	
	@EventHandler
    public void init(FMLInitializationEvent p2)
    {
		Crafting.recipes();
		
		GameRegistry.registerFuelHandler(new CoalIngotHandler());
		
		GameRegistry.registerWorldGenerator(eventmanager);
		
		CoreConfig.logger();
    }
	
	@EventHandler
    public void postInit(FMLPostInitializationEvent p3)
    {
		
    }
	
}