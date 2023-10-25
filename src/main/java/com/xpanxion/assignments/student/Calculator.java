package com.xpanxion.assignments.student;
import java.util.ArrayList;
import java.util.*;

public class Calculator {
    Scanner in = new Scanner(System.in);
    private ArrayList<String> arr;

    public Calculator(){
        this.arr = new ArrayList<String>();
    }

    public void run(){
        while(true){
            System.out.println("Enter first number: ");
            String s1 = in.nextLine();
            if(s1.equals("done")){
                this.getHistory();
                break;
            }
            int num1 = Integer.parseInt(s1);
            System.out.println("Enter second number: ");
            int num2 = in.nextInt();

            System.out.println("Enter operation (add, sub, mul, div): ");
            String str = in.next();


            double res = 0;
            char operand;
            if(str.equals("add")){
                res = num1 + num2;
                operand = '+';
            }
            else if(str.equals("sub")){
                res = num1 - num2;
                operand = '-';
            }
            else if(str.equals("mul")){
                res = num1 * num2;
                operand = '*';
            }
            else{
                res = num1/num2;
                operand = '/';
            }
            System.out.println("Result is: "+ res);
            String s="";
            s+=(num1);
            s+=" ";
            s+=operand;
            s+=" ";
            s+=(num2);
            s+=(" = ");
            s+=String.valueOf(res);
            arr.add(s);
            in.nextLine();
        }

    }

    public void getHistory(){
        for(int i=0; i<this.arr.size(); ++i) {
            System.out.println(arr.get(i));
        }
    }
}
