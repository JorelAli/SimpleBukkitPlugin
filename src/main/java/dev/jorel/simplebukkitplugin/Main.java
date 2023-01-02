package dev.jorel.simplebukkitplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (label.equalsIgnoreCase("mycommand")) {
			sender.sendMessage("/mycommand was called :)");
			return true;
		}
		return false;
	}
}
