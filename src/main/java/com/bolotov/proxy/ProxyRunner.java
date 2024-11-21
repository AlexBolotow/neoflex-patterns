package com.bolotov.proxy;

public class ProxyRunner {

    public static void main(String[] args) {
        DatabaseConnection databaseConnection = new MyDatabaseConnectionProxy("db",
                "localhost", 5432);
        databaseConnection.connect();
    }
}
