package com.illhunter.craftablebedrock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemTool;

public class BedrockPickaxe extends ItemTool {
	
	public static final Block[] blocksBPEffectiveAgainst = new Block[] {Block.bedrock};
	
	public BedrockPickaxe(int par1, float par2, EnumToolMaterial par3EnumToolMaterial, Block[] par4ArrayOfBlock) {
		super(par1, 4.0F, EnumToolMaterial.STONE, blocksBPEffectiveAgainst);
		maxStackSize = 1;
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("bedrockPickaxe");
        setTextureName("craftablebedrock:bedrockPickaxe");
	}
}
