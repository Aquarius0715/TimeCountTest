package aquarius0715.timecounttestplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import sun.awt.windows.ThemeReader;

import java.awt.*;

public final class TimeCountTestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("timecount")) {
            if(!(sender instanceof Player)) {
                Player player = (Player) sender;
                sender.sendMessage("You cannot this!");
                return true;
            }

            if (args.length == 0) {
                try {
                    TimeCount();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
        return false;
    }

    public void TimeCount() throws InterruptedException{
        //処理開始前の時刻

        Bukkit.broadcastMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "残り時間は30秒です");

        Thread.sleep(10000);

        Bukkit.broadcastMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "残り時間は20秒です");

        Thread.sleep(10000);

        Bukkit.broadcastMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "残り時間は10秒です");

        Thread.sleep(5000);

        Bukkit.broadcastMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "残り時間は5秒です");

        Thread.sleep(1000);

        Bukkit.broadcastMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "残り時間は4秒です");

        Thread.sleep(1000);

        Bukkit.broadcastMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "残り時間は3秒です");

        Thread.sleep(1000);

        Bukkit.broadcastMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "残り時間は2秒です");

        Thread.sleep(1000);

        Bukkit.broadcastMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "残り時間は1秒です");

        Thread.sleep(1000);

        Bukkit.broadcastMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "締め切りました！");

    }

}
