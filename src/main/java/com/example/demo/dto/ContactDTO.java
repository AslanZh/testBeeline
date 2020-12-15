package com.example.demo.dto;
import java.util.List;

public class ContactDTO {
    private int id;
    private String fullName;
    private String job;
    private List<ContactItemDTO> items;

    public ContactDTO(int id, String fullName, String job, List<ContactItemDTO> items) {
        this.id = id;
        this.fullName = fullName;
        this.job = job;
        this.items = items;
    }

    public ContactDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public List<ContactItemDTO> getItems() {
        return items;
    }

    public void setItems(List<ContactItemDTO> items) {
        this.items = items;
    }
}
