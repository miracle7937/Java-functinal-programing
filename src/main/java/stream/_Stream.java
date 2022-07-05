package stream;


import java.util.List;

import static stream.Gender.FEMALE;
import static stream.Gender.MALE;


public class _Stream {


    public static void main(String[] args) {
        List<Person> people = List.of(new Person("john", MALE),
                new Person("john", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alice", MALE));



        people.stream().map(person -> person.name() ).mapToInt(value -> value.length()).forEach(System.out::println);
    }
}

record Person(String name, Gender gender) {

}

enum  Gender{
    MALE, FEMALE;
}

