package net.yougold.org.AntiBuild;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class NoDestroy implements Listener {

	private Main plugin;
	
	public NoDestroy(Main plugin)
	{
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onDestroy(BlockBreakEvent e) {
		Player p = e.getPlayer();
		if(!p.hasPermission("antibuild.destroy")) {
			e.setCancelled(true);
			String message = ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("destroy-message"));
			p.sendMessage(message);
		}
	}
}
