package com.mycompany.horman;

import javax.swing.*;

/**
 * Created by User on 23.11.2016.
 */
public class EmployeeTest {
    public static void main(String[] args) {

        Employee[] staff = new Employee [3];

        staff [0] = new Employee("Carl", 75000, 1978, 12, 15);
        staff [1] = new Employee("John", 60000, 1964, 10, 1);
        staff [2] = new Employee("Igor", 45000, 1980, 2, 4);

        String input = JOptionPane.showInputDialog("На сколько процентов повысить зарплату?");
        double percent = Double.parseDouble(input);

        for (Employee e : staff){
            e.raiseSalary(percent);
        }


        for (Employee e : staff){
            e.setId();
            System.out.println("№ " + e.getId() + ", name = " + e.getName() + ", salary =" + e.getSalary() + ", hireDay =" + e.getHireDay() );
        }

        int n = Employee.getNextId();
        System.out.println("Next available id is " + n);



    }
}
