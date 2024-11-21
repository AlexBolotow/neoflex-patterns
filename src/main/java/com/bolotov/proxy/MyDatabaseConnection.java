package com.bolotov.proxy;

public class MyDatabaseConnection implements DatabaseConnection {

    private final String databaseName;

    public MyDatabaseConnection(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void connect() {
        System.out.println("Connected to " + databaseName);
    }
}
