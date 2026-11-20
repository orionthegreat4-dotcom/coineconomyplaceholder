package com.kallstore.coinplaceholder;

import com.kallstore.coineconomy.CoinEconomyPlugin;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;

import java.text.DecimalFormat;

public final class CoinExpansion extends PlaceholderExpansion {
    @Override public String getIdentifier() { return "coineconomy"; }
    @Override public String getAuthor() { return "ServerAdmin"; }
    @Override public String getVersion() { return "1.0.0"; }
    @Override public boolean persist() { return true; }

    @Override
    public String onRequest(OfflinePlayer player, String params) {
        if (player == null || player.getUniqueId() == null) return "";
        if (!params.equalsIgnoreCase("balance")) return null;

        CoinEconomyPlugin coin = CoinEconomyPlugin.getInstance();
        if (coin == null || coin.getEconomyManager() == null) return "0";

        double balance = coin.getEconomyManager().getBalance(player.getUniqueId());
        return new DecimalFormat("#,##0.##").format(balance);
    }
}
