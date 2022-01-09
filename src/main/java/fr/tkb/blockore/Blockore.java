package fr.tkb.blockore;

import fr.tkb.blockore.init.ModBlocks;
import net.fabricmc.api.ModInitializer;

public class Blockore implements ModInitializer 
{
	@Override
	public void onInitialize()
	{
		ModBlocks.INSTANCE.registerAll();
	}
}
