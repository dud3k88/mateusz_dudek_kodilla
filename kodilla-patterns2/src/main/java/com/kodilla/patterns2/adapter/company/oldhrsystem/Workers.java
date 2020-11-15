package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"75443948234", "John", "Smith"},
            {"23942342344", "John1", "Smith1"},
            {"34534534532", "John2", "Smith2"},
            {"45234523523", "John3", "Smith3"},
            {"12312331233", "John4", "Smith4"},
            {"23512355235", "John5", "Smith5"}};

    private double [] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00};
    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][3] + ", " + salaries[n];
    }
    public String[][] getWorkers() {
        return workers;
    }
    public double[] getSalaries() {
        return salaries;
    }
}
