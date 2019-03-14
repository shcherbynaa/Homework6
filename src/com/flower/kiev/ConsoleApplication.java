package com.flower.kiev;

import com.flower.kiev.service.FlowerStore;

import java.util.Arrays;

public class ConsoleApplication {

    public static void main(String[] args) {
        FlowerStore store = new FlowerStore();
        System.out.println(Arrays.toString(store.sell(3, 2, 1)));
        System.out.println("Wallet: " + store.getWallet());

        System.out.println();
        System.out.println(Arrays.toString(store.sellSequence(3, 2, 1)));
        System.out.println("Wallet: " + store.getWallet());
    }
}
