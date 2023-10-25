package com.xpanxion.assignments.student;

import java.io.File;
import java.util.Scanner;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    public Person(){

    }

    public Person(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setFirstName(String fisrtName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }


    public String toString(){
        return  "Person{id=" + this.id + ", firstName=\'" + this.firstName
                + "\', lastName=\'" + this.lastName + "\'}";
    }


}
