package com.mycompany.horman;

/**
 * Created by vasya on 05/12/16.
 */
abstract class Person{
    private String name;
    public Person (String name){
        this.name = name;
    }


    public abstract String getDescription();

    public String getName() {
        return name;
    }
}


class  Student extends Person{

    private String major;

    /**
     @param n name of the student
     @param m spesialization of the student
     */

    public Student(String n, String m){

        super(n);
        major = m;

    }

    public String getDescription (){
       return  "student, who study " + major;
    }


}
public class PersonTest{
    public static void main(String[] args) {
        Person [] people = new Person[2];

        people [0] = new EmployeeLight("Stepan", 10000);
        people [1] = new Student("Masha", "programmer");

        for (Person p: people){
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}






