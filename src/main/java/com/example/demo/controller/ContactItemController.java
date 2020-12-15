package com.example.demo.controller;

import com.example.demo.entity.ContactItem;
import com.example.demo.service.ContactItemServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class ContactItemController {

    private ContactItemServiceImpl itemService;

    @PostMapping("/addItem")
    public ContactItem addItem(@RequestBody ContactItem item){
        return itemService.saveContactItem(item);
    }

    @PostMapping("/addItems")
    public List<ContactItem> addItems(@RequestBody List<ContactItem> items){
        return itemService.saveContactItems(items);
    }

    @GetMapping("/items")
    public List<ContactItem> findAllItems(){
        return itemService.getContactItems();
    }
    @GetMapping("/items/{id}")
    public ContactItem getItemById(@PathVariable int id) {
        return itemService.getContactItemById(id);
    }

    @PutMapping("/updateItem")
    public ContactItem updateItem(@RequestBody ContactItem item){
        return itemService.updateContactItem(item);
    }

    @DeleteMapping("/deleteItem/{id}")
    public String deleteContactItem(@PathVariable int id){
        return itemService.deleteContactItem(id);
    }
}
