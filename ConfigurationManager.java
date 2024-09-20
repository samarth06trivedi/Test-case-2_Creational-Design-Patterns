// ConfigurationManager.java
public class ConfigurationManager {
    private static ConfigurationManager instance = null;
    private String config;

    private ConfigurationManager() {
        config = "App configuration";
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public String getConfig() {
        return config;
    }
}
