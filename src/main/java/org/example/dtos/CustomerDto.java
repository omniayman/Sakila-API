package org.example.dtos;


import org.example.presistance.entities.Customer;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

/**
 * A DTO for the {@link Customer} entity
 */

public class CustomerDto implements Serializable {
    private  Integer id;
    private StoreDto store;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  AddressDto address;
    private  Boolean active;
    private  Date createDate;
    private  Date lastUpdate;
//    private final Set<AddressDto.PaymentDto> payments;
//    private final Set<InventoryDto.RentalDto> rentals;

    public CustomerDto(Integer id,  String firstName, String lastName, String email, Boolean active, AddressDto address,Date createDate, Date lastUpdate,StoreDto store) {
        this.id = id;
        this.store = store;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
       this.address = address;
        this.active = active;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
//        this.payments = payments;
//        this.rentals = rentals;
    }

    public CustomerDto() {
    }

    public Integer getId() {
        return id;
    }

   public StoreDto getStore() {
       return store;
   }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

   public AddressDto getAddress() {
       return address;
   }

    public Boolean getActive() {
        return active;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

//    public Set<AddressDto.PaymentDto> getPayments() {
//        return payments;
//    }
//
//    public Set<InventoryDto.RentalDto> getRentals() {
//        return rentals;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDto entity = (CustomerDto) o;
        return Objects.equals(this.id, entity.id) &&
//                Objects.equals(this.store, entity.store) &&
                Objects.equals(this.firstName, entity.firstName) &&
                Objects.equals(this.lastName, entity.lastName) &&
                Objects.equals(this.email, entity.email) &&
//                Objects.equals(this.address, entity.address) &&
                Objects.equals(this.active, entity.active) &&
                Objects.equals(this.createDate, entity.createDate) &&
                Objects.equals(this.lastUpdate, entity.lastUpdate) ;
//                Objects.equals(this.payments, entity.payments) &&
//                Objects.equals(this.rentals, entity.rentals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, active, createDate, lastUpdate);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
//                "store = " + store + ", " +
                "firstName = " + firstName + ", " +
                "lastName = " + lastName + ", " +
                "email = " + email + ", " +
//                "address = " + address + ", " +
                "active = " + active + ", " +
                "createDate = " + createDate + ", " +
                "lastUpdate = " + lastUpdate  + ")";
//                "payments = " + payments + ", " +
//                "rentals = " + rentals + ")";
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public void setStore(StoreDto store) {
        this.store = store;
    }
}