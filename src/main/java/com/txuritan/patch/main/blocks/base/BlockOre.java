package com.txuritan.patch.main.blocks.base;

import com.txuritan.patch.main.Info;
import com.txuritan.patch.api.tab.PatchTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockOre extends Block
{
	public BlockOre(int id, Material par2)
    {
		super(id, par2);
		this.setCreativeTab(PatchTab.tabPatch);
		this.setStepSound(soundStoneFootstep);
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(Info.MODID + ":" + "ore/" + (this.getUnlocalizedName().substring(5)));
	}
}
