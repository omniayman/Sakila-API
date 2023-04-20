package org.example.dtos.store;

import org.example.dtos.Staff.StaffEditDto;
import org.example.dtos.address.AddressDto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * A DTO for the {@link org.example.presistance.entities.Store} entity
 */
public class StoreViewDto implements Serializable {
    private Short id;
    private StaffEditDto managerStaff;
    private AddressDto address;
    private Date lastUpdate;

    public StoreViewDto(Short id, StaffEditDto managerStaff, AddressDto address, Date lastUpdate) {
        this.id = id;
        this.managerStaff = managerStaff;
        this.address = address;
        this.lastUpdate = lastUpdate;
    }

    public StoreViewDto() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public StaffEditDto getManagerStaff() {
        return managerStaff;
    }

    public void setManagerStaff(StaffEditDto managerStaff) {
        this.managerStaff = managerStaff;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoreViewDto entity = (StoreViewDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.managerStaff, entity.managerStaff) &&
                Objects.equals(this.address, entity.address) &&
                Objects.equals(this.lastUpdate, entity.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, managerStaff, address, lastUpdate);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "managerStaff = " + managerStaff + ", " +
                "address = " + address + ", " +
                "lastUpdate = " + lastUpdate + ")";
    }
}