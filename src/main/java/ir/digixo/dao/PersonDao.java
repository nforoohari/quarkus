package ir.digixo.dao;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class PersonDao {

    @Inject
    public EntityManager entityManager;


}
