package com.example.demo.service;

import com.example.demo.dto.ContactDTO;
import com.example.demo.entity.Contact;

import java.util.List;

public interface ContactService {
    Contact saveContact(Contact contact);
    List<Contact> saveContacts(List<Contact> contacts);
    List<Contact> getContacts();
    Contact getContactById(int id);
    String deleteContact(int id);
    Contact updateContact(Contact contact);
}
