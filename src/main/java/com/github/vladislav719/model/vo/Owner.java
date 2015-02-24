package com.github.vladislav719.model.vo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Владислав on 02.12.2014.
 */
@Entity
@Table
public class Owner {
    @Column(name = "n_passport")
    @Id
    @GeneratedValue
    private Integer nPassport;

    private String fio;

    private Integer born;

    private Set<FlatOwners> flatOwnersSet = new HashSet<FlatOwners>(0);

    public Owner() {
    }

    public Owner(String fio, Integer born) {
        this.fio = fio;
        this.born = born;
    }

    public Integer getnPassport() {
        return nPassport;
    }

    public void setnPassport(Integer nPassport) {
        this.nPassport = nPassport;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Integer getBorn() {
        return born;
    }

    public void setBorn(Integer born) {
        this.born = born;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.owner")
    public Set<FlatOwners> getFlatOwnersSet() {
        return flatOwnersSet;
    }

    public void setFlatOwnersSet(Set<FlatOwners> flatOwnersSet) {
        this.flatOwnersSet = flatOwnersSet;
    }
}
