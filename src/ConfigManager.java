public class ConfigManager {

    private static ConfigManager manager;
    private String configValue;

    private ConfigManager() {
        configValue = "default value";
    }

    public static ConfigManager getInstance() {
        if (manager == null) {
            manager = new ConfigManager();
        }
        return manager;
    }


    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }
}
