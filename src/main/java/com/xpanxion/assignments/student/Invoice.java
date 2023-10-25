package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Invoice extends Base {
    private int id;
    private ArrayList<Product> arr;

    public Invoice(int id){
        super(id);
        this.arr = new ArrayList<Product>();
    }

    public void addProduct(Product product){
        this.arr.add(product);
    }

    public double getTotalCost(){
        double totalCost = 0;
        for(int i=0; i<this.arr.size(); ++i){
            totalCost += this.arr.get(i).getCost();
        }
        return totalCost;
    }
}
