package land.pig.plugin.TrashKit;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("trashkit")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				//if (player.hasPermission("hello.use")) {
				//}
					
				ItemStack items = new ItemStack(Material.GOLDEN_BOOTS);
				new ItemStack()
				player.getInventory().addItem(items);
			} else {
				sender.sendMessage("Hello console ");
			}
			return true;
		}
		return false;
	}
}
