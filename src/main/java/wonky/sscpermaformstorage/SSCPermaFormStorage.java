package wonky.sscpermaformstorage;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import wonky.sscpermaformstorage.item.ModItems;

public class SSCPermaFormStorage implements ModInitializer {
	public static final String MOD_ID = "ssc-perma-form-storage";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}