package com.ahmetgltkn.app.autocreate.component;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component()
public class DatePrinter {

    private final LocalDate localDate;
    private final DateTimeFormatter dateTimeFormatter;

    public DatePrinter(LocalDate localDate,@Qualifier("com.ahmetgltkn.bean.dateConfig") DateTimeFormatter dateTimeFormatter) {
        this.localDate = localDate;
        this.dateTimeFormatter = dateTimeFormatter;
    }

    @PostConstruct
    public void printDate(){
        var today = dateTimeFormatter.format(localDate);
        System.out.println("Today " + today);
    }

}
