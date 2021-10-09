package com.example.recyclerview26082021;

public enum Category {
    SHOP_ONLINE ("Shop Online"), BISTRO("Bistro");

    private String value;

    Category(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.getValue();
    }
}
