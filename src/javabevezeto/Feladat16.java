package javabevezeto;

import java.util.Scanner;

public class Feladat16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tomb = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Töltse fel a tömböt, adjon meg egész számokat:  ");
            int szam = sc.nextInt();
            tomb[i] = szam;
        }
        for (int i = 0; i < tomb.length; i++) {
            System.out.printf(tomb[i] + ", ");
        }
        System.out.println();
        for (int i = tomb.length-1; i >= 0 ; i--) {
            System.out.printf(tomb[i] + ", ");
        }
        System.out.println();

        for (int i = 1; i < tomb.length; i +=2) {
            System.out.printf( tomb[i] +", ");
        }
        System.out.println();

        System.out.print("Adjon meg egy számot 1-5: ");
        int szam = sc.nextInt();
        System.out.printf("a tömb %d. eleme: %d", szam, tomb[szam-1] );
    }
}
