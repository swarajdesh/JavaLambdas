package com.company.unit1;

import java.util.*;

public class Unit1ExerciseSolutionJava7 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Sam","Cornel",88),
                new Person("shyam","Botez",58),
                new Person("Ram","Agadmator",38),
                new Person("Charles","Agad",38)
                );

        //Step 1 : Sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        //Step 2 : Create a method that prints all elements in the list
        System.out.println("Print all peoples");
        printAll(people);


        //Step 3 : Create a method that prints all the people that have last name begining with C
        System.out.println("Print all peoples whose last name starts with C");
        printCondionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });

        System.out.println("Print all peoples whose first name starts with C");
        printCondionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("C");
            }
        });

    }

    private static void printCondionally(List<Person> people, Condition condition){
        for (Person p:
             people) {
            if (condition.test(p)){
                System.out.println(p);
            }
        }


    }

//    private static void printLastNameBeginningWithC(List<Person> people) {
//        for (Person p:
//                people  ) {
//            if (p.getLastName().startsWith("C")) {
//                System.out.println(p);
//            }
//        }
//    }



    private static void printAll(List<Person> people) {
        for (Person p:
            people  ) {
            System.out.println(p);
        }
        
    }
}

interface Condition{
    boolean test(Person p);
}
