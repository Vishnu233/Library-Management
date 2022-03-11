package com.example.Library.entity;


import com.sun.istack.internal.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="users")
public class UsersEntity {
    @NotNull
    @Id
    private Integer id;

    @NotBlank(message="fields cannot be null")
    private String name,address;

    @NotNull
    private long phonenumber;

    public UsersEntity(){

    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public UsersEntity(Integer id, @NotBlank String name, @NotBlank String address, @NotNull long phonenumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
    }
}
