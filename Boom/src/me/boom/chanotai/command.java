package me.boom.chanotai;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class command implements CommandExecutor {

	DBConn db = new DBConn();
	MD5 MD5 = new MD5();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("login")) {
			if(!(sender instanceof Player)) {
				sender.sendMessage(ChatColor.DARK_RED + "Only player can do this command!");
				return true;
			}
			
			Player p = (Player) sender;
			
			if(args.length == 0) {
				p.sendMessage(ChatColor.BLUE + "Server> " + ChatColor.GRAY + "/login (password)");
			}
			
			if(args.length == 1) {
				

				
			}
			
		}
		return false;
	}

}
