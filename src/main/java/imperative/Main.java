package imperative;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {


    public static void main(String[] args) {
        List<Person> people = List.of(new Person("john", MALE),
                new Person("john", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                 new Person("Alice", MALE)
    );

        // declarative approach

        people.stream().filter(person -> person.gender.equals(FEMALE))
                 .collect(Collectors.toList()).forEach((value)->{
                     System.out.println(value);
                });


    }

    record Person(String name, Gender gender) {

    }

    enum  Gender{
        MALE, FEMALE;
    }
}


