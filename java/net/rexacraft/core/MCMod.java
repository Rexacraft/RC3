package net.rexacraft.core;

import java.util.Arrays;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.ModMetadata;

public class MCMod extends DummyModContainer
{
	public MCMod(String modid, String name, String version)
	{
		super(new ModMetadata());
		ModMetadata meta = this.getMetadata();
        meta.modId = modid;
        meta.name = name;
        meta.version = version;
        meta.authorList = Arrays.asList(new String[] {"DJ Daemonix", "Superloup10", "Kevin68", "Robin4002"});
	}
}