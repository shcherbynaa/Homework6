package hw6;

import java.util.ArrayList;
import java.util.List;

public class FlowerStore {

    private int wallet;

    public int getWallet() {
        return wallet;
    }

    public List<Flower> sell(int numRose, int numChamomile, int numTulip) {

        List<Flower> listFlower = new ArrayList<>();
        for (int i = 0; i < numRose; i++) {
            listFlower.add(new Rose());
            wallet += Rose.priceRose;
        }

        for (int i = 0; i < numChamomile; i++) {
            listFlower.add(new Chamomile());
            wallet += Chamomile.priceChamomile;
        }

        for (int i = 0; i < numTulip; i++) {
            listFlower.add(new Tulip());
            wallet += Tulip.priceTulip;
        }

        listFlower.forEach(flower -> System.out.print(flower.getClass().getSimpleName() + " "));
        System.out.println();
        return listFlower;
    }

    public List<Flower> sellSequence(int numRose, int numChamomile, int numTulip) {
        List<Flower> list = new ArrayList<>();
        int countRose = 0;
        int countChamonile = 0;
        int countTulip = 0;
        int numOfFlowers = numRose + numChamomile + numTulip;

        for (int i = 0; i < numOfFlowers; i++) {
            if (countRose < numRose) {
                list.add(new Rose());
                countRose++;
                wallet += Rose.priceRose;
            }
            if (countChamonile < numChamomile) {
                list.add(new Chamomile());
                countChamonile++;
                wallet += Chamomile.priceChamomile;
            }
            if (countTulip < numTulip) {
                list.add(new Tulip());
                countTulip++;
                wallet += Tulip.priceTulip;
            }
        }
        list.forEach(flower -> System.out.print(flower.getClass().getSimpleName() + " "));
        return list;
    }
}
