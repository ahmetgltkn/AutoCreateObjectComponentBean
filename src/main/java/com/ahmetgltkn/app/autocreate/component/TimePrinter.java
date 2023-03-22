package com.ahmetgltkn.app.autocreate.component;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Component()
public class TimePrinter {

    private final LocalTime localTime;
    private final DateTimeFormatter dateTimeFormatter;

    public TimePrinter(LocalTime localTime,@Qualifier("com.ahmetgltkn.bean.timeConfig") DateTimeFormatter dateTimeFormatter) {
        this.localTime = localTime;
        this.dateTimeFormatter = dateTimeFormatter;
    }

    @PostConstruct
    public void printTime(){
        String today = dateTimeFormatter.format(localTime);
        System.out.println ("Now Time: " + today);
    }
}
