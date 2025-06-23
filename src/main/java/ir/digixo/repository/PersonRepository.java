package ir.digixo.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import ir.digixo.entity.Person;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonRepository implements PanacheRepository<Person> {

    public Person findByFirstName(String firstName) {
        return find("firstName", firstName).firstResult();

    }
}
