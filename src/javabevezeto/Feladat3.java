package javabevezeto;

import java.util.Locale;
import java.util.Scanner;

public class Feladat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Adjon meg egy pozitív valós számot: ");
        double valos = sc.nextDouble();
        System.out.printf("A megadott szám a %d és a %d egész számok között van, és " +
                "ezek közül a %d számhoz van közelebb.", Math.round((Math.floor(valos))), Math.round((Math.ceil(valos))), Math.round(valos));
        System.out.println();
        int egeszresz = (int) Math.floor(valos);
        System.out.printf("A szám egész része: %d", egeszresz);
        System.out.println();
        System.out.printf("A szám törtrésze: %f", valos-egeszresz);
    }
}