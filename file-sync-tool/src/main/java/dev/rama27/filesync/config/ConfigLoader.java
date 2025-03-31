package dev.rama27.filesync.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
    private Properties properties;
    public ConfigLoader(String configPath){
        properties=new Properties();
        try(FileInputStream input=new FileInputStream(configPath)){
            properties.load(input);
        }
        catch (IOException ie){
            ie.printStackTrace();
        }
    }
    public String getProperty(String key){
        return properties.getProperty(key);
    }
}
