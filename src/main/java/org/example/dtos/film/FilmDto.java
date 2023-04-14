package org.example.dtos.film;

import org.example.presistance.entities.FilmActorId;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;
import java.util.Set;

/**
 * A DTO for the {@link org.example.presistance.entities.Film} entity
 */
public class FilmDto implements Serializable {
    private Integer id;
    private String title;
    private String description;
    private Integer releaseYear;
    private Short languageId;
    private Short originalLanguageId;
    private Short rentalDuration;
    private BigDecimal rentalRate;
    private Integer length;
    private BigDecimal replacementCost;
    private String rating;
    private String specialFeatures;
    private Instant lastUpdate;
    private Set<Integer> inventoryIds;
    private Set<FilmActorId> filmActorIds;
    private Set<Instant> filmCategoryLastUpdates;

    public FilmDto() {
    }

    public FilmDto(Integer id, String title, String description, Integer releaseYear, Short languageId, Short originalLanguageId, Short rentalDuration, BigDecimal rentalRate, Integer length, BigDecimal replacementCost, String rating, String specialFeatures, Instant lastUpdate, Set<Integer> inventoryIds, Set<FilmActorId> filmActorIds, Set<Instant> filmCategoryLastUpdates) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.languageId = languageId;
        this.originalLanguageId = originalLanguageId;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.length = length;
        this.replacementCost = replacementCost;
        this.rating = rating;
        this.specialFeatures = specialFeatures;
        this.lastUpdate = lastUpdate;
        this.inventoryIds = inventoryIds;
        this.filmActorIds = filmActorIds;
        this.filmCategoryLastUpdates = filmCategoryLastUpdates;
    }

    public Integer getId() {
        return id;
    }

    public FilmDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public FilmDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public FilmDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public FilmDto setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
        return this;
    }

    public Short getLanguageId() {
        return languageId;
    }

    public FilmDto setLanguageId(Short languageId) {
        this.languageId = languageId;
        return this;
    }

    public Short getOriginalLanguageId() {
        return originalLanguageId;
    }

    public FilmDto setOriginalLanguageId(Short originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
        return this;
    }

    public Short getRentalDuration() {
        return rentalDuration;
    }

    public FilmDto setRentalDuration(Short rentalDuration) {
        this.rentalDuration = rentalDuration;
        return this;
    }

    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    public FilmDto setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
        return this;
    }

    public Integer getLength() {
        return length;
    }

    public FilmDto setLength(Integer length) {
        this.length = length;
        return this;
    }

    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    public FilmDto setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
        return this;
    }

    public String getRating() {
        return rating;
    }

    public FilmDto setRating(String rating) {
        this.rating = rating;
        return this;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public FilmDto setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
        return this;
    }

    public Instant getLastUpdate() {
        return lastUpdate;
    }

    public FilmDto setLastUpdate(Instant lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

    public Set<Integer> getInventoryIds() {
        return inventoryIds;
    }

    public FilmDto setInventoryIds(Set<Integer> inventoryIds) {
        this.inventoryIds = inventoryIds;
        return this;
    }

    public Set<FilmActorId> getFilmActorIds() {
        return filmActorIds;
    }

    public FilmDto setFilmActorIds(Set<FilmActorId> filmActorIds) {
        this.filmActorIds = filmActorIds;
        return this;
    }

    public Set<Instant> getFilmCategoryLastUpdates() {
        return filmCategoryLastUpdates;
    }

    public FilmDto setFilmCategoryLastUpdates(Set<Instant> filmCategoryLastUpdates) {
        this.filmCategoryLastUpdates = filmCategoryLastUpdates;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmDto entity = (FilmDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.title, entity.title) &&
                Objects.equals(this.description, entity.description) &&
                Objects.equals(this.releaseYear, entity.releaseYear) &&
                Objects.equals(this.languageId, entity.languageId) &&
                Objects.equals(this.originalLanguageId, entity.originalLanguageId) &&
                Objects.equals(this.rentalDuration, entity.rentalDuration) &&
                Objects.equals(this.rentalRate, entity.rentalRate) &&
                Objects.equals(this.length, entity.length) &&
                Objects.equals(this.replacementCost, entity.replacementCost) &&
                Objects.equals(this.rating, entity.rating) &&
                Objects.equals(this.specialFeatures, entity.specialFeatures) &&
                Objects.equals(this.lastUpdate, entity.lastUpdate) &&
                Objects.equals(this.inventoryIds, entity.inventoryIds) &&
                Objects.equals(this.filmActorIds, entity.filmActorIds) &&
                Objects.equals(this.filmCategoryLastUpdates, entity.filmCategoryLastUpdates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, releaseYear, languageId, originalLanguageId, rentalDuration, rentalRate, length, replacementCost, rating, specialFeatures, lastUpdate, inventoryIds, filmActorIds, filmCategoryLastUpdates);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "title = " + title + ", " +
                "description = " + description + ", " +
                "releaseYear = " + releaseYear + ", " +
                "languageId = " + languageId + ", " +
                "originalLanguageId = " + originalLanguageId + ", " +
                "rentalDuration = " + rentalDuration + ", " +
                "rentalRate = " + rentalRate + ", " +
                "length = " + length + ", " +
                "replacementCost = " + replacementCost + ", " +
                "rating = " + rating + ", " +
                "specialFeatures = " + specialFeatures + ", " +
                "lastUpdate = " + lastUpdate + ", " +
                "inventoryIds = " + inventoryIds + ", " +
                "filmActorIds = " + filmActorIds + ", " +
                "filmCategoryLastUpdates = " + filmCategoryLastUpdates + ")";
    }
}