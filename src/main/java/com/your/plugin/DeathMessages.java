package com.your.plugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class DeathMessages extends JavaPlugin implements Listener {
    
    @Override
    public void onEnable() {
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(this, this);
    }
    
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        Player killer = player.getKiller();
        String deathMessage;

        if (killer != null) {
            // PvP death
            deathMessage = getConfig().getString("messages.pvp", "&f%player% &chas been Eliminated");
            deathMessage = deathMessage.replace("%killer%", killer.getName());
        } else if (player.getLastDamageCause() != null) {
            DamageCause cause = player.getLastDamageCause().getCause();
            deathMessage = getConfig().getString("messages." + cause.toString().toLowerCase(), 
                                               getConfig().getString("messages.default", "&f%player% &chas been Eliminated"));
        } else {
            deathMessage = getConfig().getString("messages.default", "&f%player% &chas been Eliminated");
        }
        
        deathMessage = deathMessage.replace("%player%", player.getName());
        deathMessage = ChatColor.translateAlternateColorCodes('&', deathMessage);
        
        event.setDeathMessage(deathMessage);
    }
} 