package com.smartkids.codewizclassregions;

import org.bukkit.plugin.java.JavaPlugin;

import com.smartkids.codewizclassregions.events.Regions;

public final class CodewizClassRegions extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("------> HELLO WORLD");
        getServer().getPluginManager().registerEvents(new Regions(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        
    }
}
