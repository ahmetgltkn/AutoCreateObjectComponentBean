package com.ahmetgltkn.app.autocreate.component;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Component()
public class DateTimePrinter {

    private final LocalDateTime localDateTime;
    private final DateTimeFormatter dateTimeFormatter;

    public DateTimePrinter(LocalDateTime localDateTime,@Qualifier("com.ahmetgltkn.bean.dateTimeConfig") DateTimeFormatter dateTimeFormatter) {
        this.localDateTime = localDateTime;
        this.dateTimeFormatter = dateTimeFormatter;
    }

    @PostConstruct
    public void printDateTime(){
        String dateTime = dateTimeFormatter.format(localDateTime);
        System.out.println ("Now " + dateTime);
    }

}
