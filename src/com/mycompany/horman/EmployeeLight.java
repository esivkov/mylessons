package com.mycompany.horman;

/**
 * Created by User on 24.11.2016.
 */
class EmployeeLight extends Person  {
    EmployeeLight (String n, double s){
        super(n);
        salary = s;

    }
    private String name;
    private double salary;


    public  double getSalary(){
        return salary;
    }

    public String getDescription(){
        return String.format("Employee, who is paid $%.2f", salary);
    }

    public void raiseSalary (double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
