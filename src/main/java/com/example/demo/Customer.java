package com.example.demo;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="customerid")
    private long id;

    @Column(name="title")
    private String title;

    @Column(name="Firstname")
    private String firstName;

    @Column(name="Lastname")
    private String lastName;

    @Column(name="Streetaddress")
    private String streetAddress;

    @Column(name="Zipcode")
    private String zipCode;

    @Column(name="Emailaddress")
    private String emailAddress;

    @Column(name="Position")
    private String position;

    @Column(name="CompanyID")
    private long companyID;

    @Column(name = "CityID")
    private long cityID;

    @Column(name = "StateID")
    private long stateID;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getCompanyID() {
        return companyID;
    }

    public void setCompanyID(long companyID) {
        this.companyID = companyID;
    }

    public long getCityID() {
        return cityID;
    }

    public void setCityID(long cityID) {
        this.cityID = cityID;
    }

    public long getStateID() {
        return stateID;
    }

    public void setStateID(long stateID) {
        this.stateID = stateID;
    }



    public Customer() {
    }


//    public String displayCity(long cityID){
//
//        return city.get();
//        return("No City Found.");
//    }
}
