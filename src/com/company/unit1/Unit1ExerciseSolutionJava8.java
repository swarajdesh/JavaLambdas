package com.company.unit1;

import com.company.unit1.Person;

import java.util.*;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Sam","Cornel",88),
                new Person("shyam","Botez",58),
                new Person("Ram","Agadmator",38),
                new Person("Charles","Agad",38)
        );

        //Step 1 : Sort list by last name
        Collections.sort(people, ( p1,  p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //Step 2 : Create a method that prints all elements in the list
        System.out.println("Print all peoples");
        printCondionally(people, p -> true);


        //Step 3 : Create a method that prints all the people that have last name begining with C
        System.out.println("Print all peoples whose last name starts with C");
        printCondionally(people, p -> p.getLastName().startsWith("C"));

        System.out.println("Print all peoples whose first name starts with C");
        printCondionally(people, p -> p.getFirstName().startsWith("C"));

    }

    private static void printCondionally(List<Person> people, Condition condition){
        for (Person p:
                people) {
            if (condition.test(p)){
                System.out.println(p);
            }
        }
    }
}

