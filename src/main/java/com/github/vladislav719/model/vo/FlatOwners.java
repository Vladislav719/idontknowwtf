package com.github.vladislav719.model.vo;

import javax.persistence.*;

/**
 * Created by Владислав on 02.12.2014.
 */
@Entity
@Table(name = "FLAT_OWNERS")
@AssociationOverrides({
        @AssociationOverride(name = "pk.flat",
        joinColumns = @JoinColumn(name = "ID")),
        @AssociationOverride(name = "pk.owner",
                joinColumns = @JoinColumn(name = "N_PASSPORT"))
})
public class FlatOwners {

    @Id
    @GeneratedValue
    private Long id;

    private FlatOwnersKey pk = new FlatOwnersKey();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Transient
    public Flat getFlat() {
        return getPk().getFlat();
    }

    public void setFlat(Flat flat) {
        getPk().setFlat(flat);
    }

    @Transient
    public Owner getOwner() {
        return getPk().getOwner();
    }

    public void setOwner(Owner owner) {
        getPk().setOwner(owner);
    }



    @EmbeddedId
    public FlatOwnersKey getPk() {
        return pk;
    }

    public void setPk(FlatOwnersKey pk) {
        this.pk = pk;
    }
}
