package org.minecraftplugin.minecraftpluginshub;

import org.bukkit.plugin.java.JavaPlugin;
import org.minecraftplugin.test.test;
import org.minecraftplugin.diamand.diamand;
public final class MinecraftPluginsHub extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("test").setExecutor(new test());
        this.getServer().getPluginManager().registerEvents(new diamand(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
