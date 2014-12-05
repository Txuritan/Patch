package com.txuritan.patch.api.tile.tools.pickaxe;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

import com.txuritan.patch.api.tab.PatchTab;
import com.txuritan.patch.api.tile.items.coal.ITileCoal;
import com.txuritan.patch.main.blocks.Blocks;

public class TilePickaxe extends ItemPickaxe implements ITilePickaxe
{
	public TilePickaxe(int id, EnumToolMaterial material)
    {
        super(id, material);
        this.setCreativeTab(PatchTab.tabPatch);
    }

	public boolean canHarvestBlock(Block par1Block)
    {
        return par1Block == Block.obsidian ?
        this.toolMaterial.getHarvestLevel() == 3 :
        	(par1Block != Blocks.oreCopper ? (par1Block.blockMaterial == Material.rock ? true : (par1Block.blockMaterial == Material.iron ? true : par1Block.blockMaterial == Material.anvil)) :
        			this.toolMaterial.getHarvestLevel() >= 2) ;  
    }
}
