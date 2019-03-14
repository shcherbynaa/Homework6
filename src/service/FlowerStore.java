package service;

import entity.Chamomile;
import entity.Flower;
import entity.Rose;
import entity.Tulip;

public class FlowerStore {

    private int wallet;

    public int getWallet() {
        return wallet;
    }

    public Flower[] sell(int numRose, int numChamomile, int numTulip) {
        int numOfFlowers = numRose + numChamomile + numTulip;
        Flower[] flowers = new Flower[numOfFlowers];

        for (int i = 0; i < numRose; i++) {
            flowers[i] = new Rose();
            wallet += flowers[i].getFlowerPrice();
            System.out.println("wallet rose" + wallet);
        }

        for (int i = 0; i < numChamomile; i++) {
            flowers[numRose + i] = new Chamomile();
            wallet += flowers[i].getFlowerPrice();
            System.out.println("wallet cham" + wallet);
        }

        for (int i = 0; i < numTulip; i++) {
            flowers[numRose + numChamomile + i] = new Tulip();
            wallet += flowers[i].getFlowerPrice();
        }
        return flowers;
    }

    public Flower[] sellSequence(int numRose, int numChamomile, int numTulip) {
        int countRose = 0;
        int countChamomile = 0;
        int countTulip = 0;
        int numOfFlowers = numRose + numChamomile + numTulip;
        Flower[] flowers = new Flower[numOfFlowers];
        int count = 0;

        for (int i = 0; i < numOfFlowers; i++) {
            if (countRose < numRose) {
                flowers[count] = new Rose();
                countRose++;
                wallet += flowers[i].getFlowerPrice();
                count++;
            }

            if (countChamomile < numChamomile) {
                flowers[count] = new Chamomile();
                countChamomile++;
                wallet += flowers[i].getFlowerPrice();
                count++;
            }
            if (countTulip < numTulip) {
                flowers[count] = new Tulip();
                countTulip++;
                wallet += flowers[i].getFlowerPrice();
                count++;
            }
        }
        return flowers;
    }
}
