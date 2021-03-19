package com.gcl.designpattern.no1_creational_pattern.no6_singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Description: 单例模式读取配置文件
 *
 * @author GUCHAOLONG
 * @date 2021/3/20 3:37
 */
public class EagerSingletonReadConfig {
    private String name;

    public String getName() {
        return name;
    }

    private EagerSingletonReadConfig(){
        readConfig();
    }

    private static EagerSingletonReadConfig instance = new EagerSingletonReadConfig();

    public static EagerSingletonReadConfig getInstance(){
        return instance;
    }

    private void readConfig(){
        Properties properties = new Properties();
        try {
            InputStream in = EagerSingletonReadConfig.class.getClassLoader().getResourceAsStream("application.properties");
            properties.load(in);
            this.name = properties.getProperty("name");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
