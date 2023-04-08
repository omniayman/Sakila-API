package org.example.Mappers;

import org.example.dtos.StoreDto;
import org.example.presistance.entities.Store;
import org.mapstruct.*;

@Mapper
public interface StoreMapper {
    Store toEntity(StoreDto storeDto);

    StoreDto toDto(Store store);


}