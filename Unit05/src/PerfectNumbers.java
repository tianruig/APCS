/*
 * Name: Tianrui Guo
 * Period: 5
 * Project: PerfectNumbers
 */

public class PerfectNumbers {

    public int perfectNumber(int n) { // Where n is the nth perfect number we are trying to find. 
        return (int) (mersennePrime(n) * (mersennePrime(n) + 1) / 2);
    }

    public long mersennePrime(int n) { // Where n is the nth Mersenne prime we are trying to find.
        int mP = 0;
        int exponent = 1;
        while (mP != n) {
            exponent++;
            if (isPrime((int) (Math.pow(2, exponent) - 1))) {
                mP++;
            }
        }

        return (long) (Math.pow(2, exponent) - 1);
    }

    private static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        } else if (n < 2 || n % 2 == 0) {
            return false;
        }

        int stop = (int) (Math.sqrt(n) + 0.5);
        for (int i = 3; i <= stop; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
