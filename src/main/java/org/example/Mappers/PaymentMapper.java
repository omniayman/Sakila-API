package org.example.Mappers;

import org.example.dtos.payment.PaymentViewDto;
import org.example.presistance.entities.Payment;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper
public interface PaymentMapper {
    Payment toEntity(PaymentViewDto paymentDto);

    PaymentViewDto toDto(Payment payment);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Payment partialUpdate(PaymentViewDto paymentDto, @MappingTarget Payment payment);
}