package com.flower.kiev.entity;

public abstract class Flower {

    private final int flowerPrice;

    public Flower(int price) {
        this.flowerPrice = price;
    }

    public int getFlowerPrice() {
        return flowerPrice;
    }
}
