package com.Bitrix24.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();


    static {

        String path = "configuration.properties";

        try {
            FileInputStream file = new FileInputStream(path);

            properties.load(file);
            file.close();


        } catch (Exception e) {
            System.out.println("Properties not found");
            e.printStackTrace();
        }


    }

    public static String getProperty(String keyWord) {
        return properties.getProperty(keyWord);
    }


}
