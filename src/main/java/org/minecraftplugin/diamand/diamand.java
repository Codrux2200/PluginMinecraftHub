package org.minecraftplugin.diamand;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class diamand implements Listener {
    @EventHandler
    public void onBlockbreak(BlockBreakEvent e){
        Player p = e.getPlayer();
        Block k = e.getBlock();
        if (k.getType().equals(Material.DIAMOND_BLOCK)){
            Bukkit.broadcastMessage(p.getName() + " is to rich for you");
        }

    }
}
