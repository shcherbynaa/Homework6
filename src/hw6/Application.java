package hw6;

public class Application {

    public static void main(String[] args) {
        FlowerStore store = new FlowerStore();
        store.sell(3, 2, 1);
        store.sellSequence(3, 2, 1);
        System.out.println();
        System.out.println("Wallet: " + store.getWallet());
    }
}
