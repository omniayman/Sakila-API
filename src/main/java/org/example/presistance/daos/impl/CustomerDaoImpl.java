package org.example.presistance.daos.impl;

import java.util.Date;

import org.example.presistance.daos.Crud;
import org.example.presistance.entities.Address;
import org.example.presistance.entities.Customer;
import org.example.presistance.entities.Store;

import jakarta.persistence.EntityManager;

public class CustomerDaoImpl extends Crud<Customer, Integer> {
@Override
public void add(Customer customer){
    EntityManager entityManager=super.getEntityManager();
    Address address=super.getEntityManager().find(Address.class,customer.getAddress().getId());
    customer.setAddress(address);
    Store store=super.getEntityManager().find(Store.class,customer.getStore().getId());
    customer.setStore(store);
    // customer.setCreateDate();
    System.out.println(customer);
    entityManager.getTransaction().begin();
    entityManager.persist(customer);
    entityManager.getTransaction().commit();

}
}
