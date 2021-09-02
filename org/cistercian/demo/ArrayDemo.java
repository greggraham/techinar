package org.cistercian.demo;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] primes = {2, 3, 5, 7, 11, 13};

        System.out.println(primes);

        for (int i = 0; i < primes.length; i++) {
            System.out.println(primes[i]);
        }

        int x = primes[1] + primes[3];
        int y = primes[4] % 2;
        int z = primes[0] * primes[4];
        System.out.printf("%d, %d, %d\n", x, y, z);


        String[] names = {"Franco", "Juan", "Julius", "Xavier"};

        System.out.println(names);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
        int n = matrix[1][0];
        System.out.println(n);
    }
}
