package com.txuritan.patch.main.ref.proxy;

import net.minecraftforge.common.MinecraftForge;

import com.txuritan.patch.main.lib.handlers.CapeEventHandler;
import com.txuritan.patch.main.ref.proxy.ProxyCommon;

public class ProxyClient extends ProxyCommon
{
	@Override
	public void init()
	{
		MinecraftForge.EVENT_BUS.register(new CapeEventHandler());
	}
}
