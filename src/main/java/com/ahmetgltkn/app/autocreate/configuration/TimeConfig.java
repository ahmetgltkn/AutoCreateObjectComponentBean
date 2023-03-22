package com.ahmetgltkn.app.autocreate.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Configuration
public class TimeConfig {

    private final LocalDateTime localDateTime;

    public TimeConfig(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Bean("com.ahmetgltkn.bean.timeConfig")
    public DateTimeFormatter getDateTimeFormatter(){
        return DateTimeFormatter.ofPattern("kk:mm:ss");
    }

    @Bean
    public LocalTime createLocalTime(){
        return localDateTime.toLocalTime();
    }
}
