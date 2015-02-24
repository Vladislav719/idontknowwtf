package com.github.vladislav719.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Владислав on 28.11.2014.
 */
@Entity
@Table(name = "USER")
public class User {

    @Id
    @Column(name="u_id")
    private Long uId;

    private String name;

    public User() {
        super();
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }
}
