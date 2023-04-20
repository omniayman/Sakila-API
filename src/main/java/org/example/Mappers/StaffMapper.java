package org.example.Mappers;

import org.example.dtos.Staff.StaffEditDto;
import org.example.presistance.entities.Staff;
import org.mapstruct.Mapper;

@Mapper
public interface StaffMapper {
    Staff toEntity(StaffEditDto staffDto);

    StaffEditDto toDto(Staff staff);

}