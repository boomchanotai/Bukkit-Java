package me.boom.chanotai;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	DBConn db = new DBConn();
	
	public void onEnable() {
		Bukkit.getServer().getLogger().info("[Boom] Hello World!");
		Bukkit.getServer().getPluginManager().registerEvents(new welcomemsg(), this);
		getCommand("login").setExecutor(new command());
	}
	
	public void onDisable() {
		Bukkit.getServer().getLogger().info("[Boom] Bye !!");
	}

}
