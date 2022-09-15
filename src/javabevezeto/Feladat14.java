package javabevezeto;

import javax.imageio.spi.ImageOutputStreamSpi;
import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy szöveget: ");
        String szoveg = sc.nextLine();
        String menuPont = "";
        while (!menuPont.equals("f")) {
            System.out.println("Kérem adja meg mit szeretne kezdeni a szöveggel: ");
            System.out.println("a - Nagy betűssé alakítan ");
            System.out.println("b - Kisbetűssé alakítani ");
            System.out.println("c - Lekérdezni a hosszát ");
            System.out.println("d - Összehasonlítani egy másik stringel (string2 bekérése) ");
            System.out.println("e - Egy részét kiiratni a szövegnek");
            System.out.println("f - kilépés");
            System.out.print("Kérem adja meg az elvégzendő müvelet betüjelét: ");
            menuPont = sc.nextLine().toLowerCase();
            switch (menuPont) {
                case "a":
                    System.out.println(szoveg.toUpperCase());
                    break;
                case "b":
                    System.out.println(szoveg.toLowerCase());
                    break;
                case "c":
                    System.out.printf("A szöveg hossza %d karakter ", szoveg.length());
                    break;
                case "d":
                    System.out.print("Kérem adja meg a másik szöveget: ");
                    String masikSzoveg = sc.nextLine();
                    int osszehasonlitas = szoveg.compareTo(masikSzoveg);
                    if (osszehasonlitas == 0) {
                        System.out.println("A két szöveg egyezik");
                    } else if (osszehasonlitas <0) {
                        System.out.println("Az első szöveg előrébb van az abcben");
                    } else {
                        System.out.println("A második szöveg előrébb van az abcben");

                    }
                      break;
                case "e":
                    System.out.print("Kéremm adja az első kiiratandó karakter sorszámát");
                    int a = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Kéremm adja az második kiiratandó karakter sorszámát");
                    int b = sc.nextInt();
                    sc.nextLine();
                    System.out.println(szoveg.substring(a-1, b));
                    break;
                case "f":
                    System.out.println("Viszlát");
                    break;
                default:
                    System.out.println("ilyen menüpont nincs");
                    break;
            }
        }

    }
}
