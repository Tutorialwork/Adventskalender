package de.tutorialwork.main;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class Main extends JavaPlugin {

    private static final File dataFile = new File("plugins//Adventskalender//data.yml");
    private static final YamlConfiguration dataConfig = YamlConfiguration.loadConfiguration(dataFile);

    private static final File configFile = new File("plugins//Adventskalender//config.yml");

    public static String Prefix;

    @Override
    public void onEnable() {
        getCommand("adventskalender").setExecutor(new AdventCalendar());
        Bukkit.getPluginManager().registerEvents(new AdventCalendar(), this);

        File folder = new File("plugins//Adventskalender");
        if (!folder.exists()) {
            folder.mkdir();
        }

        try {
            loadConfiguration();
            Prefix = getConfig().getString("Prefix").replace("&", "§");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads the plugin & data configuration
     */
    public void loadConfiguration() throws IOException {
        if (!configFile.exists())
            saveDefaultConfig();
        if (!dataFile.exists())
            dataFile.createNewFile();
    }

    /**
     * Builds an item by the material, amount
     * @param material The material of the item
     * @param amount The item amount
     * @param displayName The name of the item
     * @return The built item
     */
    public static ItemStack createItem(Material material, int amount, String displayName) {
        ItemStack i = new ItemStack(material, amount);
        ItemMeta m = i.getItemMeta();
        m.setDisplayName(displayName);
        i.setItemMeta(m);

        return i;
    }


    /**
     * Sets the provided day used for a user
     * @param uuid The uuid of the player whose day should be used
     * @param day The day which the user clicked
     */
    public static void setUsed(UUID uuid, int day) {
        dataConfig.set(uuid + ".day" + day, true);
        try {
            dataConfig.save(dataFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Checks if the user has already used the day
     * @param uuid The uuid of the player to check
     * @param day The day to be checked
     * @return <b>true</b> if the day has been used, <b>false</b> otherwise
     */
    public static boolean hasUsed(UUID uuid, int day) {
        if (dataConfig.getString(uuid + ".day" + day) != null) {
            if (dataConfig.getBoolean(uuid + ".day" + day) == true) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
