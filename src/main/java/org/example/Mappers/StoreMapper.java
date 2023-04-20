package org.example.Mappers;

import org.example.dtos.store.StoreViewDto;
import org.example.presistance.entities.Store;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper
public interface StoreMapper {
    Store toEntity(StoreViewDto storeDto);

    StoreViewDto toDto(Store store);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Store partialUpdate(StoreViewDto storeDto, @MappingTarget Store store);
}