package com.mycompany.horman;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by User on 23.11.2016.
 */
  class Employee {
    public Employee (String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();

    }
    public Employee(){

    }
    public Employee(String n, double s){
        name = n;
        salary = s;
    }


    public String getName(){
        return  name;
    }
    public  double getSalary(){
        return salary;
    }

    public Date getHireDay(){
        return hireDay;
    }

    public int getId(){
        return id;
    }

    public static int getNextId(){
        return nextId;
    }

    public void raiseSalary (double byPercent){
        double raise = salary*byPercent / 100;
        salary +=raise;
    }

    public void setId(){
        id = nextId;
        nextId++;

    }

    private String name;
    private double salary;
    private Date hireDay;
    private  int id;
    private  static int nextId = 1;
}
