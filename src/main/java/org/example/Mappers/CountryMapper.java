package org.example.Mappers;

import org.example.dtos.CountryDto;
import org.example.presistance.entities.Country;
import org.mapstruct.Mapper;

@Mapper
public interface CountryMapper {
    CountryDto toDto(Country source);

    Country toEntity(CountryDto destination);
}
