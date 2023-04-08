package org.example.Mappers;

import org.example.dtos.CityDto;
import org.example.presistance.entities.City;
import org.mapstruct.Mapper;

@Mapper
public interface CityMapper {
    CityDto toDto(City source);
    City toEntity(CityDto destination); 
}
