package in.mcplug.main;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Priority;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitInterface extends JavaPlugin {
    public BukkitInterface(){

    }
    public void onDisable() {
	}
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		//pm.registerEvent(Event.Type.PLAYER_INTERACT, playerListener, Priority.Highest, this);
	}
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        return false;
    }
}