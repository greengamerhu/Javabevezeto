package javabevezeto;

import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a terület szélességét(m): ");
        int szelt = sc.nextInt();
        System.out.print("Kérem adja meg a terület magasságát(m): ");
        int magassag = sc.nextInt();
        int m2 = magassag * szelt;
        int cm2 = m2 *10000;
        int csempe = 20*20;
        double csempemenyisege = (cm2 / csempe);
        double tizszazalek =  csempemenyisege * 0.10;
        double vegeredmeny = csempemenyisege + tizszazalek;
        System.out.printf("Szükséges Csempék száma: %d db" , Math.round(vegeredmeny));
    }
}
