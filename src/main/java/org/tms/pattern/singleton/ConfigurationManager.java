package org.tms.pattern.singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//Одиночка
public class ConfigurationManager {
    private static ConfigurationManager instance;

    //Хранение настроек
    private Properties properties;

    // Приватный конструктор
    private ConfigurationManager() {
        properties = new Properties();
        loadConfiguration();
    }

    //Метод для получения единственного экземпляра
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    //Метод загрузки конфигураций из файлика
    private void loadConfiguration() {
        String configLocation = "src/main/resources/config.properties";
        
        try (FileInputStream input = new FileInputStream(configLocation)) {
            properties.load(input);
        } catch (IOException e) {
            System.out.println("Error loading configuration file:" + e.getMessage());
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
