package de.tutorialwork.main;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

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
        if(!folder.exists()){
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

    public static ItemStack createItem(Material material, int anzahl, int subid, String displayname)
    {
        short neuesubid = (short)subid;
        ItemStack i = new ItemStack(material, anzahl, neuesubid);
        ItemMeta m = i.getItemMeta();
        m.setDisplayName(displayname);
        i.setItemMeta(m);

        return i;
    }

    public static void setUsed(String UUID, int Day){
        dataConfig.set(UUID+".day"+Day, true);
        try {
            dataConfig.save(dataFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean hasUsed(String UUID, int Day){
        if(dataConfig.getString(UUID+".day"+Day) != null){
            if(dataConfig.getBoolean(UUID+".day"+Day) == true){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
