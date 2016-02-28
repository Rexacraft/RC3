package net.rexacraft.menu.common;

import net.minecraftforge.common.MinecraftForge;
import net.rexacraft.core.MCMod;
import net.rexacraft.core.common.RC3_Core;
import net.rexacraft.menu.client.ClientEventHandler;
import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = RC3_Menu.MODID, name = "RC3 Menu", version = "@VERSION@", dependencies = "required-after:" + RC3_Core.MODID + ";")
public class RC3_Menu extends MCMod
{
    public static final String MODID = "RC3_Menu";
    
    public RC3_Menu()
    {
		super(MODID, "RC3 Menu", "@VERSION@");
	}
    
    @Instance("RC3_Menu")
    public static RC3_Menu instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        if(event.getSide() == Side.CLIENT)
        {
            MinecraftForge.EVENT_BUS.register(new ClientEventHandler());
            FMLCommonHandler.instance().bus().register(new ClientEventHandler());
        }
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}