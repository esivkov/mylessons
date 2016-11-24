package com.mycompany.horman;

/**
 * Created by User on 24.11.2016.
 */
public class ParamTest {

    public static void main(String[] args) {
        // Тест1: Метод не может изменить числовые параметры
        System.out.println("Тестирование увеличение значения");
        double percent = 10;
        System.out.println("До: percent = " + percent);
        tripleValue (percent);
        System.out.println("После: percent = " + percent);


        // Тест 2: метод может изменить состояние объекта, который передаётся в качестве аргумента
        System.out.println("\nТестирование tripleSalary");
        EmployeeLight harry = new EmployeeLight("Harry",50000);
        System.out.println("До: salary = "+ harry.getSalary());
        tripleSalary (harry);
        System.out.println("После: salary = "+ harry.getSalary());

        /*
        Тест 3: методы не могут приписывать новые объекты параметрам,
        являющимся ссылками на объекты
        */
        System.out.println("\nТестирование swap");
        EmployeeLight a = new EmployeeLight("Alise", 80000);
        EmployeeLight b = new EmployeeLight("Bob", 65000);
        System.out.println("До: а = " + a.getName());
        System.out.println("До: b = " + b.getName());
        swap (a, b);
        System.out.println("После: а = " + a.getName());
        System.out.println("После: b = " + b.getName());
    }

    public static void tripleValue (double x) // не работает
    {
        x = 3 * x;
        System.out.println("В конце метода x = " + x);
    }

    public  static  void  tripleSalary (EmployeeLight x)// работает
    {
        x.raiseSalary(200);
        System.out.println("В конце метода: salary = " + x.getSalary() );
    }
    public   static void swap (EmployeeLight x, EmployeeLight y){
        EmployeeLight temp = x;
        x = y;
        y = temp;
        System.out.println("В конце метода: x = " + x.getName());
        System.out.println("В конце метода: y = " + x.getName());

    }
}
