package com.iwhalecloud.chinatower.dataqualitymonitor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.iwhalecloud.chinatower.dataqualitymonitor"})
@MapperScan(value = { "com.iwhalecloud.chinatower.dataqualitymonitor.mapper" })
public class DataQualityMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataQualityMonitorApplication.class, args);
    }

}
