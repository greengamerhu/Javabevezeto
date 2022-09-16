package javabevezeto;

import java.util.Scanner;

public class Feladat5_sajat_veletlen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a téglaplap 'a' oldalát");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.print("Kérem adja meg a téglaplap 'b' oldalát");
        double b = Double.parseDouble(sc.nextLine().replace('.', ','));
        System.out.print("Kérem adja meg az elvégzendő müveletet (k- Kerület, T - Terület)");
        String muvelet = sc.nextLine();
        if (muvelet.equals("K")) {
            double kerulet = 2* (a+b);
            System.out.printf("A téglalap kerülete: %f", kerulet);
        } else if (muvelet.equals("T")) {
            double terulet = 2* (a+b);
            System.out.printf("A téglalap terulet: %f", terulet);
        } else {
            System.out.println("Rossz müveletet adott meg");
        }
        if (a == b) {
            System.out.println("Ez egy négyzet");
        }
    }
}
