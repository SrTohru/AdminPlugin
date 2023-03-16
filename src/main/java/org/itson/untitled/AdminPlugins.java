package org.itson.untitled;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class AdminPlugins extends JavaPlugin {

    ConsoleCommandSender cmd = Bukkit.getConsoleSender();

    @Override
    public void onEnable() {
        getLogger().info("&a&lPlugin 'AdminPlugin' has been started");
    }

    @Override
    public void onDisable() {
        getLogger().info("&a&lPlugin 'AdminPlugin' has been stopped");
    }
}
