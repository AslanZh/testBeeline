package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CONTACT")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String fullName;
    private String job;
    @OneToMany(targetEntity = ContactItem.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "items_id", referencedColumnName = "id")
    private List<ContactItem> items;

    public Contact() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "full_name", nullable = false)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Column(name = "job")
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public List<ContactItem> getItems() {
        return items;
    }

    public void setItems(List<ContactItem> items) {
        this.items = items;
    }
}
