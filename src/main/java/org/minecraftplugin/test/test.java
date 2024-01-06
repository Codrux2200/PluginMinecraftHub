package org.minecraftplugin.test;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class test implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        int Number = 0;
        if (args.length < 1){
            Bukkit.broadcastMessage("You must provide an argument and it must be a number");
            return false;
        }
        try{
            Number = Integer.parseInt(args[0]);
        }catch (NumberFormatException e){
            Bukkit.broadcastMessage("the argument must me a number");
            return false;
        }
        if (sender instanceof Player player){
            ItemStack diamands = new ItemStack(Material.DIAMOND);
            diamands.setAmount(Number);
            player.getInventory().addItem(diamands);
            Bukkit.broadcastMessage(player.getName() + "get " + Number  + " diamands");
        } else {
            Bukkit.broadcastMessage("the commands must me used by a player");
        }
        return false;
    }

}
