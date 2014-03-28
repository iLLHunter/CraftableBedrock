package com.illhunter.craftablebedrock;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
//import cpw.mods.fml.common.Mod.PreInit;    // used in 1.5.2
//import cpw.mods.fml.common.Mod.Init;       // used in 1.5.2
//import cpw.mods.fml.common.Mod.PostInit;   // used in 1.5.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
//import cpw.mods.fml.common.network.NetworkMod; // not used in 1.7
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid="CraftableBedrock", name="Craftable Bedrock", version="0.1.0")
public class CraftableBedrock {
	// The instance of your mod that Forge uses.
    @Instance(value = "CraftableBedrock")
    public static CraftableBedrock instance;
    
    public static Item bedrockPickaxe;
    
    public static final Block[] blocksBPEffectiveAgainst = new Block[] {Block.bedrock};
    
    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="com.illhunter.craftablebedrock.client.ClientProxy", serverSide="com.illhunter.craftablebedrock.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler // used in 1.6.2
    //@PreInit    // used in 1.5.2
    public void preInit(FMLPreInitializationEvent event) {
    			bedrockPickaxe = new BedrockPickaxe(13613, 4.0F, EnumToolMaterial.STONE, blocksBPEffectiveAgainst);
    }
    
    @EventHandler // used in 1.6.2
    //@Init       // used in 1.5.2
    public void load(FMLInitializationEvent event) {
            proxy.registerRenderers();
          //Craftable Bedrock
            ItemStack diamondBlockSingle = new ItemStack(Block.blockDiamond);
            ItemStack obsidianSingle = new ItemStack(Block.obsidian);
            ItemStack bedrockSingle = new ItemStack(Block.bedrock);
            
            GameRegistry.addRecipe(bedrockSingle, "yxy", "xyx", "yxy",
                    'x', diamondBlockSingle, 'y', obsidianSingle);
            
            //Bedrock Pickaxe
            LanguageRegistry.addName(bedrockPickaxe, "Bedrock Pickaxe");
            ItemStack stickSingle = new ItemStack(Item.stick);
            ItemStack bedrockPickaxeSingle = new ItemStack(bedrockPickaxe);
            
            GameRegistry.addRecipe(bedrockPickaxeSingle, "xxx", " y ", " y ",
                    'x', bedrockSingle, 'y', stickSingle);

}
    
    @EventHandler // used in 1.6.2
    //@PostInit   // used in 1.5.2
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }
}