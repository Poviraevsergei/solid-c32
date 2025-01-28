package org.tms.pattern.singleton;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager configurationManager = ConfigurationManager.getInstance();

        System.out.println(configurationManager.getProperty("database.url"));

    }
}
