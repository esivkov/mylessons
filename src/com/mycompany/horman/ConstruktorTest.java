package com.mycompany.horman;

/**
 * Created by Василий on 25.11.2016.
 */
public class ConstruktorTest {
    public static void main(String[] args) {
        // Заполняет массив staff тремя объектами Employee.
        EmloyeeConstruktor [] staff = new EmloyeeConstruktor[3];
        staff [0] = new EmloyeeConstruktor("Harry", 40000);
        staff [1] = new EmloyeeConstruktor(60000);
        staff [2] = new EmloyeeConstruktor();


        // вывод информации о всех сотрудниках
        for (EmloyeeConstruktor e : staff){
            System.out.println("name = " + e.getName() + ", id = " + e.getId() + ", salary = " + e.getSalary());
        }
    }
}
