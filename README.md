# CoinEconomyPlaceholder

Adds `%coineconomy_balance%` for PlaceholderAPI using CoinEconomy's public
`CoinEconomyPlugin.getInstance().getEconomyManager().getBalance(UUID)` API.

## Build
1. Install JDK 21 and Maven.
2. Put the supplied `CoinEconomy-1.0.0.jar` in `libs/`.
3. Run `mvn clean package`.
4. Copy `target/CoinEconomyPlaceholder-1.0.0.jar` into the server's `plugins/`.
5. Ensure CoinEconomy and PlaceholderAPI are also in `plugins/`, then fully restart.

Test: `/papi parse me %coineconomy_balance%`

AuraSkills global format:
`<gold>⛁: %coineconomy_balance%$`

The original CoinEconomy jar is a required compile-time library and is not bundled
into this plugin. Keep the same compatible CoinEconomy version installed.
