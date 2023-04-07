package org.example.dtos;

import org.example.presistance.entities.City;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * A DTO for the {@link City} entity
 */
public class CityDto implements Serializable {
    private final Integer id;
    private final String city;
    private final Instant lastUpdate;

    public CityDto(Integer id, String city, Instant lastUpdate) {
        this.id = id;
        this.city = city;
        this.lastUpdate = lastUpdate;
    }

    public Integer getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public Instant getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityDto entity = (CityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.city, entity.city) &&
                Objects.equals(this.lastUpdate, entity.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city, lastUpdate);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "city = " + city + ", " +
                "lastUpdate = " + lastUpdate + ")";
    }
}