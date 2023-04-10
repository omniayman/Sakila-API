package org.example.presistance.daos.interfaces;

import org.example.presistance.entities.*;

import java.util.List;

public interface CustomerDao {
    public Store getCustomerHomeStore(int id);
    public List<Payment> getCustomerPayments(int id);

    public Address getCustomerAddress(int id);

    public List<Rental> getCustomerRentals(int id);
}
