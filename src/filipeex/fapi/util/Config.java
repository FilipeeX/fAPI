package filipeex.fapi.util;

import filipeex.fapi.FAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Config {

    // ░██████╗███████╗████████╗████████╗██╗███╗░░██╗░██████╗░░██████╗
    // ██╔════╝██╔════╝╚══██╔══╝╚══██╔══╝██║████╗░██║██╔════╝░██╔════╝
    // ╚█████╗░█████╗░░░░░██║░░░░░░██║░░░██║██╔██╗██║██║░░██╗░╚█████╗░
    // ░╚═══██╗██╔══╝░░░░░██║░░░░░░██║░░░██║██║╚████║██║░░╚██╗░╚═══██╗
    // ██████╔╝███████╗░░░██║░░░░░░██║░░░██║██║░╚███║╚██████╔╝██████╔╝
    // ╚═════╝░╚══════╝░░░╚═╝░░░░░░╚═╝░░░╚═╝╚═╝░░╚══╝░╚═════╝░╚═════╝░

    private static File settingsFile;
    private static FileConfiguration settings;

    public static FileConfiguration getSettings() {
        return settings;
    }

    public static boolean createSettings() {
        boolean success = true;

        settingsFile = new File(FAPI.i.getDataFolder(), "settings.yml");
        if (!settingsFile.exists()) {
            settingsFile.getParentFile().mkdirs();
            FAPI.i.saveResource("settings.yml", false);
        }

        settings = new YamlConfiguration();
        try {
            settings.load(settingsFile);
        } catch (Exception ex) {
            success = false;
            Output.err(ex.getMessage());
        }

        return success;
    }

    public static boolean reloadSettings() {
        boolean success = true;

        try {
            settings.load(settingsFile);
        } catch (Exception ex) {
            success = false;
            Output.err(ex.getMessage());
        }

        return success;
    }

    public static boolean saveSettings() {
        boolean success = true;

        try {
            settings.save(settingsFile);
        } catch (IOException ex) {
            success = false;
            Output.err(ex.getMessage());
        }

        return success;
    }

    public static boolean unloadSettings() {
        boolean success = false;

        settings = new YamlConfiguration();

        return success;
    }

    public static boolean resetSettings() {
        boolean success = true;

        unloadSettings();

        settingsFile = new File(FAPI.i.getDataFolder(), "settings.yml");
        settingsFile.getParentFile().mkdirs();
        FAPI.i.saveResource("settings.yml", true);

        settings = new YamlConfiguration();
        try {
            settings.load(settingsFile);
        } catch (Exception ex) {
            success = false;
            Output.err(ex.getMessage());
        }

        return success;
    }


    // ██████╗░░█████╗░████████╗░█████╗░██████╗░░█████╗░░██████╗███████╗
    // ██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔════╝
    // ██║░░██║███████║░░░██║░░░███████║██████╦╝███████║╚█████╗░█████╗░░
    // ██║░░██║██╔══██║░░░██║░░░██╔══██║██╔══██╗██╔══██║░╚═══██╗██╔══╝░░
    // ██████╔╝██║░░██║░░░██║░░░██║░░██║██████╦╝██║░░██║██████╔╝███████╗
    // ╚═════╝░╚═╝░░╚═╝░░░╚═╝░░░╚═╝░░╚═╝╚═════╝░╚═╝░░╚═╝╚═════╝░╚══════╝

    private static File dataFile;
    private static FileConfiguration data;

    public static FileConfiguration getData() {
        return data;
    }

    public static boolean createData() {
        boolean success = true;

        dataFile = new File(FAPI.i.getDataFolder(), "data.yml");
        if (!dataFile.exists()) {
            dataFile.getParentFile().mkdirs();
            FAPI.i.saveResource("data.yml", false);
        }

        data = new YamlConfiguration();
        try {
            data.load(dataFile);
        } catch (Exception ex) {
            success = false;
            Output.err(ex.getMessage());
        }

        return success;
    }

    public static boolean reloadData() {
        boolean success = true;

        try {
            data.load(dataFile);
        } catch (Exception ex) {
            success = false;
            Output.err(ex.getMessage());
        }

        return success;
    }

    public static boolean saveData() {
        boolean success = true;

        try {
            data.save(dataFile);
        } catch (IOException ex) {
            success = false;
            Output.err(ex.getMessage());
        }

        return success;
    }

    public static boolean unloadData() {
        boolean success = false;

        data = new YamlConfiguration();

        return success;
    }

    public static boolean resetData() {
        boolean success = true;

        unloadData();

        dataFile = new File(FAPI.i.getDataFolder(), "data.yml");
        dataFile.getParentFile().mkdirs();
        FAPI.i.saveResource("data.yml", true);

        data = new YamlConfiguration();
        try {
            data.load(dataFile);
        } catch (Exception ex) {
            success = false;
            Output.err(ex.getMessage());
        }

        return success;
    }


    // ███╗░░░███╗███████╗░██████╗░██████╗░█████╗░░██████╗░███████╗░██████╗
    // ████╗░████║██╔════╝██╔════╝██╔════╝██╔══██╗██╔════╝░██╔════╝██╔════╝
    // ██╔████╔██║█████╗░░╚█████╗░╚█████╗░███████║██║░░██╗░█████╗░░╚█████╗░
    // ██║╚██╔╝██║██╔══╝░░░╚═══██╗░╚═══██╗██╔══██║██║░░╚██╗██╔══╝░░░╚═══██╗
    // ██║░╚═╝░██║███████╗██████╔╝██████╔╝██║░░██║╚██████╔╝███████╗██████╔╝
    // ╚═╝░░░░░╚═╝╚══════╝╚═════╝░╚═════╝░╚═╝░░╚═╝░╚═════╝░╚══════╝╚═════╝░

    private static File messagesFile;
    private static FileConfiguration messages;

    public static FileConfiguration getMessages() {
        return messages;
    }

    public static boolean createMessages() {
        boolean success = true;

        messagesFile = new File(FAPI.i.getDataFolder(), "messages.yml");
        if (!messagesFile.exists()) {
            messagesFile.getParentFile().mkdirs();
            FAPI.i.saveResource("messages.yml", false);
        }

        messages = new YamlConfiguration();
        try {
            messages.load(messagesFile);
        } catch (Exception ex) {
            success = false;
            Output.err(ex.getMessage());
        }

        return success;
    }

    public static boolean reloadMessages() {
        boolean success = true;

        try {
            messages.load(messagesFile);
        } catch (Exception ex) {
            success = false;
            Output.err(ex.getMessage());
        }

        return success;
    }

    public static boolean saveMessages() {
        boolean success = true;

        try {
            messages.save(messagesFile);
        } catch (IOException ex) {
            success = false;
            Output.err(ex.getMessage());
        }

        return success;
    }

    public static boolean unloadMessages() {
        boolean success = false;

        messages = new YamlConfiguration();

        return success;
    }

    public static boolean resetMessages() {
        boolean success = true;

        unloadMessages();

        messagesFile = new File(FAPI.i.getDataFolder(), "messages.yml");
        messagesFile.getParentFile().mkdirs();
        FAPI.i.saveResource("messages.yml", true);

        messages = new YamlConfiguration();
        try {
            messages.load(messagesFile);
        } catch (Exception ex) {
            success = false;
            Output.err(ex.getMessage());
        }

        return success;
    }

}