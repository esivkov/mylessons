package com.mycompany.horman;

/**
 * Created by Василий on 05.12.2016.
 */
abstract class Test2 {
    abstract  void print();
}
public class Test extends Test2{

    @Override
     void print() {
        System.out.println("Hello");
    }

    public void main(String[] args) {
        Test test = new Test();
        test.print();
    }
}




