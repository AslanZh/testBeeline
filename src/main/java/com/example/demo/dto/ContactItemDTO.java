package com.example.demo.dto;

public class ContactItemDTO {
    private int id;
    private int contactId;
    private String contactItemType;
    private String value;

    public ContactItemDTO(int id, int contactId, String contactItemType, String value) {
        this.id = id;
        this.contactId = contactId;
        this.contactItemType = contactItemType;
        this.value = value;
    }

    public ContactItemDTO() {
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
