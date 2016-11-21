package com.mycompany.yellowduck;

/**
 * Created by Василий on 21.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Mike", 23);
        Person person2 = new Person();
        House house = new House("2 street");




        person2.setName("John");
        person2.setAge(32);

        house.settlePerson(person1);
        house.settlePerson(person2);


        person1.descriptionOfPerson();
        person2.descriptionOfPerson();

        house.discriptionOfHouse();

        Person.testStatic();



    }
}
