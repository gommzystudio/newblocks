package de.gommzy.newblocks;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class NewBlocks extends JavaPlugin {
    public static Plugin INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;

        System.out.println("[NewBlocks] Plugin is enabled. Thanks for using NewBlocks!");
    }
}
