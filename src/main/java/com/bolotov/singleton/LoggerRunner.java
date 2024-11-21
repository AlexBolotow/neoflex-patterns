package com.bolotov.singleton;

import java.time.LocalDate;

public class LoggerRunner {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        Object object = new Object();
        logger.classLogg(object, "its object");

        LocalDate localDate = LocalDate.now();
        logger.classLogg(localDate, "its local date");
    }
}
