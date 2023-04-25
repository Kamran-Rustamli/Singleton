public class Main {

    public static void main(String[] args) {

        var configManager = ConfigManager.getInstance();
        System.out.println(configManager.getConfigValue());

        configManager.setConfigValue("new value");
        configManager.setConfigValue("MS 15");


        var anotherConfigManager = ConfigManager.getInstance();
        System.out.println(anotherConfigManager.getConfigValue());

    }
}
