package com.mycompany.horman;

/**
 * Created by Василий on 01.12.2016.
 */
public class Manager extends Employee {
    /**
     @param n имя сотрудника
     @param s Зарплата
     @param year год найма
     @param month месяц
     @param day день
     */

    public Manager (String n, double s, int year, int month, int day){
        super(n, s, year, month, day);
        bonus = 0;
    }



    public Manager (String n, double s){
        super(n, s);
        bonus = 0;
    }


    public double getSalary() {
        double baseSalary = super.getSalary();
        return  baseSalary + bonus;
    }
    private  String a;


    public String getName(){
        String easyName = super.getName();
        return "mr " + easyName;

    }

    public  void setBonus (double b){
        bonus = b;
    }

    private  double bonus;
}

