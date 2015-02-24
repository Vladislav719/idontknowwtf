package com.github.vladislav719.model.vo;

import javax.persistence.ManyToOne;

/**
 * Created by Владислав on 02.12.2014.
 */
public class FlatOwnersKey {

    @ManyToOne
    private Flat flat;
    @ManyToOne
    private Owner owner;

    public FlatOwnersKey() {
    }

    public FlatOwnersKey(Flat flat, Owner owner) {
        this.flat = flat;
        this.owner = owner;
    }

    public Flat getFlat() {
        return flat;
    }

    public void setFlat(Flat flat) {
        this.flat = flat;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
