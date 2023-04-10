package org.example.Mappers;

import org.example.dtos.customer.CustomerEditDto;
import org.example.presistance.entities.Customer;
import org.mapstruct.*;

@Mapper
public interface CustomerEditMapper {
    Customer toEntity(CustomerEditDto customerEditDto);

    CustomerEditDto toDto(Customer customer);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Customer partialUpdate(CustomerEditDto customerEditDto, @MappingTarget Customer customer);
}