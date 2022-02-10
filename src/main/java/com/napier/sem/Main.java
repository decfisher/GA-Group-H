package com.napier.sem;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Application app = new Application();
        app.connect();
        ArrayList<Employee> employees = app.getAllSalaries();
        app.printSalaries(employees);
        app.disconnect();
    }
}
