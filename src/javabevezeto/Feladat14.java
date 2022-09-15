package javabevezeto;

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
        }
    }
}
