package me.boom.chanotai;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	
	public void onEnable() {
		Bukkit.getServer().getLogger().info("[lobbyserver] Hello World!");
		Bukkit.getServer().getPluginManager().registerEvents(new welcomemsg(), this);
		getCommand("spawn").setExecutor(new command());
		getCommand("help").setExecutor(new command());
		getCommand("?").setExecutor(new command());
		getCommand("pl").setExecutor(new command());
	}
	
	public void onDisable() {
		Bukkit.getServer().getLogger().info("[lobbyserver] Bye !!");
	}

}
