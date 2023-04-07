package org.example.api.soap.webServices;

import jakarta.jws.WebService;
import org.example.dtos.CustomerDto;
import org.example.services.CustomerService;

import java.util.List;

@WebService
public class Customer {
    public void add(CustomerDto customerDto) {
        CustomerService customerService=new CustomerService();
        customerService.addCustomer(customerDto);

    }
    public void update(CustomerDto customerDto) {
        CustomerService customerService=new CustomerService();
        customerService.updateCustomer(customerDto);

    }
    public List<CustomerDto> getAll() {
        CustomerService customerService=new CustomerService();

        return  customerService.getAllCustomer();
    }
    public String getCustomerById(int id) {
        CustomerService customerService=new CustomerService();

        return  customerService.getCustomerById(id).getFirstName();
    }
    public void delete(int id) {
        CustomerService customerService=new CustomerService();

        customerService.deleteCustomer(id);
    }
}
