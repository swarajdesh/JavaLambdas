package unit3;

import com.company.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Sam","Cornel",88),
                new Person("shyam","Botez",58),
                new Person("Ram","Agadmator",38),
                new Person("Charles","Agad",38)
        );


        System.out.println("Print all peoples");
        printCondionally(people, p -> true, System.out::println);
        // p -> System.out.println(p) == System.out::println

    }

    private static void printCondionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
        for (Person p:
                people) {
            if (predicate.test(p)){
                consumer.accept(p);
            }
        }
    }
}


