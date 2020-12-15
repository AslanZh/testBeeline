package com.example.demo.service;

import com.example.demo.entity.ContactItem;

import java.util.List;

public interface ContactItemService {
    ContactItem saveContactItem(ContactItem item);
    List<ContactItem> saveContactItems(List<ContactItem> items);
    List<ContactItem> getContactItems();
    ContactItem getContactItemById(int id);
    String deleteContactItem(int id);
    ContactItem updateContactItem(ContactItem item);
}
