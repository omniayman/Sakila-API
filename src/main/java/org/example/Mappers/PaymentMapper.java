package org.example.Mappers;

import org.example.dtos.PaymentDto;
import org.example.presistance.entities.Payment;
import org.mapstruct.*;

@Mapper
public interface PaymentMapper {
    Payment toEntity(PaymentDto paymentDto);

    PaymentDto toDto(Payment payment);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Payment partialUpdate(PaymentDto paymentDto, @MappingTarget Payment payment);
}