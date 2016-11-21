package com.mycompany.yellowduck;

/**
 * Created by Василий on 21.11.2016.
 */
public class Person {
    protected String name = "n/a";
    protected int age =0;
    protected String adress = "n/a";


    public Person(){

    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void setName (String n){
        this.name = n;
    }

    public String name(){
        return this.name;
    }

    public void setAge (int a){
        this.age = a;
    }

    public int age(){
        return  this.age;
    }

    public void setAdress(String ad){
        this.adress = ad;
    }
    public  String adress(){
        return this.adress;
    }



    public  void descriptionOfPerson(){
        System.out.println("--------------------");
        System.out.println("My name is " + name);
        System.out.println("I'm " + age + "years old");
        System.out.println("My adress is " +adress );
    }

    static  void  testStatic(){
        System.out.println("I'm static!");
    }


}
