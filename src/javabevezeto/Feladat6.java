package javabevezeto;

import java.util.Scanner;

public class Feladat6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add meg a pontszámodat: ");
        int pontszam = sc.nextInt();
        if (pontszam < 0 || pontszam > 100) {
            System.out.println("A megadott érték vagy negatív vagy több mint 100");
        } else if (pontszam <= 42) {
            System.out.println("A Jegyed: Elégtelen");
        } else if ( pontszam <= 57) {
            System.out.println("A Jegyed: Elégséges");
        } else if ( pontszam <= 72) {
            System.out.println("A Jegyed: közepes");
        } else if (pontszam <= 87) {
            System.out.println("A Jegyed: jó");
        }else  {
            System.out.println("A Jegyed: Jeles");
        }
    }
}
