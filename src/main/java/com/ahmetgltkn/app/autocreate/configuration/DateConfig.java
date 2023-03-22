package com.ahmetgltkn.app.autocreate.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Configuration
public class DateConfig {

    @Bean("com.ahmetgltkn.bean.dateConfig")
    public DateTimeFormatter getDateFormatter(){
        return DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    @Bean
    public LocalDate createToday(){
        return LocalDate.now();
    }
}
