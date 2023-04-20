package org.example.webServices;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.dtos.Staff.StaffEditDto;
import org.example.dtos.store.StoreViewDto;
import org.example.dtos.address.AddressDto;
import org.example.dtos.address.AddressEditDto;
import org.example.dtos.customer.CustomerDto;
import org.example.services.AddressService;

import java.util.List;

@WebService
public class Address {

    @WebMethod
    public List<AddressDto> getAll() {
        AddressService addressService = new AddressService();
        List<AddressDto> addresses = addressService.getAllAddresses();

        return addresses;
    }

    @WebMethod
    public AddressDto getAddressById(@WebParam(name = "id") int id) {
        AddressService addressService = new AddressService();

        return addressService.getAddressById(id);
    }

    @WebMethod
    public List<CustomerDto> getCustomerByAddress(@WebParam(name = "id") int id) {
        AddressService addressService = new AddressService();
        return addressService.getCustomerByAddress(id);
    }

    public List<StaffEditDto> getStaffByAddress(@WebParam(name = "id") int id) {
        AddressService addressService = new AddressService();
        return addressService.getStaffByAddress(id);
    }

    @WebMethod
    public List<StoreViewDto> getStoreByAddress(@WebParam(name = "id") int id) {
        AddressService addressService = new AddressService();
        return addressService.getStoreByAddress(id);
    }

    @WebMethod

    public void addAddress(@WebParam(name = "address") AddressEditDto addressDto) {
        AddressService addressService = new AddressService();
        addressService.addAddress(addressDto);

    }

    @WebMethod
    public void updateAddress(@WebParam(name = "address") AddressEditDto addressDto) {

        AddressService addressService = new AddressService();
        addressService.updateAddress(addressDto);

    }


}
