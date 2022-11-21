package de.tutorialwork.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Calendar;
import java.util.Date;

public class AdventCalendar implements CommandExecutor, Listener {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());

        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        Inventory inv = Bukkit.createInventory(null, 27, "§aAdventskalender");

        if (month != 12) {
            player.sendMessage(Main.getPrefix() + "§cEs ist derzeit keine Adventszeit");
            return false;
        }

        for (int i = 0; i < 24; i++) {
            inv.setItem(i, createItem(day == i + 1 ? Material.IRON_DOOR : Material.OAK_DOOR,
                    (day == i + 1 ? "§a§l" : "§c") + "Tag " + (i + 1)));
        }

        player.openInventory(inv);

        return false;
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();

        if (event.getClickedInventory() == null || event.getCurrentItem() == null) return;
        if (!event.getView().getTitle().equals("§aAdventskalender")) return;

        event.setCancelled(true);
        player.closeInventory();

        if (event.getCurrentItem().getType() == Material.IRON_DOOR) {
            int day = event.getSlot() + 1;
            if (day > 24) return;

            if (Main.hasUsed(player.getUniqueId(), day)) {
                player.sendMessage(Main.getPrefix() + replaceColorCodes(Main.getConfigString("AlreadyEarned")));
                return;
            }

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(),
                    Main.getConfigString("Reward." + day).replace("%player%", player.getName()));

            player.sendMessage(Main.getPrefix() + replaceColorCodes(Main.getConfigString("RewardMSG")
                    .replace("%day%", "" + day)));

            player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1, 1);
            Main.setUsed(player.getUniqueId(), day);
        } else {
            player.sendMessage(Main.getPrefix() + replaceColorCodes(Main.getConfigString("NotCurrentDay")));
        }
    }

    /**
     * Replaces the color codes in a message
     *
     * @param message The message to replace the color codes in
     * @return The new message
     */
    public String replaceColorCodes(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    /**
     * Builds an item by the material, amount
     * @param material The material of the item
     * @param displayName The name of the item
     * @return The built item
     */
    public ItemStack createItem(Material material, String displayName) {
        ItemStack i = new ItemStack(material);
        ItemMeta m = i.getItemMeta();
        m.setDisplayName(displayName);
        i.setItemMeta(m);

        return i;
    }
}
