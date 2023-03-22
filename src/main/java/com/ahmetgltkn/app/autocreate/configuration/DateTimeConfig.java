package com.ahmetgltkn.app.autocreate.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Configuration
public class DateTimeConfig {

    @Bean("com.ahmetgltkn.bean.dateTimeConfig")
    public DateTimeFormatter getDateFormatter(){
        return DateTimeFormatter.ofPattern("dd/MM/yyyy kk:mm:ss");
    }

    @Bean
    public LocalDateTime createNow(){
        System.out.println("DateTimeConfig.getNow");
        return LocalDateTime.now();
    }
}
