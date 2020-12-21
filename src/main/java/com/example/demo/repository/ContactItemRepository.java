package com.example.demo.repository;

import com.example.demo.entity.ContactItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactItemRepository extends JpaRepository<ContactItem, Integer> {
}
