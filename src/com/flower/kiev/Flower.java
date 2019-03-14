package com.flower.kiev;

public abstract class Flower {

    private final int FLOWER_PRICE;

    Flower(int price) {
        this.FLOWER_PRICE = price;
    }

    public int getFLOWER_PRICE() {
        return FLOWER_PRICE;
    }
}
