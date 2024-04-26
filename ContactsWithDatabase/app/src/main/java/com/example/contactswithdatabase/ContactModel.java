package com.example.contactswithdatabase;

public class ContactModel {

    int id;

    String name;

    String email;

    String phoneNumber;

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
