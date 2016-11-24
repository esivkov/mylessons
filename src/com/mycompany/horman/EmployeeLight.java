package com.mycompany.horman;

/**
 * Created by User on 24.11.2016.
 */
public class EmployeeLight {
    EmployeeLight (String n, double s){
        name = n;
        salary = s;
    }
    private String name;
    private double salary;

    public  String getName(){
        return name;
    }
    public  double getSalary(){
        return salary;
    }

    public void raiseSalary (double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
