package land.pig.plugin.TrashKit;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("hello")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				if (player.hasPermission("hello.use")) {
					player.sendMessage("Hello player");
				} else {
					player.sendMessage("Sorry, you don't have permission");
				}
			} else {
				sender.sendMessage("Hello console ");
			}
			return true;
		}
		return false;
	}
}


// todo -
// 1. create github team/repo
// 2. commit on git
// 3. make a shuffler for the items