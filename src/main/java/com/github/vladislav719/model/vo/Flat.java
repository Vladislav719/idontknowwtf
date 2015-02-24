package com.github.vladislav719.model.vo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Владислав on 02.12.2014.
 */
@Entity
@Table
public class Flat {
    @Id
    @GeneratedValue
    private Long id;


    @Column(name = "BUILDING_ID")
    @ManyToOne
    @JoinColumn(name = "KADASTR")
    private Building building;

    private Integer storey;
    private Integer rooms;
    @Column(name = "SQUARE_FLAT")
    private Double square;
    private Double dwell;
    private Double branch;
    private Double balcony;
    private Double height;
    private Set<FlatOwners> flatOwnersSet = new HashSet<FlatOwners>(0);

    public Flat() {
    }

    public Flat(Integer storey, Integer rooms, Double square, Double dwell, Double branch, Double balcony, Double height) {
        this.storey = storey;
        this.rooms = rooms;
        this.square = square;
        this.dwell = dwell;
        this.branch = branch;
        this.balcony = balcony;
        this.height = height;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.flat", cascade = CascadeType.ALL)
    public Set<FlatOwners> getFlatOwnersSet() {
        return this.flatOwnersSet;
    }

    public void setFlatOwnersSet(Set<FlatOwners> flatOwnersSet) {
        this.flatOwnersSet = flatOwnersSet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Integer getStorey() {
        return storey;
    }

    public void setStorey(Integer storey) {
        this.storey = storey;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    public Double getDwell() {
        return dwell;
    }

    public void setDwell(Double dwell) {
        this.dwell = dwell;
    }

    public Double getBranch() {
        return branch;
    }

    public void setBranch(Double branch) {
        this.branch = branch;
    }

    public Double getBalcony() {
        return balcony;
    }

    public void setBalcony(Double balcony) {
        this.balcony = balcony;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
