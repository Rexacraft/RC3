package net.rexacraft.core.common;

import net.rexacraft.core.proxy.CommonProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RC3_Core.MODID, name = "RC3 Core", version = "@VERSION@")
public class RC3_Core
{
    public static final String MODID = "RC3_Core";
    
    @Instance("RC3_Core")
    public static RC3_Core instance;
    
    @SidedProxy(clientSide="net.rexacraft.core.proxy.ClientProxy",serverSide="net.rexacraft.core.proxy.ServerProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRender();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}