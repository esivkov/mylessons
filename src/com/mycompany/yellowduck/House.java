package com.mycompany.yellowduck;
import java.util.ArrayList;
/**
 * Created by Василий on 21.11.2016.
 */
public class House {
    protected String adress = "n/a";
    protected ArrayList<Person> listOfResidents = new ArrayList<Person>();


    public House(){

    }
    public House(String adress){

        this.adress = adress;

    }

    public String adress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void settlePerson (Person p){
        if (listOfResidents.contains(p)){
            System.out.println("He live here already");
        }
        else {
            listOfResidents.add(p);
            p.setAdress(this.adress);
        }
    }

    public void evictPerson(Person p){
        listOfResidents.remove(p);
        p.setAdress("n/a");
    }

    public void discriptionOfHouse(){
        System.out.println("------------------");
        System.out.println("# Address of this House is " +this.adress);
        System.out.println("# List of residents:  ");

        if(listOfResidents != null){
            for (int i = 0; i < listOfResidents.size(); i++){
                Person p = listOfResidents.get(i);
                System.out.println("# -" + p.name());
            }
        }
    }

}
