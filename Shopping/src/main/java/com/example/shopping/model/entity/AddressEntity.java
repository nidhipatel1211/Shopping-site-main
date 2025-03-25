package com.example.shopping.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "addresses")
public class AddressEntity extends BaseEntity {
    @Column(name = "full_name")
    private String fullName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String city;

    @Column
    private String address;

    @ManyToOne(targetEntity = UserEntity.class)
    @JoinColumn(name = "user_id")
    private UserEntity user;

    public AddressEntity() {

    }

    public AddressEntity(String fullName, String phoneNumber, String country, String city, String address, UserEntity user) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.country = country;
        this.city = city;
        this.address = address;
        this.user = user;
    }

    public String getFullName() {
        return fullName;
    }

    public AddressEntity setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public AddressEntity setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getCity() {
        return city;
    }

    public AddressEntity setCity(String city) {
        this.city = city;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public AddressEntity setAddress(String address) {
        this.address = address;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public AddressEntity setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public AddressEntity setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
