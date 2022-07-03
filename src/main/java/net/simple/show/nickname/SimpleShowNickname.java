package net.simple.show.nickname;

import net.simple.show.nickname.listeners.RightClickAtPlayerListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleShowNickname extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new RightClickAtPlayerListener(), this);

        getLogger().info("Plugin started up!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled up!");
    }
}
