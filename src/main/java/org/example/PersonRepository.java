package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class PersonRepository {

    private Map<Integer, Person> persons =  new HashMap<>();

    public void add(Person person) {
        persons.put(person.id(), person);
    }

    public Optional<Person> getPersonById(int id) {
        return Optional.ofNullable(persons.get(id));
    }

    public Optional<Person> getPersonByName(String name) {
        for (Person person : persons.values()) {
            if (person.name().equals(name)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public List<Person> getPersonsWithFavoriteWeekday(DayOfWeek) {

    }

    public void countPersonsByGender() {
        int [] counts = new int[Gender.values().length];
        for (Person person : persons.values()) {
            counts[person.gender().ordinal()]++;
        }
        for (Gender gender : Gender.values()) {
            System.out.printf("Found %d persons with gender %s\n", counts[gender.ordinal()], gender);
        }
    }
}
