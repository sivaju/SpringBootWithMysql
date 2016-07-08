package com.iicinf.datamod;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by sivakrishna on 7/1/2016.
 */

@Entity
public class User
{
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String loc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }


    public User() {
    }

    public User(Integer id, String name, String loc) {
        this.id = id;
        this.name = name;
        this.loc = loc;
    }
}
