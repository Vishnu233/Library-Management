package com.example.Library.dto;

import com.sun.istack.internal.NotNull;

import javax.validation.constraints.NotBlank;

public class Users {

    @NotNull
    private Integer id;

    @NotBlank(message="fields cannot be null")
    private String name,address;

    @NotNull
    private long phonenumber;

    public Users(){

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

    public Users(Integer id, @NotBlank String name, @NotBlank String address, @NotNull long phonenumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
    }
}
