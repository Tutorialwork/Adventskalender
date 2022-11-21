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

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AdventCalendar implements CommandExecutor, Listener {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player p = (Player) sender;
        DateTimeFormatter monat = DateTimeFormatter.ofPattern("MM");
        DateTimeFormatter tag = DateTimeFormatter.ofPattern("dd");
        LocalDateTime now = LocalDateTime.now();
        if(monat.format(now).equals("12")){
            //Ist Dezember
            Inventory inv = Bukkit.createInventory(p, 27, "§aAdventskalender");
            String debug = "01"; //Debugstring
            if(tag.format(now).equals("01")){
                inv.setItem(0, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 1"));
            } else {
                inv.setItem(0, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 1"));
            }
            if(tag.format(now).equals("02")){
                inv.setItem(1, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 2"));
            } else {
                inv.setItem(1, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 2"));
            }
            if(tag.format(now).equals("03")){
                inv.setItem(2, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 3"));
            } else {
                inv.setItem(2, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 3"));
            }
            if(tag.format(now).equals("04")){
                inv.setItem(3, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 4"));
            } else {
                inv.setItem(3, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 4"));
            }
            if(tag.format(now).equals("05")){
                inv.setItem(4, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 5"));
            } else {
                inv.setItem(4, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 5"));
            }
            if(tag.format(now).equals("06")){
                inv.setItem(5, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 6"));
            } else {
                inv.setItem(5, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 6"));
            }
            if(tag.format(now).equals("07")){
                inv.setItem(6, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 7"));
            } else {
                inv.setItem(6, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 7"));
            }
            if(tag.format(now).equals("08")){
                inv.setItem(7, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 8"));
            } else {
                inv.setItem(7, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 8"));
            }
            if(tag.format(now).equals("09")){
                inv.setItem(8, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 9"));
            } else {
                inv.setItem(8, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 9"));
            }
            if(tag.format(now).equals("10")){
                inv.setItem(9, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 10"));
            } else {
                inv.setItem(9, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 10"));
            }
            if(tag.format(now).equals("11")){
                inv.setItem(10, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 11"));
            } else {
                inv.setItem(10, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 11"));
            }
            if(tag.format(now).equals("12")){
                inv.setItem(11, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 12"));
            } else {
                inv.setItem(11, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 12"));
            }
            if(tag.format(now).equals("13")){
                inv.setItem(12, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 13"));
            } else {
                inv.setItem(12, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 13"));
            }
            if(tag.format(now).equals("14")){
                inv.setItem(13, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 14"));
            } else {
                inv.setItem(13, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 14"));
            }
            if(tag.format(now).equals("15")){
                inv.setItem(14, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 15"));
            } else {
                inv.setItem(14, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 15"));
            }
            if(tag.format(now).equals("16")){
                inv.setItem(15, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 16"));
            } else {
                inv.setItem(15, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 16"));
            }
            if(tag.format(now).equals("17")){
                inv.setItem(16, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 17"));
            } else {
                inv.setItem(16, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 17"));
            }
            if(tag.format(now).equals("18")){
                inv.setItem(17, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 18"));
            } else {
                inv.setItem(17, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 18"));
            }
            if(tag.format(now).equals("19")){
                inv.setItem(18, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 19"));
            } else {
                inv.setItem(18, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 19"));
            }
            if(tag.format(now).equals("20")){
                inv.setItem(19, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 20"));
            } else {
                inv.setItem(19, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 20"));
            }
            if(tag.format(now).equals("21")){
                inv.setItem(20, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 21"));
            } else {
                inv.setItem(20, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 21"));
            }
            if(tag.format(now).equals("22")){
                inv.setItem(21, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 22"));
            } else {
                inv.setItem(21, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 22"));
            }
            if(tag.format(now).equals("23")){
                inv.setItem(22, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 23"));
            } else {
                inv.setItem(22, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 23"));
            }
            if(tag.format(now).equals("24")){
                inv.setItem(23, Main.createItem(Material.IRON_DOOR, 1, 0, "§a§lTag 24"));
            } else {
                inv.setItem(23, Main.createItem(Material.WOOD_DOOR, 1, 0, "§cTag 24"));
            }
            p.openInventory(inv);
        } else {
            p.sendMessage(Main.Prefix+"§cEs ist derzeit keine Adventszeit");
        }
        return false;
    }

    @EventHandler
    public void onClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        if(e.getClickedInventory() != null){
            if(e.getClickedInventory().getName().equals("§aAdventskalender")){
                e.setCancelled(true);
                if(e.getCurrentItem().getType() == Material.IRON_DOOR){
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("1")){
                        //Tag 1
                        if(!Main.hasUsed(p.getUniqueId().toString(), 1)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.1").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "1");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("2")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 2)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.2").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "2");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("3")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 3)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.3").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "3");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("4")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 4)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.4").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "4");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("5")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 5)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.5").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "5");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("6")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 6)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.6").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "6");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("7")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 7)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.7").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "7");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("8")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 8)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.8").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "8");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("9")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 9)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.9").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "9");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("10")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 10)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.10").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "10");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("11")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 11)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.11").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "11");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("12")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 12)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.12").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "12");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("13")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 13)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.13").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "13");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("14")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 14)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.14").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "14");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("15")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 15)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.15").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "15");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("16")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 16)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.16").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "16");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("17")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 17)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.17").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "17");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("18")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 18)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.18").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "18");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("19")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 19)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.19").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "19");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("20")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 20)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.20").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "20");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("21")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 21)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.21").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "21");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("22")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 22)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.22").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "22");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("23")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 23)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.23").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "23");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                    if(e.getCurrentItem().getItemMeta().getDisplayName().contains("24")){
                        if(!Main.hasUsed(p.getUniqueId().toString(), 24)){
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), Main.configcfg.getString("Reward.24").replace("%player%", p.getName()));
                            p.closeInventory();
                            String MSG = Main.configcfg.getString("RewardMSG");
                            MSG = MSG.replace("%day%", "24");
                            p.sendMessage(Main.Prefix+ ChatColor.translateAlternateColorCodes('&', MSG));
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
                            Main.setUsed(p.getUniqueId().toString(), 1);
                        } else {
                            p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("AlreadyEarned")));
                        }
                    }
                } else {
                    p.closeInventory();
                    p.sendMessage(Main.Prefix+ChatColor.translateAlternateColorCodes('&', Main.configcfg.getString("NotCurrentDay")));
                }
            }
        }
    }
}
