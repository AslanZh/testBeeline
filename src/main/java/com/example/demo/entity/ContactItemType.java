package com.example.demo.entity;

public enum ContactItemType{
    EMAIL("email"),
    PHONE("phone"),
    TELEGRAM("telegram");

    private String value;

    ContactItemType(String value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return value;
    }
}
