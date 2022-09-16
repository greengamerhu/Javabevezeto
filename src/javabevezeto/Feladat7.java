package javabevezeto;

import java.util.Scanner;

public class Feladat7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add meg hanyadik hónapot írunk: ");
        int honap = sc.nextInt();
        if (honap < 0 || honap > 12) {
            System.out.println("A megadot hónap vagy negatív vagy több mint 12");
        } else if (honap <= 2 || honap == 12) {
            System.out.println("Tél Évszak van");
        } else if ( honap <= 5) {
            System.out.println("Tavasz Évszak van");

        } else if ( honap <= 8) {
            System.out.println("Nyár Évszak van");

        } else if (honap <= 11) {
            System.out.println("ősz Évszak van");

        }
    }
}
