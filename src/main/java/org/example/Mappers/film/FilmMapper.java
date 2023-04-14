package org.example.Mappers.film;

import org.example.dtos.film.FilmDto;
import org.example.presistance.entities.Film;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FilmMapper {
    @Mapping(target = "inventoryIds", expression = "java(inventoriesToInventoryIds(film.getInventories()))")
    @Mapping(target = "filmCategoryLastUpdates", expression = "java(filmCategoriesToFilmCategoryLastUpdates(film.getFilmCategories()))")
    @Mapping(source = "filmActorIds", target = "id")
    @Mapping(source = "originalLanguageId", target = "originalLanguage.id")
    @Mapping(source = "languageId", target = "language.id")
    Film toEntity(FilmDto filmDto);

    @InheritInverseConfiguration(name = "toEntity")
    FilmDto toDto(Film film);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Film partialUpdate(FilmDto filmDto, @MappingTarget Film film);
}