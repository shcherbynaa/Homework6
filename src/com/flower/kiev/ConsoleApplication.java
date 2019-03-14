package com.flower.kiev;

import java.util.Arrays;

public class ConsoleApplication {

    public static void main(String[] args) {
        FlowerStore store = new FlowerStore();
        store.sell(3, 2, 1);
        store.printFlowers();
        System.out.println();
        System.out.println("Wallet: " + store.getWallet());

        System.out.println();
        store.sellSequence(3, 2, 1);
        System.out.println("Wallet: " + store.getWallet());
        store.printFlowers();
    }
}
