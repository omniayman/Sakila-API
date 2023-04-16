package org.example.webServices;


import jakarta.jws.WebService;
import org.example.Mappers.PaymentMapper;
import org.example.Mappers.RentalMapper;
import org.example.Mappers.StoreMapper;
import org.example.Mappers.address.AddressMapper;
import org.example.dtos.PaymentDto;
import org.example.dtos.RentalDto;
import org.example.dtos.Staff.StaffDto;
import org.example.dtos.StoreDto;
import org.example.dtos.actor.ActorDto;
import org.example.dtos.address.AddressDto;
import org.example.presistance.entities.Payment;
import org.example.presistance.entities.Rental;
import org.example.services.StaffService;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@WebService
public class Staff {
    StaffService staffService =new StaffService();

    public List<StaffDto> getAllStaff(){
        System.out.println(staffService.getAllStaff().get(0).getAddressId());
        return  staffService.getAllStaff();
    }
    public StaffDto getStaffById(int id){
        return staffService.getStaffById(id);
    }
    public void updateStaff(StaffDto staffDto) {

        staffService.updateStaff(staffDto);
    }

    public void addStaff(StaffDto staffDto) {
        staffService.addStaff(staffDto);
    }

//    public StoreDto getStaffStore(int id) {
//
//        return staffService.getStaffStore(id);
//    }


    public List<RentalDto> getStaffRentals(int id) {

        return staffService.getStaffRentals(id);
    }


    public List<PaymentDto> getStaffPayments(int id) {

        return staffService.getStaffPayments(id);
    }


    public boolean checkStaffManager(int id) {

        return staffService.checkStaffManager(id);
    }


    public long getNumberActiveStaff() {

        return staffService.getNumberActiveStaff();
    }


    public List<StaffDto> getStaffByName(String name) {


        return staffService.getStaffByName(name);

    }


    public AddressDto getStaffAddress(int id) {


        return staffService.getStaffAddress(id);

    }
}
