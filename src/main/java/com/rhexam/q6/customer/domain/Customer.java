package com.rhexam.q6.customer.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jhorton on 11/5/16.
 */
public class Customer {

    private String firstName;
    private String lastName;
    private List<Address> addresses;

    public Customer() {
        this.firstName = null;
        this.lastName = null;
        this.addresses = new ArrayList<>();
    }

    public Customer(String firstName, String lastName, Address address) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.addresses = new ArrayList<Address>();
        addAddress(address);
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

    public List<Address> getAddresses() {
        return addresses;
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }

    public void removeAddress(Address address) {
        this.addresses.remove(address);
    }
}
