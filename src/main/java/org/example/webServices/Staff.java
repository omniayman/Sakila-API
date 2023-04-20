package org.example.webServices;


import jakarta.jws.WebService;
import org.example.dtos.Staff.StaffDto;
import org.example.dtos.address.AddressDto;
import org.example.dtos.payment.PaymentViewDto;
import org.example.dtos.rental.RentalEditDto;
import org.example.presistance.exceptionHandler.InvalidDataException;
import org.example.services.StaffService;

import java.util.List;

@WebService
public class Staff {
    StaffService staffService = new StaffService();

    public List<StaffDto> getAllStaff() {
        System.out.println(staffService.getAllStaff().get(0).getAddressId());
        return staffService.getAllStaff();
    }

    public StaffDto getStaffById(int id) {
        return staffService.getStaffById(id);
    }

    public void updateStaff(StaffDto staffDto) {

        staffService.updateStaff(staffDto);
    }

    public void addStaff(StaffDto staffDto) throws InvalidDataException {
        staffService.addStaff(staffDto);
    }

//    public StoreDto getStaffStore(int id) {
//
//        return staffService.getStaffStore(id);
//    }


    public List<RentalEditDto> getStaffRentals(int id) {

        return staffService.getStaffRentals(id);
    }


    public List<PaymentViewDto> getStaffPayments(int id) {

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
