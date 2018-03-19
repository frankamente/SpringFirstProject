package hello;

import java.util.Collection;
import java.util.HashSet;

public class ServicesManager {

    public Collection<Person> getPeople() {
        Collection<Person> people = new HashSet<>();
        people.add(new Person("Fran", 25));
        return people;
    }
}
