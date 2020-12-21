package com.example.demo.service;

import com.example.demo.entity.Contact;
import com.example.demo.entity.ContactItem;
import com.example.demo.repository.ContactItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactItemServiceImpl implements ContactItemService {
    @Autowired
    private ContactItemRepository contactItemRepository;

    @Override
    public ContactItem saveContactItem(ContactItem item) {
        return contactItemRepository.save(item);
    }

    @Override
    public List<ContactItem> saveContactItems(List<ContactItem> items) {
        return contactItemRepository.saveAll(items);
    }

    @Override
    public List<ContactItem> getContactItems() {
        return contactItemRepository.findAll();
    }

    @Override
    public ContactItem getContactItemById(int id) {
        return contactItemRepository.findById(id).orElse(null);
    }

    @Override
    public String deleteContactItem(int id) {
        contactItemRepository.deleteById(id);
        return "contact deleted:" + id;
    }

    @Override
    public ContactItem updateContactItem(ContactItem item) {
        ContactItem existingItem = contactItemRepository.findById(item.getId()).orElse(null);
        assert existingItem != null;
        existingItem.setContactId(item.getContactId());
        existingItem.setContactItemType(item.getContactItemType());
        existingItem.setValue(item.getValue());
        return contactItemRepository.save(existingItem);
    }
}
