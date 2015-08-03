package net.yougold.org.AntiBuild;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	//where we register most of our plugin
	public void onEnable() {
		getConfig().options().copyDefaults(true);
		saveDefaultConfig();
		getServer().getPluginManager().registerEvents(new NoPlace(this), this);
		getServer().getPluginManager().registerEvents(new NoDestroy(this), this);
	}
}
