package de.tutorialwork.main;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main extends JavaPlugin {

    private static final File dataFile = new File("plugins//Adventskalender//data.yml");
    private static final YamlConfiguration dataConfig = YamlConfiguration.loadConfiguration(dataFile);

    private static final File configFile = new File("plugins//Adventskalender//config.yml");
    private static FileConfiguration config;

    private static String prefix;

    @Override
    public void onEnable() {
        getCommand("adventskalender").setExecutor(new AdventCalendar());
        Bukkit.getPluginManager().registerEvents(new AdventCalendar(), this);

        File folder = new File("plugins//Adventskalender");
        if (!folder.exists()) folder.mkdir();

        try {
            loadConfiguration();
            prefix = getConfig().getString("Prefix").replace("&", "§");
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

        config = getConfig();

        if (!dataFile.exists())
            dataFile.createNewFile();
    }

    /**
     * Gets the prefix of the plugin
     *
     * @return The prefix of the plugin
     */
    public static String getPrefix() {
        return prefix;
    }

    /**
     * Gets a string from the config
     *
     * @param path The path of the config string to look for
     * @return The value of the config string
     */
    public static String getConfigString(String path) {
        return config.getString(path);
    }

    /**
     * Gets the reward commands
     *
     * @param day The day to get
     * @return All commands to run at the provided day
     */
    public static List<String> getRewardCommands(int day) {
        return config.isString("Reward." + day) ? Collections.singletonList(config.getString("Reward." + day))
                : config.getStringList("Reward." + day);
    }

    /**
     * Sets the provided day used for a user
     *
     * @param uuid The uuid of the player whose day should be used
     * @param day  The day which the user clicked
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
     *
     * @param uuid The uuid of the player to check
     * @param day  The day to be checked
     * @return <b>true</b> if the day has been used, <b>false</b> otherwise
     */
    public static boolean hasUsed(UUID uuid, int day) {
        if (dataConfig.getString(uuid + ".day" + day) == null) return false;

        return dataConfig.getBoolean(uuid + ".day" + day);
    }
}
