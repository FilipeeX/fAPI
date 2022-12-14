package filipeex.fapi.util;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class PlayerUtil {

    public static boolean isOnline(String nick) {
        boolean result = false;

        for (Player p : Bukkit.getOnlinePlayers())
            if (p.getDisplayName().equalsIgnoreCase(nick))
                result = true;

        return result;
    }

    public static boolean isOffline(String nick) {
        boolean result = false;

        for (OfflinePlayer p : Bukkit.getOfflinePlayers())
            if (p.getName().equalsIgnoreCase(nick))
                result = true;

        return result;
    }

    public static boolean isSelf(Player sender, Player argument) {
        boolean result = false;

        if (sender.getDisplayName().equalsIgnoreCase(argument.getDisplayName()))
            result = true;

        return result;
    }

    public static ArrayList<String> getOnlinePlayerNames() {
        ArrayList<String> result = new ArrayList<String>();

        for (Player p : Bukkit.getOnlinePlayers())
            result.add(p.getDisplayName());

        return result;
    }

}
