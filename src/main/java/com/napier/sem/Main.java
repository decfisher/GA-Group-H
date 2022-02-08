package com.napier.sem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        Application app = new Application();
        app.connect();
        Employee emp = app.getEmployee(255530);
        app.displayEmployee(emp);
        app.disconnect();
    }
}
