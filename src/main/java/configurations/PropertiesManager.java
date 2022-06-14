package configurations;


import util.PropertiesReader;

public class PropertiesManager {

    private PropertiesManager() {
    }

    public static String getBaseUrl() {
        return PropertiesReader.readProperties("base_url");
    }

    public static String getChromeDriver() {
        return PropertiesReader.readProperties("chrome_driver");
    }

    public static String getChromeDriverPath() {
        return PropertiesReader.readProperties("chrome_driver_path");
    }

    public static Integer getImplicitTime() {
        return Integer.parseInt("15");
    }

}

