package studio3;

import java.util.Arrays;
import java.util.Scanner;


public class Sieve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Calculate primes up to: ");
        int n = in.nextInt();

        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes, true);

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i]) {
                for (int j = i*i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primes[i] == true) {
                System.out.print(i + " ");
            }
        }
    }
}
