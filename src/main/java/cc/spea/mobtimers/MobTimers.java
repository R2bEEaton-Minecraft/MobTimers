package cc.spea.mobtimers;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MobTimers implements ModInitializer {
	public static final String MOD_ID = "mob-timers";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		AutoConfig.register(ModConfig.class, Toml4jConfigSerializer::new);
	}
}