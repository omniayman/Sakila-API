package org.example.Mappers;

import org.example.dtos.CustomerDto;
import org.example.presistance.entities.Customer;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto toDto(Customer source);
    Customer toEntity(CustomerDto destination);
}
