package me.javoris767.mobsuparemoval;

import java.io.IOException;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class MSR extends JavaPlugin {
	Logger log = Logger.getLogger("Minecraft");
	private MobListener mobl = new MobListener(this);
	FileConfiguration config;
	boolean chicken;
	boolean cow;
	boolean mooshroom;
	boolean pig;
	boolean sheep;
	boolean squid;
	boolean villager;
	boolean enderman;
	boolean wolf;
	boolean snowgolem;;
	boolean cavespider;
	boolean creeper;
	boolean skeleton;
	boolean slime;
	boolean spider;
	boolean zombie;
	boolean ocelot;
	boolean irongolem;
	
	boolean pigzombie_nether;
	boolean blaze_nether;
	boolean ghast_nether;
	
	boolean endermen_the_end;
	
public void onEnable() {
	log.info(this + " is enabled");
	loadConfig();
	config = this.getConfig();
	// -_-
	chicken = config.getBoolean("MobSupaRemoval Settings.NormalWorld.Chicken Allowed", true);
	cow = config.getBoolean("MobSupaRemoval Settings.NormalWorld.Cow Allowed", true);
	mooshroom = config.getBoolean("MobSupaRemoval Settings.NormalWorld.MooshroomCow Allowed", true);
	pig = config.getBoolean("MobSupaRemoval Settings.NormalWorld.Pig Allowed", true);
	sheep = config.getBoolean("MobSupaRemoval Settings.NormalWorld.Sheep Allowed", true);
	squid = config.getBoolean("MobSupaRemoval Settings.NormalWorld.Squid Allowed", true);
	villager = config.getBoolean("MobSupaRemoval Settings.NormalWorld.Villager Allowed", true);
	enderman = config.getBoolean("MobSupaRemoval Settings.NormalWorld.Endermen Allowed", true);
	wolf = config.getBoolean("MobSupaRemoval Settings.NormalWorld.Wolf Allowed", true);
	snowgolem = config.getBoolean("MobSupaRemoval Settings.NormalWorld.SnowGolem Allowed", true);
	cavespider = config.getBoolean("MobSupaRemoval Settings.NormalWorld.CaveSpider Allowed", true);
	creeper = config.getBoolean("MobSupaRemoval Settings.NormalWorld.Creeper Allowed", true);
	irongolem = config.getBoolean("MobSupaRemoval Settings.NormalWorld.IronGolem Allowed", true);
	ocelot = config.getBoolean("MobSupaRemoval Settings.NormalWorld.Ocelot Allowed", true);
	skeleton = config.getBoolean("MobSupaRemoval Settings.NormalWorld.Skeleton Allowed", true);
	slime = config.getBoolean("MobSupaRemoval Settings.NormalWorld.Slime Allowed", true);
	spider = config.getBoolean("MobSupaRemoval Settings.NormalWorld.Spider Allowed", true);
	zombie = config.getBoolean("MobSupaRemoval Settings.NormalWorld.Zombie Allowed", true);
	//Nether
	pigzombie_nether = config.getBoolean("MobSupaRemoval Settings.NetherWorld.PigZombie_Nether Allowed", true);
	ghast_nether = config.getBoolean("MobSupaRemoval Settings.NetherWorld.Ghast_Nether Allowed", true);
	blaze_nether = config.getBoolean("MobSupaRemoval Settings.NetherWorld.Blaze_Nether Allowed", true);
	//The End
	endermen_the_end = config.getBoolean("MobSupaRemoval Settings.TheEndWorld.Endermen_The_End Allowed", true);
	saveConfig();

	// -_-
	getCommand("msr").setExecutor(new MSRCMDs(this));
	Bukkit.getServer().getPluginManager().registerEvents(mobl, this);
	try {
		MetricsLite metrics = new MetricsLite(this);
		metrics.start();
		log.info(this + " is using PluginMetrics!");
		} catch (IOException e) {
			e.printStackTrace();
		}
}
public void onDisable() {
	log.info(this + "is disabled");
	saveConfig();
}
private void loadConfig() {
	config = this.getConfig();
	config.options().copyDefaults(true);
	config.options().header("Thanks for choosing MobSupaRemoval! Simply just add true or false to the settings.");
	config.addDefault("MobSupaRemoval Settings.NormalWorld.Chicken Allowed", true);
	config.addDefault("MobSupaRemoval Settings.NormalWorld.Cow Allowed", true);
	config.addDefault("MobSupaRemoval Settings.NormalWorld.MooshroomCow Allowed", true);
	config.addDefault("MobSupaRemoval Settings.NormalWorld.Pig Allowed", true);
	config.addDefault("MobSupaRemoval Settings.NormalWorld.Sheep Allowed", true);
	config.addDefault("MobSupaRemoval Settings.NormalWorld.Squid Allowed", true);
	config.addDefault("MobSupaRemoval Settings.NormalWorld.Villager Allowed", true);
	config.addDefault("MobSupaRemoval Settings.NormalWorld.Endermen Allowed", true);
	config.addDefault("MobSupaRemoval Settings.NormalWorld.Wolf Allowed", true);
	config.addDefault("MobSupaRemoval Settings.NormalWorld.SnowGolem Allowed", true);
	config.addDefault("MobSupaRemoval Settings.NormalWorld.IronGolem Allowed", true);
	config.addDefault("MobSupaRemoval Settings.NormalWorld.CaveSpider Allowed", true);
	config.addDefault("MobSupaRemoval Settings.NormalWorld.Creeper Allowed", true);
	config.addDefault("MobSupaRemoval Settings.NormalWorld.Ocelot Allowed", true);
	config.addDefault("MobSupaRemoval Settings.NormalWorld.Skeleton Allowed", true);
	config.addDefault("MobSupaRemoval Settings.NormalWorld.Slime Allowed", true);
	config.addDefault("MobSupaRemoval Settings.NormalWorld.Spider Allowed", true);
	config.addDefault("MobSupaRemoval Settings.NormalWorld.Zombie Allowed", true);	
	//Nether
	config.addDefault("MobSupaRemoval Settings.NetherWorld.PigZombie_Nether Allowed", true);
	config.addDefault("MobSupaRemoval Settings.NetherWorld.Blaze_Nether Allowed", true);
	config.addDefault("MobSupaRemoval Settings.NetherWorld.Ghast_Nether Allowed", true);
	//The end
	config.addDefault("MobSupaRemoval Settings.TheEndWorld.Endermen_The_End Allowed", true);
	saveConfig();
	}
}