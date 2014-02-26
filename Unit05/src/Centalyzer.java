/*
 * Name: Tianrui Guo
 * Period: 5
 * Project: Centalyzer
 */

public class Centalyzer {
    private double weight;
    private int oldCoin, newCoin;

    public Centalyzer(double w) {
        weight = w;
        double coinWeight = w - 7;

        for (int i = 0; i <= 1000; i++) {
            oldCoin = i;
            newCoin = 1000 - i;
            double testWeight = oldCoin * 3.1 + newCoin * 2.5;
            if (Math.abs(coinWeight - testWeight) < 0.01) {
                break;
            }
        }
    }

    public int getOldCoins() {
        return oldCoin;
    }

    public int getNewCoins() {
        return newCoin;
    }

    public String toString() {
        return String.format("%.1fg is %d new coins and %d old coins.", weight, newCoin, oldCoin);
    }
}
