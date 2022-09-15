package javabevezeto;

import java.util.Scanner;

public class Feladat5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adja meg a teglalap A oldalát: ");
        int a = sc.nextInt();
        System.out.print("Adja meg a teglalap B oldalát: ");
        int b = sc.nextInt();
        System.out.print("Adja meg mit szeretne látni (K : kerulet, T : Terulet): ");
        String valasz = sc.next().toUpperCase();
        int vegeredmeny;
        if (valasz.equals("T")) {
            vegeredmeny = (a*b);
            System.out.printf("Területe: %d ", vegeredmeny);
        }
        else if (valasz.equals("K")) {
            vegeredmeny = 2*(a+b);
            System.out.printf("Területe: %d ", vegeredmeny);
        }
        else {
            System.out.println("hiba: rossz előjelet adtál meg");
        };
        if (a == b) {
            System.out.println();
            System.out.println("Ez egy Négyzet");
        }
    }
}
