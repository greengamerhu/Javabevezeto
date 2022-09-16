package javabevezeto;

import java.util.Scanner;

public class Feladat11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adj meg egy pozitív egész számot ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("A szám negatív vagy 0");
        }
        else {
            int osszeg = 0;
            for (int i = 0; i <= n; i++) {
                if (i % 2 != 0) {

                    osszeg += i;
                }
            }
            System.out.println("A páratlan számok összege: " + osszeg);
        }

    }
}
