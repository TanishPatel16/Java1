package com.xpanxion.assignments.student;

public class Product extends Base {

    private String name;
    private double cost;


    public Product(int id, String name, double cost){
        super(id);
        this.name = name;
        this.cost = cost;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCost(double cost){
        this.cost = cost;
    }
    public double getCost(){
        return this.cost;
    }



}
