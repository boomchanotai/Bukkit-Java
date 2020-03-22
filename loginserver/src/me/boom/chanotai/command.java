package me.boom.chanotai;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class command implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("spawn")) {
			
			if(!(sender instanceof Player)) {
				sender.sendMessage(ChatColor.DARK_RED + "Only player can do this command!");
				return true;
			}
			
			if(args.length == 0) {
				p.teleport(new Location(Bukkit.getWorld("world"), 0.5, 64, 0.5));
			}
			
			if(args.length == 1) {
				
				Player target = Bukkit.getServer().getPlayer(args[0]);
				target.teleport(new Location(Bukkit.getWorld("world"), 0.5, 64, 0.5));
				
			}
			
		}
		
		if(cmd.getName().equalsIgnoreCase("help")) {
			p.sendMessage(ChatColor.BLUE + "Server> " + ChatColor.GRAY + "You don't have permission to do this.");
		}
		
		if(cmd.getName().equalsIgnoreCase("?")) {
			p.sendMessage(ChatColor.BLUE + "Server> " + ChatColor.GRAY + "You don't have permission to do this.");
		}
		
		if(cmd.getName().equalsIgnoreCase("pl")) {
			p.sendMessage(ChatColor.BLUE + "Server> " + ChatColor.GRAY + "You don't have permission to do this.");
		}
		
		
		return false;
	}

}
