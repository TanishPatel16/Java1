package com.xpanxion.assignments.student;

public class Repository implements DataAccess {
    public Person getPerson(){
        return new Person(1, "John", "Doe");
    }
}
