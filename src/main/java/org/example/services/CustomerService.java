package org.example.services;

import org.example.Mappers.CustomerMapper;
import org.example.dtos.CustomerDto;
import org.example.presistance.daos.impl.CustomerDaoImpl;
import org.example.presistance.entities.Customer;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private CustomerMapper mapper;
    private CustomerDaoImpl customerDao;

    public CustomerService() {
        customerDao = new CustomerDaoImpl();
        mapper = Mappers.getMapper(CustomerMapper.class);
    }

    public List<CustomerDto> getAllCustomer(){
        List<Customer> customers = customerDao.findAll();
        List<CustomerDto> customerDtos=new ArrayList<>();
        for (Customer customer: customers) {
            customerDtos.add(mapper.toDto(customer));
        }
       return  customerDtos;
    }
    public CustomerDto getCustomerById(int id){
        Customer customer = customerDao.findById(id,Customer.class);
        return  mapper.toDto(customer);
    }
    public void deleteCustomer(int id) {
        customerDao.delete(id,Customer.class);
    }
    public void updateCustomer(CustomerDto customerDto) {
        Customer customer=mapper.toEntity(customerDto);
        customerDao.update(customer);
    }
    public void addCustomer(CustomerDto customerDto) {
        Customer customer=mapper.toEntity(customerDto);
        customerDao.add(customer);
    }
}
