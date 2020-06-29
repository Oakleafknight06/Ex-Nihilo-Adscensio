package com.oakleafknight.exnihiloadscensio;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ExNihiloAdscensio.MODID)
public class ExNihiloAdscensio {

    public static final String MODID = "exnihiloadscensio";

    private static final Logger LOGGER = LogManager.getLogger();

    public ExNihiloAdscensio() {
        LOGGER.debug("Hello from Ex Nihilo!");
    }

}
