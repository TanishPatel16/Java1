package com.xpanxion.assignments.student;
import java.util.*;

public class JavaOne {
    Scanner in = new Scanner(System.in);
    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        System.out.println("Enter your name: ");
        String str = in.nextLine();
        String ans = "";
        for(int i=0; i<str.length(); ++i){
           char ch = str.charAt(i);
           if(Character.isLowerCase(ch)){
               ans += Character.toUpperCase(ch);
           }
           else
           {
               ans += ch;
           }
        }
        System.out.println("Your name in Upper Case is: " + ans);
    }

    public void ex2() {
        System.out.println("Enter a string: ");
        String str= in.nextLine();
        int cnt = 0;
        for(int i=0 ; i<str.length(); ++i){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                cnt++;
        }
        System.out.println("Number of uppercase characters are: " + cnt);
    }

    public void ex3() {
        System.out.println("Enter a String: ");
        String str = in.nextLine();
        String arr[] = str.split(" ");
        for(int i=0; i<arr.length; ++i){
            String s = arr[i];
            if(i%2==0){
                s = s.toUpperCase();
                arr[i] = s;
            }
            else
                continue;
        }
        String ans = String.join(" ", arr);
        System.out.println(ans);
    }

    public void ex4() {
        System.out.println("Enter a string: ");
        String str = in.nextLine();
        boolean flag=false;
        for(int i=0; i<str.length()/2; ++i){
           if(str.charAt(i)!=str.charAt(str.length()-i-1))
           {
               flag=true;
               System.out.println("NO");
               break;
           }
        }
        if(!flag)
            System.out.println("YES");
    }

    public void ex5() {
        while(true){
            System.out.println("Enter a string: ");
            String str = in.nextLine();
            if(str.equals("quit"))
                break;
            int c=0;
            for(int i=0; i<str.length(); ++i){
                char ch=str.charAt(i);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                    c++;
            }
            System.out.println("Number of vowels are: " + c);
            System.out.println("Number of consonants are: " + (str.length()-c));
        }
    }

    public void ex6() {
        System.out.println("Enter first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter second number: ");
        int num2 = in.nextInt();

        System.out.println("Result :" + (num1+num2));
    }

    public void ex7() {
        System.out.println("Enter first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter second number: ");
        int num2 = in.nextInt();

        System.out.println("Enter operation (add, sub, mul, div): ");
        String str = in.next();


        double res = 0;
        if(str.equals("add")){
            res = num1 + num2;
        }
        else if(str.equals("sub")){
            res = num1 - num2;
        }
        else if(str.equals("mul")){
            res = num1 * num2;
        }
        else{
            res = num1/num2;
        }
        System.out.println("Result is: "+ res);
    }

    public void ex8() {
        System.out.print("Enter the price of the carpet per square feet: ");

        double price = in.nextDouble();

        double totalArea = 0;

        double totalCost = 0;



        // neex this to clear the line

        in.nextLine();

        while (true) {

            System.out.print("Enter the width and length of a room (or \"done\" to finish): ");

            String line = in.nextLine();



            if (line.equalsIgnoreCase("done")) {

                break;

            }



            //changed this to " "

            String[] tokens = line.split(" ");

            //changed this to index 2

//            System.out.println(tokens[0]);
//
//            System.out.println(tokens[1]);

            double width = Double.parseDouble(tokens[0]);

            double length = Double.parseDouble(tokens[1]);



            double area = width * length;

            double cost = area * price;

            totalArea += area;

            totalCost += cost;

        }



        in.close();





        System.out.println("The total cost of the carpet installation job is $" + totalCost + ".");
    }

    public void ex9() {
        int mx=5, mn=1;
        Random rand = new Random();
        int n = rand.nextInt(mx - mn + 1) + mn;
        while(true) {
            System.out.println("Guess the number: ");
            int x = in.nextInt();
            if(x==n)
            {
                System.out.println("The guess is correct");
                break;
            }
            else if(x<n)
            {
                System.out.println("Too low, try again.");
            }
            else
            {
                System.out.println("Too high, try again.");
            }
        }
    }

    public void ex10() {
        System.out.println("Enter a string: ");
        String str = in.nextLine();
        String arr[] = str.split(" ");
        for(int i=0 ; i<arr.length; ++i){
            int spaces = 0;
            String s = arr[i];
            for(int j=0; j<s.length(); ++j){
                for(int k=0; k<spaces; ++k){
                    System.out.print(' ');
                }
                spaces++;
                System.out.println(arr[i].charAt(j));
            }
        }
    }

    //
    // Private helper methods
    //
}
