package ir.digixo.controller;

import ir.digixo.entity.Person;
import ir.digixo.repository.PersonRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestResponse;

@Path("/api/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MyController {

    @Inject
    public PersonRepository personRepository;

    @POST
    @Path("/person")
    @Transactional
    public RestResponse<Person> savePerson(Person person) {
        personRepository.persist(person);
        return RestResponse.ok(person);
    }

    @GET
    @Path("/test")
    @Transactional
    public String hello() {
        return "Hello quarkus";
    }
}
