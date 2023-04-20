package org.example.webServices;

import jakarta.jws.WebService;
import org.example.dtos.store.StoreViewDto;
import org.example.dtos.address.AddressDto;
import org.example.dtos.customer.CustomerDto;
import org.example.dtos.customer.CustomerEditDto;
import org.example.dtos.payment.PaymentViewDto;
import org.example.dtos.rental.RentalEditDto;
import org.example.services.CustomerService;

import java.util.List;

@WebService


public class Customer {
    public void add(CustomerEditDto customerDto) {
        CustomerService customerService = new CustomerService();
        customerService.addCustomer(customerDto);

    }

    public void update(CustomerEditDto customerDto) {
        System.out.println(customerDto);
        CustomerService customerService = new CustomerService();
        customerService.updateCustomer(customerDto);

    }

    public List<CustomerDto> getAll() {
        CustomerService customerService = new CustomerService();
        List<CustomerDto> customer = customerService.getAllCustomer();
        for (CustomerDto customerDto : customer
        ) {
            System.out.println(customerDto);
        }
        return customer;
    }

    public CustomerDto getCustomerById(int id) {
        CustomerService customerService = new CustomerService();

        return customerService.getCustomerById(id);
    }


    public StoreViewDto getHomeStore(int id) {
        System.out.println(id);
        CustomerService customerService = new CustomerService();

        return customerService.getCustomerHomeStore(id);
    }

    public AddressDto getCustomerAddress(int id) {
        CustomerService customerService = new CustomerService();

        return customerService.getCustomerAddress(id);
    }

    public List<RentalEditDto> getCustomerRents(int id) {
        CustomerService customerService = new CustomerService();

        return customerService.getCustomerRents(id);
    }

    public List<PaymentViewDto> getCustomerPayments(int id) {
        CustomerService customerService = new CustomerService();

        return customerService.getCustomerPayments(id);
    }

}
