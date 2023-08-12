package com.springdemo.qa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "qa_team")
public class Resources {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "PersoniD", nullable = false)
    private String personID;

    @Column(name = "Lastname", nullable = false)
    private String lastname;

    @Column(name = "Firstname", nullable = false)
    private String firstname;

    @Column(name = "Address", nullable = false)
    private String address;

    @Column(name = "City", nullable = false)
    private String city;

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Resources(){

    }
    public Resources(String personID, String lastname, String firstname, String address, String city) {
        this.personID = personID;
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = address;
        this.city = city;
    }


}