package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static int sumaCifara(int n) {
        int suma = 0, temp = n;
        while(temp != 0) {
            suma += temp % 10;
            temp /= 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Unesite neki broj n: ");
        int n = in.nextInt();
        System.out.println("Brojevi u opsegu 1 - " + n + " koji su djeljivi sa sumom svojih cifara: ");
        for(int i = 1; i <= n; i++)
            if(i % sumaCifara(i) == 0)
                System.out.println(i);
    }
}