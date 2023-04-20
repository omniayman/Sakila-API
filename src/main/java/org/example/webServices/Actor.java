package org.example.webServices;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.dtos.actor.ActorDto;
import org.example.dtos.film.FilmDto;
import org.example.presistance.exceptionHandler.InvalidDataException;
import org.example.services.ActorService;

import java.util.List;

@WebService
public class Actor {
    ActorService actorService = new ActorService();

    @WebMethod
    public List<ActorDto> getAllActors() {
        return actorService.getAllActors();
    }

    @WebMethod
    public ActorDto getActorById(@WebParam(name = "id") int id) {
        return actorService.getActorById(id);
    }

    @WebMethod
    public void updateActor(@WebParam(name = "actor") ActorDto actorDto) {

        actorService.updateActor(actorDto);
    }

    @WebMethod
    public void addActor(@WebParam(name = "actor") ActorDto actorDto) throws InvalidDataException {
        actorService.addActor(actorDto);
    }

    @WebMethod
    public List<FilmDto> getFilmsByActorId(@WebParam(name = "id") int id) {

        return actorService.getFilmsByActorId(id);

    }

    @WebMethod
    public List<ActorDto> getActorsByName(@WebParam(name = "name") String name) {

        return actorService.getActorsByName(name);
    }

}

