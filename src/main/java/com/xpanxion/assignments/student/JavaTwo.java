package com.xpanxion.assignments.student;
import java.util.*;
import java.text.*;
import java.util.stream.Collectors;
import java.util.LinkedList;
import java.util.Queue;
public class JavaTwo {
    Scanner in = new Scanner(System.in);
    //
    // Constructors
    //

    public JavaTwo() {}

    //
    // Public methods
    //

    public void ex1() {
        Scanner in = new Scanner(System.in);
        ArrayList<Person>arr = new ArrayList<>();
        while(true){
            System.out.print("Enter Person: ");
            String str = in.nextLine();
            if(str.equals("done"))
                break;
            String[] tokens = str.split(" ");

            int id=0;
            for(int i=0; i<tokens[0].length(); ++i){
                if(tokens[0].charAt(i)>='0' && tokens[0].charAt(i)<='9')
                    id += tokens[0].charAt(i) - '0';
            }
            String firstName = tokens[1];
            String lastName = tokens[2];
            arr.add(new Person(id, firstName, lastName));
        }
        for(int i=0; i<arr.size(); ++i){
            System.out.println(arr.get(i).toString());
        }
    }

    public void ex2() {
       HashMap<Integer, Person> mp= new HashMap<Integer, Person>();
       mp.put(1, new Person(1, "Peter", "Jones"));
       mp.put(2, new Person(2, "John", "Smith"));
       mp.put(3, new Person(3, "Mary", "Jane"));

       while(true){
           System.out.print("Enter Person ID: ");
           String str = in.nextLine();
           if(str.equals("done"))
               break;
           int id = Integer.parseInt(str);
           if(mp.get(id)!=null){
               System.out.println(mp.get(id).toString());
           }
           else {
               System.out.println("Record not found");
           }
       }

    }

    public void ex3() {
        var invoice = new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex4() {
        var invoice = new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex5() {
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }

    public void ex6() {
        Calculator cl = new Calculator();
        cl.run();
    }

    public void ex7() {
        List<Person> personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );

        List<Person> newPersonList = personList.stream().map(person -> new Person(person.getId(), person.getFirstName(), "xxx")).collect(Collectors.toList());
        for (Person p : newPersonList) {
            System.out.println(p);
        }
    }

    public boolean compare(Person p1, Person p2){
        String s1 = p1.getFirstName();
        String s2 = p2.getFirstName();
        int comp = s1.compareTo(s2);
        if(comp<0)
            return true;
        else{
            if(p1.getLastName().compareTo(p2.getLastName())<0){
                return true;
            }
            return false;
        }
    }



    public void ex8() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        for(int i=0; i<personList.size(); ++i){
            for(int j=i+1; j<personList.size(); ++j){
                if(!compare(personList.get(i), personList.get(j))){
                    Person temp = personList.get(i);
                    personList.set(i, personList.get(j));
                    personList.set(j, temp);
                }
            }
        }

        for (Person p : personList) {
            System.out.println(p);
        }
    }

    public void ex9() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        List<Person>filteredList = personList.stream().filter(p->p.getLastName().equals("Smith")).collect(Collectors.toList());
        for (Person p : filteredList) {
            System.out.println(p);
        }
    }

    public void ex10() {
        Queue<Cat> queue = new LinkedList<>();

        queue.add(new Cat("Alice"));
        queue.add(new Cat("Bob"));
        queue.add(new Cat("Charlie"));
        queue.add(new Cat("Dan"));

        while(!queue.isEmpty()){
            System.out.println(queue);
            queue.remove();
        }
    }
}
