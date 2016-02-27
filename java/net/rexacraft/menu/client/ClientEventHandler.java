package net.rexacraft.menu.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class ClientEventHandler
{
    private final Minecraft mc = Minecraft.getMinecraft();

    @SubscribeEvent
    public void onClientTick(TickEvent.ClientTickEvent event)
    {
        if(event.phase == TickEvent.Phase.END)
        {
            if(this.mc.currentScreen != null && this.mc.currentScreen.getClass().equals(GuiMainMenu.class))
            {
                this.mc.displayGuiScreen(new NewMainMenu());
            }
        }
    }
}
