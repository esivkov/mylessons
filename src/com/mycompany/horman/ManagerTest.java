package com.mycompany.horman;

/**
 * Created by vasya on 05/12/16.
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);
        Employee [] staff = new Employee [3];

        staff [0] = boss;
        staff [1] = new Employee("Harry Hacker", 50000, 1995, 7, 3);
        staff [2]= new Employee("Tommy Tester", 45000, 2001, 3, 20);

        for (Employee e: staff){
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary());
        }


    }
}
