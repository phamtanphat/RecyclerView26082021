package com.example.recyclerview26082021;

public class Food {
    private int image;
    private String name;
    private String address;
    private Category category;
    private Float distance;
    private Float rating;

    public Food(int image, String name, String address, Category category, Float distance, Float rating) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.category = category;
        this.distance = distance;
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }
}
