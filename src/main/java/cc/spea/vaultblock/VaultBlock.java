package cc.spea.vaultblock;

import cc.spea.vaultblock.block.ModBlocks;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VaultBlock implements ModInitializer {
    public static final String MOD_ID = "vaultblock";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");

        ModBlocks.registerModBlocks();
    }
}