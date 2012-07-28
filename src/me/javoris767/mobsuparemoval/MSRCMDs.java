package me.javoris767.mobsuparemoval;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MSRCMDs implements CommandExecutor {
	String noPerm = "[" + ChatColor.DARK_GREEN + "MSR" + ChatColor.WHITE + "]" + ChatColor.RED + " You do not have permission for this";
	public static MSR plugin;
	public MSRCMDs(MSR msr) {
		plugin = msr;
	}
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (sender instanceof Player) {
            if (args.length < 1) {
                sender.sendMessage("[" + ChatColor.DARK_GREEN + "MSR" + ChatColor.WHITE + "]" + ChatColor.GOLD + " Usage: /msr help");
            }
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("help")) {
                    if (sender.hasPermission("msr.help")) {
                    sender.sendMessage(ChatColor.GOLD + "-------------------*MobSupaRemoval*-----------------");
                    sender.sendMessage(ChatColor.GOLD + "1. /msr help - Shows help page.");
                    sender.sendMessage(ChatColor.GOLD + "2. /msr reload - Reloads the config.");
                    sender.sendMessage(ChatColor.GOLD + "2. /msr about - Plugin info.");
                    sender.sendMessage(ChatColor.GOLD + "2. /msr config - Shows what you have false or true!.");
                    sender.sendMessage(ChatColor.GOLD + "---------------------------------------------------");
                    return true;
                    } else {
                        sender.sendMessage("[" + ChatColor.DARK_GREEN + "MSR" + ChatColor.WHITE + "]" + ChatColor.RED + " You do not have permission for this");
                    }
                }
                if (args[0].equalsIgnoreCase("reload")) {
                    if (sender.hasPermission("msr.reload")) {
                    plugin.reloadConfig();
                    plugin.saveConfig();
                    plugin.getPluginLoader().disablePlugin(plugin);
                    plugin.getPluginLoader().enablePlugin(plugin);
                    sender.sendMessage("[" + ChatColor.DARK_GREEN + "MSR" + ChatColor.WHITE + "]" + ChatColor.GOLD + " Config reload complete!");
                    return true;
                    } else {
                        sender.sendMessage("[" + ChatColor.DARK_GREEN + "MSR" + ChatColor.WHITE + "]" + ChatColor.RED + " You do not have permission for this");
                    }
                }
                if (args[0].equalsIgnoreCase("config")) {
                	if (sender.hasPermission("msr.config")) {
                    	sender.sendMessage(ChatColor.DARK_GREEN + "NormalWorld:");
                    	//sender.sendMessage("Chicken Allowed: " + plugin.chicken + " | Cow Allowed: " + plugin.cow);
                    	sender.sendMessage("Chicken Allowed: " + ((plugin.chicken) ? ChatColor.GREEN+"True" : ChatColor.RED+"False") + ChatColor.GOLD + " | " +ChatColor.WHITE + "Cow Allowed: " + ((plugin.cow) ? ChatColor.GREEN+"True" : ChatColor.RED+"False"));

                    	//sender.sendMessage("MooshroomCow Allowed: " + plugin.mooshroom + " | Pig Allowed: " + plugin.pig);
                    	sender.sendMessage("MooshroomCow Allowed: " + ((plugin.mooshroom) ? ChatColor.GREEN+"True" : ChatColor.RED+"False") + ChatColor.GOLD + " | " +ChatColor.WHITE + "Pig Allowed: " + ((plugin.pig) ? ChatColor.GREEN+"True" : ChatColor.RED+"False"));
                    	
                    	//sender.sendMessage("Sheep Allowed: " + plugin.sheep + " | Squid Allowed: " + plugin.squid);
                    	sender.sendMessage("Sheep Allowed: " + ((plugin.sheep) ? ChatColor.GREEN+"True" : ChatColor.RED+"False") + ChatColor.GOLD + " | " +ChatColor.WHITE + "Squid Allowed: " + ((plugin.squid) ? ChatColor.GREEN+"True" : ChatColor.RED+"False"));
                    	
                    	//sender.sendMessage("Villager Allowed: " + plugin.villager + " | Endermen Allowed: " + plugin.enderman);
                    	sender.sendMessage("Villager Allowed: " + ((plugin.villager) ? ChatColor.GREEN+"True" : ChatColor.RED+"False") + ChatColor.GOLD + " | " +ChatColor.WHITE + "Endermen Allowed: " + ((plugin.enderman) ? ChatColor.GREEN+"True" : ChatColor.RED+"False"));
                    	
                    	//sender.sendMessage("Wolf Allowed: " + plugin.wolf + " | SnowGolem Allowed: " + plugin.snowgolem);
                    	sender.sendMessage("Wolf Allowed: " + ((plugin.wolf) ? ChatColor.GREEN+"True" : ChatColor.RED+"False") + ChatColor.GOLD + " | " +ChatColor.WHITE + "SnowGolem Allowed: " + ((plugin.snowgolem) ? ChatColor.GREEN+"True" : ChatColor.RED+"False"));
                    	
                    	
                    	//sender.sendMessage("IronGolem Allowed: " + plugin.irongolem + " | CaveSpider Allowed: " + plugin.cavespider);
                    	sender.sendMessage("IronGolem Allowed: " + ((plugin.irongolem) ? ChatColor.GREEN+"True" : ChatColor.RED+"False") + ChatColor.GOLD + " | " +ChatColor.WHITE + "CaveSpider Allowed: " + ((plugin.cavespider) ? ChatColor.GREEN+"True" : ChatColor.RED+"False"));
                    	
                    	//sender.sendMessage("Creeper Allowed: " + plugin.creeper + " | Ocelot Allowed: " + plugin.ocelot);
                    	sender.sendMessage("Creeper Allowed: " + ((plugin.creeper) ? ChatColor.GREEN+"True" : ChatColor.RED+"False") + ChatColor.GOLD + " | " +ChatColor.WHITE + "Ocelot Allowed: " + ((plugin.ocelot) ? ChatColor.GREEN+"True" : ChatColor.RED+"False"));
                     	
                    	//sender.sendMessage("Skeleton Allowed: " + plugin.skeleton + " | Slime Allowed: " + plugin.slime);
                    	sender.sendMessage("Skeleton Allowed: " + ((plugin.skeleton) ? ChatColor.GREEN+"True" : ChatColor.RED+"False") + ChatColor.GOLD + " | " +ChatColor.WHITE + "Slime Allowed: " + ((plugin.slime) ? ChatColor.GREEN+"True" : ChatColor.RED+"False"));
                    	
                    	//sender.sendMessage("Spider Allowed: " + plugin.spider + " | Zombie Allowed: " + plugin.zombie);
                    	sender.sendMessage("Spider Allowed: " + ((plugin.spider) ? ChatColor.GREEN+"True" : ChatColor.RED+"False") +  ChatColor.GOLD + " | " +ChatColor.WHITE + "Zombie Allowed: " + ((plugin.zombie) ? ChatColor.GREEN+"True" : ChatColor.RED+"False"));  	
                    	
                    	sender.sendMessage(ChatColor.RED + "NetherWorld: ");
                    	//sender.sendMessage("PigZombie_Nether Allowed: " + plugin.pigzombie_nether + " | Blaze_Nether Allowed: " + plugin.blaze_nether);
                    	sender.sendMessage("PigZombie_Nether Allowed: " + ((plugin.pigzombie_nether) ? ChatColor.GREEN+"True" : ChatColor.RED+"False") + ChatColor.GOLD + " | " +ChatColor.WHITE + "Blaze_Nether Allowed: " + ((plugin.blaze_nether) ? ChatColor.GREEN+"True" : ChatColor.RED+"False"));
                    	
                    	//sender.sendMessage("Ghast_Nether Allowed: " + plugin.ghast_nether);
                    	sender.sendMessage("Ghest_Nether Allowed: " + ((plugin.ghast_nether) ? ChatColor.GREEN+"True" : ChatColor.RED+"False"));
                    	
                    	sender.sendMessage(ChatColor.AQUA + "TheEndWorld:");
                    	
                    	//sender.sendMessage("Endermen_The_End Allowed: " + plugin.endermen_the_end);
                    	sender.sendMessage("Endermen Allowed: " + ((plugin.endermen_the_end) ? ChatColor.GREEN+"True" : ChatColor.RED+"False"));

                    return true;
                    } else {
                        sender.sendMessage("[" + ChatColor.DARK_GREEN + "MSR" + ChatColor.WHITE + "]" + ChatColor.RED + " You do not have permission for this");
                    }

                }
                if (args[0].equalsIgnoreCase("about")) {
                    if (sender.hasPermission("msr.about")) {
                    sender.sendMessage(ChatColor.GOLD + "-------------------*MobSupaRemoval*-----------------");
                    sender.sendMessage(ChatColor.GOLD + "Plugin made by" + ChatColor.RED + " javoris767.");
                    sender.sendMessage(ChatColor.GOLD + "The current plugin version is:" + ChatColor.RED + " " + plugin.getDescription().getVersion());
                    sender.sendMessage(ChatColor.GOLD + "Please report all bugs on bukkit dev!");
                    sender.sendMessage(ChatColor.GOLD + "---------------------------------------------------");
                    return true;
                    } else {
                        sender.sendMessage("[" + ChatColor.DARK_GREEN + "MSR" + ChatColor.WHITE + "]" + ChatColor.RED + " You do not have permission for this");
                    }
                }
            } else {
                return false;
            }
        } else {
            sender.sendMessage("This command can only be used in-game.");
        }
        return true;
      }
}