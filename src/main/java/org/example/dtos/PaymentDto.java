package org.example.dtos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

/**
 * A DTO for the {@link org.example.presistance.entities.Payment} entity
 */
public class PaymentDto implements Serializable {
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