package com.bolotov.singleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static Logger logger;

    private Logger() {}

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }

        return logger;
    }

    public void classLogg(Object obj, String info) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
        String date = LocalDate.now().format(formatter);
        String className = obj.getClass().getSimpleName();
        System.out.println("Log info: " + date + " - " + className + " - " + info);
    }
}
