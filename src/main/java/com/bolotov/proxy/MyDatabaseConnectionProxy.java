package com.bolotov.proxy;

public class MyDatabaseConnectionProxy implements DatabaseConnection {

    private final String databaseName;

    private final String host;

    private final int port;

    private MyDatabaseConnection myDatabaseConnection;

    public MyDatabaseConnectionProxy(String databaseName, String host, int port) {
        this.databaseName = databaseName;
        this.host = host;
        this.port = port;
    }

    @Override
    public void connect() {
        if (myDatabaseConnection == null) {
            String url = host + ":" + port + "/" + databaseName;
            myDatabaseConnection = new MyDatabaseConnection(url);
        }

        myDatabaseConnection.connect();
    }
}
