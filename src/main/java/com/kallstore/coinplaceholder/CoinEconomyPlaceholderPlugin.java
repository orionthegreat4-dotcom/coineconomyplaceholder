package com.kallstore.coinplaceholder;

import org.bukkit.plugin.java.JavaPlugin;

public final class CoinEconomyPlaceholderPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        new CoinExpansion().register();
        getLogger().info("Placeholder registered: %coineconomy_balance%");
    }
}
