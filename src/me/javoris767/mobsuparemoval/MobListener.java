package me.javoris767.mobsuparemoval;

import org.bukkit.World.Environment;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;

public class MobListener implements Listener {
	FileConfiguration config;
	public static MSR plugin;

	public MobListener(MSR instance) {
	plugin = instance;
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onCreatureSpawn(final CreatureSpawnEvent event) {

		if (event.getEntityType() == EntityType.CHICKEN
				&& event.getEntity().getWorld().getEnvironment() == Environment.NORMAL 
				//&& event.getSpawnReason() == SpawnReason.NATURAL
				&& !plugin.chicken) {
			event.setCancelled(true);
		}
		if (event.getEntityType() == EntityType.CAVE_SPIDER 
				&& event.getEntity().getWorld().getEnvironment() == Environment.NORMAL 
				//&& event.getSpawnReason() == SpawnReason.NATURAL
				&& !plugin.cavespider) {
			event.setCancelled(true);
		}
		if (event.getEntityType() == EntityType.COW 
				&& event.getEntity().getWorld().getEnvironment() == Environment.NORMAL 
						//&& event.getSpawnReason() == SpawnReason.NATURAL
				&& !plugin.cow) {
			event.setCancelled(true);
		}
		if (event.getEntityType() == EntityType.CREEPER 
				&& event.getEntity().getWorld().getEnvironment() == Environment.NORMAL 
						//&& event.getSpawnReason() == SpawnReason.NATURAL
				&& !plugin.creeper) {
			event.setCancelled(true);
		}
		if (event.getEntityType() == EntityType.ENDERMAN 
				&& event.getEntity().getWorld().getEnvironment() == Environment.NORMAL 
						//&& event.getSpawnReason() == SpawnReason.NATURAL 
				&& !plugin.enderman) {
			event.setCancelled(true);
		}
		if (event.getEntityType() == EntityType.IRON_GOLEM
				&& event.getEntity().getWorld().getEnvironment() == Environment.NORMAL 
			    && event.getSpawnReason() == SpawnReason.BUILD_IRONGOLEM
				&& !plugin.irongolem) {
			event.setCancelled(true);
		}
		if (event.getEntityType() == EntityType.MUSHROOM_COW 
				&& event.getEntity().getWorld().getEnvironment() == Environment.NORMAL 
						//&& event.getSpawnReason() == SpawnReason.NATURAL 
				&& !plugin.mooshroom) {
			event.setCancelled(true);
		}
		if (event.getEntityType() == EntityType.OCELOT
				&& event.getEntity().getWorld().getEnvironment() == Environment.NORMAL
						//&& event.getSpawnReason() == SpawnReason.NATURAL
				&& !plugin.ocelot) {
		}
		if (event.getEntityType() == EntityType.PIG 
				&& event.getEntity().getWorld().getEnvironment() == Environment.NORMAL 
						//&& event.getSpawnReason() == SpawnReason.NATURAL 
				&& !plugin.pig) {
			event.setCancelled(true);
		}
		if (event.getEntityType() == EntityType.SHEEP 
				&& event.getEntity().getWorld().getEnvironment() == Environment.NORMAL 
						//&& event.getSpawnReason() == SpawnReason.NATURAL 
				&& !plugin.sheep) {
			event.setCancelled(true);
		}
		if (event.getEntityType() == EntityType.SKELETON
				&& event.getEntity().getWorld().getEnvironment() == Environment.NORMAL 
						//&& event.getSpawnReason() == SpawnReason.NATURAL 
				&& !plugin.skeleton) {
			event.setCancelled(true);
		}
		if (event.getEntityType() == EntityType.SLIME 
				&& event.getEntity().getWorld().getEnvironment() == Environment.NORMAL 
						//&& event.getSpawnReason() == SpawnReason.NATURAL
				&& !plugin.slime) {
			event.setCancelled(true);
		}
		if (event.getEntityType() == EntityType.SNOWMAN
				&& event.getEntity().getWorld().getEnvironment() == Environment.NORMAL 
				&& event.getSpawnReason() == SpawnReason.BUILD_SNOWMAN 
				&& !plugin.snowgolem) {
			event.setCancelled(true);
		}
		if (event.getEntityType() == EntityType.SPIDER 
				&& event.getEntity().getWorld().getEnvironment() == Environment.NORMAL 
						//&& event.getSpawnReason() == SpawnReason.NATURAL 
				&& !plugin.spider) {
			event.setCancelled(true);
		}
		if (event.getEntityType() == EntityType.SQUID 
				&& event.getEntity().getWorld().getEnvironment() == Environment.NORMAL
						//&& event.getSpawnReason() == SpawnReason.NATURAL 
				&& !plugin.squid) {
			event.setCancelled(true);
		}
		if (event.getEntityType() == EntityType.VILLAGER 
				&& event.getEntity().getWorld().getEnvironment() == Environment.NORMAL
						//&& event.getSpawnReason() == SpawnReason.NATURAL 
				&& !plugin.villager) {
			event.setCancelled(true);
		}
		if (event.getEntityType() == EntityType.WOLF 
				&& event.getEntity().getWorld().getEnvironment() == Environment.NORMAL 
				//&& event.getSpawnReason() == SpawnReason.NATURAL 
				&& !plugin.wolf) {
			event.setCancelled(true);
		}
		if (event.getEntityType() == EntityType.ZOMBIE 
				&& event.getEntity().getWorld().getEnvironment() == Environment.NORMAL 
						//&& event.getSpawnReason() == SpawnReason.NATURAL 
				&& !plugin.zombie) {
			event.setCancelled(true);
		}
		// Nether mobs
	    if (event.getEntityType() == EntityType.PIG_ZOMBIE 
	    		&& event.getSpawnReason() == SpawnReason.NATURAL 
	    		&& event.getSpawnReason() == SpawnReason.SPAWNER_EGG 
	    		&& event.getEntity().getWorld().getEnvironment() == Environment.NETHER 
	    		&& !plugin.pigzombie_nether) {
			event.setCancelled(true);
	    }
	    if (event.getEntityType() == EntityType.BLAZE
	    		//&& event.getSpawnReason() == SpawnReason.SPAWNER
	    		&& event.getEntity().getWorld().getEnvironment() == Environment.NETHER 
	    		&& !plugin.blaze_nether) {
			event.setCancelled(true);
	    }
	    if (event.getEntityType() == EntityType.GHAST
	    		//&& event.getSpawnReason() == SpawnReason.SPAWNER
	    		&& event.getEntity().getWorld().getEnvironment() == Environment.NETHER 
	    		&& !plugin.ghast_nether) {
			event.setCancelled(true);
	    }
		// The end mobs
	    if (event.getEntityType() == EntityType.ENDERMAN
	    		//&& event.getSpawnReason() == SpawnReason.NATURAL 
		    	&& event.getEntity().getWorld().getEnvironment() == Environment.THE_END
		    	&& !plugin.endermen_the_end) {
			event.setCancelled(true);
	    }
	}
}