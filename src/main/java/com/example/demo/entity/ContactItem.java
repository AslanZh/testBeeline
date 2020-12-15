package com.example.demo.entity;
import javax.persistence.*;

@Entity
@Table(name = "ITEM")
public class ContactItem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "contact_id", nullable = false)
    private int contactId;
    @Column(name = "contact_item_type", nullable = false)
    private String contactItemType;
    @Column(name = "value", nullable = false)
    private String value;


    public ContactItem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getContactItemType() {
        return contactItemType;
    }

    public void setContactItemType(String contactItemType) {
        this.contactItemType = contactItemType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
