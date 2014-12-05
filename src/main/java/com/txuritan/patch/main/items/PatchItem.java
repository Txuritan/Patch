package com.txuritan.patch.main.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.txuritan.patch.main.Info;
import com.txuritan.patch.main.Patch;
import com.txuritan.patch.api.tab.PatchTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PatchItem extends Item
{
	public PatchItem(int id)
	{
		super(id);
		this.setCreativeTab(PatchTab.tabPatch);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Info.MODID + ":" + (this.getUnlocalizedName().substring(5)));
	}
	
	@Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {	
        par3List.add("The cute dragoness");
    }
}
