package org.example.Mappers;

import org.example.dtos.rental.RentalEditDto;
import org.example.presistance.entities.Rental;
import org.mapstruct.*;

@Mapper
public interface RentalMapper {
    Rental toEntity(RentalEditDto rentalDto);

    RentalEditDto toDto(Rental rental);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Rental partialUpdate(RentalEditDto rentalDto, @MappingTarget Rental rental);

    @AfterMapping
    default void linkPayments(@MappingTarget Rental rental) {
        rental.getPayments().forEach(payment -> payment.setRental(rental));
    }
}