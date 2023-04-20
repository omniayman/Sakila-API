package org.example.dtos.inventory;

import org.example.dtos.payment.PaymentViewDto;
import org.example.presistance.entities.Film;
import org.example.presistance.entities.Inventory;
import org.example.presistance.entities.Rental;
import org.example.presistance.entities.Store;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import java.util.Set;

/**
 * A DTO for the {@link Inventory} entity
 */
public class InventoryEditDto implements Serializable {
    private final Integer id;
    private final Film film;
    private final Instant lastUpdate;

    public InventoryEditDto(Integer id, Film film, Instant lastUpdate) {
        this.id = id;
        this.film = film;
        this.lastUpdate = lastUpdate;
    }

    public Integer getId() {
        return id;
    }

    public Film getFilm() {
        return film;
    }

    public Instant getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InventoryEditDto entity = (InventoryEditDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.film, entity.film) &&
                Objects.equals(this.lastUpdate, entity.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, film, lastUpdate);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "film = " + film + ", " +
                "lastUpdate = " + lastUpdate + ")";
    }

    /**
     * A DTO for the {@link Rental} entity
     */
    public static class RentalDto implements Serializable {
        private final Integer id;
        private final Instant rentalDate;
        private final InventoryEditDto inventory;
        private final Instant returnDate;
        private final Instant lastUpdate;
        private final Set<PaymentViewDto> payments;

        public RentalDto(Integer id, Instant rentalDate, InventoryEditDto inventory, Instant returnDate, Instant lastUpdate, Set<PaymentViewDto> payments) {
            this.id = id;
            this.rentalDate = rentalDate;
            this.inventory = inventory;
            this.returnDate = returnDate;
            this.lastUpdate = lastUpdate;
            this.payments = payments;
        }

        public Integer getId() {
            return id;
        }

        public Instant getRentalDate() {
            return rentalDate;
        }

        public InventoryEditDto getInventory() {
            return inventory;
        }

        public Instant getReturnDate() {
            return returnDate;
        }

        public Instant getLastUpdate() {
            return lastUpdate;
        }

        public Set<PaymentViewDto> getPayments() {
            return payments;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            RentalDto entity = (RentalDto) o;
            return Objects.equals(this.id, entity.id) &&
                    Objects.equals(this.rentalDate, entity.rentalDate) &&
                    Objects.equals(this.inventory, entity.inventory) &&
                    Objects.equals(this.returnDate, entity.returnDate) &&
                    Objects.equals(this.lastUpdate, entity.lastUpdate) &&
                    Objects.equals(this.payments, entity.payments);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, rentalDate, inventory, returnDate, lastUpdate, payments);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "id = " + id + ", " +
                    "rentalDate = " + rentalDate + ", " +
                    "inventory = " + inventory + ", " +
                    "returnDate = " + returnDate + ", " +
                    "lastUpdate = " + lastUpdate + ", " +
                    "payments = " + payments + ")";
        }
    }

    /**
     * A DTO for the {@link Store} entity
     */
    public static class StoreDto implements Serializable {
        private final Short id;
        private final Instant lastUpdate;

        public StoreDto(Short id, Instant lastUpdate) {
            this.id = id;
            this.lastUpdate = lastUpdate;
        }

        public Short getId() {
            return id;
        }

        public Instant getLastUpdate() {
            return lastUpdate;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            StoreDto entity = (StoreDto) o;
            return Objects.equals(this.id, entity.id) &&
                    Objects.equals(this.lastUpdate, entity.lastUpdate);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, lastUpdate);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "id = " + id + ", " +
                    "lastUpdate = " + lastUpdate + ")";
        }
    }
}