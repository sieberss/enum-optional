package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        PersonRepository personRepository = new PersonRepository();
        personRepository.add(new Person(1, "Peter", DayOfWeek.MONDAY, Gender.MALE));
        personRepository.add(new Person(2, "Jack", DayOfWeek.TUESDAY, Gender.MALE));
        personRepository.add(new Person(3, "Tony", DayOfWeek.WEDNESDAY, Gender.DIVERSE));
        printPerson(personRepository.getPersonById(1));
        printPerson(personRepository.getPersonById(2));
        printPerson(personRepository.getPersonById(7));

        personRepository.countPersonsByGender();

        System.out.println(personRepository.getPersonsWithFavoriteWeekday(DayOfWeek.MONDAY));
        System.out.println(personRepository.getPersonsWithFavoriteWeekday(DayOfWeek.TUESDAY));
        System.out.println(personRepository.getPersonsWithFavoriteWeekday(DayOfWeek.WEDNESDAY));
        System.out.println(personRepository.getPersonsWithFavoriteWeekday(DayOfWeek.THURSDAY));
    }

    public static void printPerson(Optional<Person> person) {
        if (person.isEmpty()) {
            System.out.println("Person not found");
        }
        else {
            System.out.printf("Favorite day of %s is %s \n", person.get().name(), person.get().favoriteDay());
        }
    }
}