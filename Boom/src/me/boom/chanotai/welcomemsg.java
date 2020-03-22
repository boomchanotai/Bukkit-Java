package me.boom.chanotai;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import net.md_5.bungee.api.ChatColor;

public class welcomemsg implements Listener {
	
	DBConn db = new DBConn();
	command command = new command();
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();

		if(!(p.hasPlayedBefore())) {
			Bukkit.broadcastMessage(ChatColor.BLUE + "Server> " + ChatColor.GRAY + "Welcome, " + p.getPlayerListName() + " to the server for first time !");
		}

			p.setWalkSpeed(0);
			p.setGameMode(GameMode.ADVENTURE);
			p.setHealth(20);
			p.teleport(new Location(Bukkit.getWorld("world"), 0, 64, 0));
			p.setCanPickupItems(false);
			p.getInventory().clear();

		
		
		e.setJoinMessage(ChatColor.BLUE + "Server> " + ChatColor.GRAY + p.getPlayerListName() + " join server!");
		
		
		
	}	

	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent q) {
		Player p = q.getPlayer();
		q.setQuitMessage(ChatColor.BLUE + "Server> " + ChatColor.GRAY + p.getPlayerListName() + " left server!");
	}
}
