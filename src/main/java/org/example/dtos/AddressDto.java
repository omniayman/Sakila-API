package org.example.dtos;

import org.example.presistance.entities.Address;
import org.example.presistance.entities.Payment;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

/**
 * A DTO for the {@link Address} entity
 */
public class AddressDto implements Serializable {
    private final Integer id;
    private final String address;
    private final String address2;
    private final String district;
    private final CityDto city;
    private final String postalCode;
    private final String phone;
    private final Instant lastUpdate;

    public AddressDto(Integer id, String address, String address2, String district, CityDto city, String postalCode, String phone, Instant lastUpdate) {
        this.id = id;
        this.address = address;
        this.address2 = address2;
        this.district = district;
        this.city = city;
        this.postalCode = postalCode;
        this.phone = phone;
        this.lastUpdate = lastUpdate;
    }

    public Integer getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getAddress2() {
        return address2;
    }

    public String getDistrict() {
        return district;
    }

    public CityDto getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public Instant getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressDto entity = (AddressDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.address, entity.address) &&
                Objects.equals(this.address2, entity.address2) &&
                Objects.equals(this.district, entity.district) &&
                Objects.equals(this.city, entity.city) &&
                Objects.equals(this.postalCode, entity.postalCode) &&
                Objects.equals(this.phone, entity.phone) &&
                Objects.equals(this.lastUpdate, entity.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, address2, district, city, postalCode, phone, lastUpdate);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "address = " + address + ", " +
                "address2 = " + address2 + ", " +
                "district = " + district + ", " +
                "city = " + city + ", " +
                "postalCode = " + postalCode + ", " +
                "phone = " + phone + ", " +
                "lastUpdate = " + lastUpdate + ")";
    }

    /**
     * A DTO for the {@link Payment} entity
     */
    public static class PaymentDto implements Serializable {
        private final Integer id;
        private final BigDecimal amount;
        private final Instant paymentDate;
        private final Instant lastUpdate;

        public PaymentDto(Integer id, BigDecimal amount, Instant paymentDate, Instant lastUpdate) {
            this.id = id;
            this.amount = amount;
            this.paymentDate = paymentDate;
            this.lastUpdate = lastUpdate;
        }

        public Integer getId() {
            return id;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public Instant getPaymentDate() {
            return paymentDate;
        }

        public Instant getLastUpdate() {
            return lastUpdate;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PaymentDto entity = (PaymentDto) o;
            return Objects.equals(this.id, entity.id) &&
                    Objects.equals(this.amount, entity.amount) &&
                    Objects.equals(this.paymentDate, entity.paymentDate) &&
                    Objects.equals(this.lastUpdate, entity.lastUpdate);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, amount, paymentDate, lastUpdate);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "id = " + id + ", " +
                    "amount = " + amount + ", " +
                    "paymentDate = " + paymentDate + ", " +
                    "lastUpdate = " + lastUpdate + ")";
        }
    }
}