package com.example.contactswithdatabase;

import java.io.Serializable;

public class ContactModel implements Serializable {

    int id;

    String name;

    String email;

    String phoneNumber;

    public ContactModel() {
    }

    public ContactModel(int id) {
        this.id = id;
    }

    public ContactModel(int id, String name, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public ContactModel(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
