package com.github.vladislav719.model.vo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Владислав on 02.12.2014.
 */
@Entity
@Table
public class Building {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "KADASTR")
    private String kadastr;

    private String address;
    private String district;
    private Double land;
    private Integer year;
    private String material;
    private String base;
    private String comment;
    private Double wear;
    private Integer flow;
    private Double line;
    private Double square;
    private String picture;
    @Column(name = "FLATS")
    private Integer flatsCount;
    private Boolean elevator;

    @OneToMany(mappedBy = "BUILDING_ID") // or building
    private Set<Flat> flats;

    public Building() {
    }

    public Building(String address, String district, Double land, Integer year, String material, String base, String comment, Double wear, Integer flow, Double line, Double square, String picture, Integer flatsCount, Boolean elevator) {
        this.address = address;
        this.district = district;
        this.land = land;
        this.year = year;
        this.material = material;
        this.base = base;
        this.comment = comment;
        this.wear = wear;
        this.flow = flow;
        this.line = line;
        this.square = square;
        this.picture = picture;
        this.flatsCount = flatsCount;
        this.elevator = elevator;
    }

    public void setFlats(Set<Flat> flats) {
        this.flats = flats;
    }

    public Integer getFlatsCount() {
        return flatsCount;
    }

    public void setFlatsCount(Integer flatsCount) {
        this.flatsCount = flatsCount;
    }

    public String getKadastr() {
        return kadastr;
    }

    public void setKadastr(String kadastr) {
        this.kadastr = kadastr;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Double getLand() {
        return land;
    }

    public void setLand(Double land) {
        this.land = land;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Double getWear() {
        return wear;
    }

    public void setWear(Double wear) {
        this.wear = wear;
    }

    public Integer getFlow() {
        return flow;
    }

    public void setFlow(Integer flow) {
        this.flow = flow;
    }

    public Double getLine() {
        return line;
    }

    public void setLine(Double line) {
        this.line = line;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Boolean getElevator() {
        return elevator;
    }

    public void setElevator(Boolean elevator) {
        this.elevator = elevator;
    }
}
