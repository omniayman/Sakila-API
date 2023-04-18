package org.example.webServices;

import jakarta.jws.WebService;
import org.example.dtos.actor.ActorDto;
import org.example.dtos.film.FilmDto;
import org.example.presistance.exceptionHandler.InvalidDataException;
import org.example.services.ActorService;

import java.util.List;

@WebService
public class Actor {
    ActorService actorService = new ActorService();

    public List<ActorDto> getAllActors() {
        return actorService.getAllActors();
    }

    public ActorDto getActorById(int id) {
        return actorService.getActorById(id);
    }

    public void updateActor(ActorDto actorDto) {

        actorService.updateActor(actorDto);
    }

    public void addActor(ActorDto actorDto) throws InvalidDataException {
        actorService.addActor(actorDto);
    }

    public List<FilmDto> getFilmsByActorId(int id) {

        return actorService.getFilmsByActorId(id);

    }

    public List<ActorDto> getActorsByName(String name) {

        return actorService.getActorsByName(name);
    }

}

