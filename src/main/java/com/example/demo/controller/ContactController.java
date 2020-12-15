package com.example.demo.controller;

import com.example.demo.entity.Contact;
import com.example.demo.service.ContactServiceImpl;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ContactController {

    private ContactServiceImpl contactService;

    @PostMapping("/addContact")
    public Contact addContact(@RequestBody Contact contact){
        return contactService.saveContact(contact);
    }

    @PostMapping("/addContacts")
    public List<Contact> addContacts(@RequestBody List<Contact> contact){
        return contactService.saveContacts(contact);
    }

    @GetMapping("/contacts")
    public List<Contact> findAllContacts(){
        return contactService.getContacts();
    }
    @GetMapping("/contacts/{id}")
    public Contact getContactById(@PathVariable int id) {
        return contactService.getContactById(id);
    }

    @PutMapping("/updateContact")
    public Contact updateContact(@RequestBody Contact contact){
        return contactService.updateContact(contact);
    }

    @DeleteMapping("/deleteContact/{id}")
    public String deleteContact(@PathVariable int id){
        return contactService.deleteContact(id);
    }
}
