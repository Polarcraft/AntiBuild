package net.yougold.org.AntiBuild;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class NoPlace implements Listener {

	private Main plugin;
	
	public NoPlace(Main plugin)
	{
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onPlace(BlockPlaceEvent e) {
		Player p = e.getPlayer();
		if(!p.hasPermission("antibuild.place")) {
			e.setCancelled(true);
			String message = ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("place-message"));
			p.sendMessage(message);
		}
	}
}
