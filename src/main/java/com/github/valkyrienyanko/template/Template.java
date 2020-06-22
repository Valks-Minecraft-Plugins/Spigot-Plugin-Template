package com.github.valkyrienyanko.template;

import org.bukkit.plugin.java.JavaPlugin;

public class Template extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Plugin enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled");
    }
}
