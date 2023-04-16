package org.example.webServices;

import jakarta.jws.WebService;
import org.example.Mappers.film.FilmMapper;
import org.example.dtos.actor.ActorDto;
import org.example.dtos.film.FilmDto;
import org.example.presistance.entities.Film;
import org.example.services.ActorService;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService
public class Actor {
    ActorService actorService=new ActorService();

    public List<ActorDto> getAllActors(){
        return  actorService.getAllActors();
    }
    public ActorDto getActorById(int id){
        return actorService.getActorById(id);
    }
    public void updateActor(ActorDto actorDto) {

        actorService.updateActor(actorDto);
    }

    public void addActor(ActorDto actorDto) {
        actorService.addActor(actorDto);
    }
    public List<FilmDto> getFilmsByActorId(int id) {

        return actorService.getFilmsByActorId(id);

    }
    public List<ActorDto> getActorsByName(String name) {

        return actorService.getActorsByName(name);
    }

}

