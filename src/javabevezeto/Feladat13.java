package javabevezeto;

import java.util.Scanner;

public class Feladat13 {
    public static void main(String[] args) {
        int gondolt =  1 + (int)(Math.random() * ((100 - 1) + 1));
        System.out.print("Gondoltam egy számra 1-100 között:  ");
        Scanner sc = new Scanner(System.in);
            int tipp = sc.nextInt();
        while (gondolt != tipp) {
            if (tipp > gondolt) {
                System.out.println("A szám kissebb");
            }else {
                System.out.println("A szám nagyobb");
            }
            System.out.print("Melyik számra gondoltam? ");
            tipp = sc.nextInt();
        }
        System.out.println("Gratulálok sikeresen eltaláltad!");
    }
}
