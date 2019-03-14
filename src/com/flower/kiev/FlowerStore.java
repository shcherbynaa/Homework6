package com.flower.kiev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlowerStore {

    private int wallet;
    private Flower[] flowers;

    public int getWallet() {
        return wallet;
    }

    public void printFlowers() {
        for (int i = 0; i < flowers.length; i++) {
            System.out.print(flowers[i].getClass().getSimpleName() + " ");
        }
    }

    public Flower[] sell(int numRose, int numChamomile, int numTulip) {
        int numOfFlowers = numRose + numChamomile + numTulip;
        flowers = new Flower[numOfFlowers];

        for (int i = 0; i < numRose; i++) {
            flowers[i] = new Rose();
            wallet += new Rose().getFLOWER_PRICE();
        }

        for (int i = 0; i < numChamomile; i++) {
            flowers[numRose + i] = new Chamomile();
            wallet += new Chamomile().getFLOWER_PRICE();
        }

        for (int i = 0; i < numTulip; i++) {
            flowers[numRose + numChamomile + i] = new Tulip();
            wallet += new Tulip().getFLOWER_PRICE();
        }

        for (int i = 0; i < flowers.length; i++) {
            System.out.print(flowers[i] + " ");
        }
        System.out.println();
        return flowers;
    }

    public Flower[] sellSequence(int numRose, int numChamomile, int numTulip) {
        int countRose = 0;
        int countChamomile = 0;
        int countTulip = 0;
        int numOfFlowers = numRose + numChamomile + numTulip;
        flowers = new Flower[numOfFlowers];
        int count = 0;

        for (int i = 0; i < numOfFlowers; i++) {
            if (countRose < numRose) {
                flowers[count] = new Rose();
                countRose++;
                wallet += new Rose().getFLOWER_PRICE();
                count++;
            }

            if (countChamomile < numChamomile) {
                flowers[count] = new Chamomile();
                countChamomile++;
                wallet += new Chamomile().getFLOWER_PRICE();
                count++;
            }
            if (countTulip < numTulip) {
                flowers[count] = new Tulip();
                countTulip++;
                wallet += new Tulip().getFLOWER_PRICE();
                count++;
            }
        }
        return flowers;
    }
}
