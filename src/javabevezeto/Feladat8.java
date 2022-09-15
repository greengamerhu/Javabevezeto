package javabevezeto;

import java.util.Scanner;

public class Feladat8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fej vagy írás? (0- fej || 1- irás)");
        int tipp = sc.nextInt();
        int gepDobas = (int)(Math.random() * 2);
        /*
        Egész szám generálása min és max között
        (int)(Math.random() * (max - min)) + min
         */
        System.out.printf("A dobáa eredménye: %s ", gepDobas == 0 ? "fej" : "írás" );




        /*
        Haromlabu operator:
        (logikaio feltéltel) ? ertek ha igaz : érték ha hamis
         */
        if (gepDobas== tipp) {
            System.out.println("Gratulálok Nyertél!");
        }
        else {
            System.out.println("Sajnos vesztettél");

        }
    }
}
