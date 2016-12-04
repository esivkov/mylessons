package com.mycompany.horman;

import java.util.Random;

/**
 * Created by Василий on 25.11.2016.
 */
public class EmloyeeConstruktor {

    // Три перегруженных конструктора

    public EmloyeeConstruktor(String n, double s){

        name = n;
        salary = s;
    }

    public  EmloyeeConstruktor(double s){
        // Вызов конструктора EmployeeConstruktor (String, double)
        this("EmployeeConstruktor #" + nextId, s);
    }
    // Конструктор по умолчанию
    public  EmloyeeConstruktor (){
        /* Поле name инициализируется как ""
           Полу salary задаётся неявно - инициализируется нулём
           Поле id задаётся в блоке инициализации
         */
    }
    public String getName (){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public  int getId(){
        return  id;
    }

    private static int nextId;

    private int id;
    private String name = ""; // Инициализация поля name
    private double salary;

    // Статический блок инициализации
    static {
        Random generator = new Random();
        // Задаём nextId как случайное число от 0 до 10000
        nextId = generator.nextInt(10000);
    }

    // Инициализационный блок объекта
    {
        id = nextId;
        nextId++;
    }

}
