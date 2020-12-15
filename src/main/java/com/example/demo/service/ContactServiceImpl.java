package com.example.demo.service;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public Contact saveContact(Contact contact){
        return contactRepository.save(contact);
    }
    public List<Contact> saveContacts(List<Contact> contacts){
        return contactRepository.saveAll(contacts);
    }

    public List<Contact> getContacts(){
        return contactRepository.findAll();
    }
    public Contact getContactById(int id) {
        return contactRepository.findById(id).orElse(null);
    }

    public String deleteContact(int id){
        contactRepository.deleteById(id);
        return "contact deleted:" + id;
    }

    public Contact updateContact(Contact contact){
        Contact existingContact = contactRepository.findById(contact.getId()).orElse(null);
        assert existingContact != null;
        existingContact.setFullName(contact.getFullName());
        existingContact.setJob(contact.getJob());
        existingContact.setItems(contact.getItems());
        return contactRepository.save(existingContact);
    }
}
