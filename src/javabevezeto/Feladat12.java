package javabevezeto;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Feladat12 {
    public static void main(String[] args) {
        System.out.print("Adj meg egy összeget(1-1000ft):  ");
        Scanner sc = new Scanner(System.in);
        int forint = sc.nextInt();
        while(!(forint <= 1000 && 1 <= forint)) {
            System.out.print("Adj meg egy pozitív egész számot ");
            forint = sc.nextInt();
        }

        double ot = 0;
        double tiz = 0;
        double husz = 0;
        double otven = 0;
        double szaz = 0;
        double ketszaz= 0;
        int maradek = 0;
        double hanyszor = 0;
        if (forint % 200 != forint) {
            hanyszor = forint / 200;
            maradek =  forint % 200;
            forint = maradek;
            maradek = 0;
            ketszaz = Math.floor(hanyszor);

        }  if (forint % 100 != forint) {
            maradek =  forint % 100;
            hanyszor = forint / 100;
            forint = maradek;
            maradek = 0;
            szaz = Math.floor(hanyszor);
        }  if (forint % 50 != forint) {
            maradek =  forint % 50;
            hanyszor = forint / 50;
            forint = maradek;
            maradek = 0;
            otven = Math.floor(hanyszor);
        }  if (forint % 20 != forint) {
            maradek =  forint % 20;
            hanyszor = forint / 20;
            forint = maradek;
            maradek = 0;
            husz = Math.floor(hanyszor);
        }  if (forint % 10 != forint) {
            maradek =  forint % 10;
            hanyszor = forint / 10;
            forint = maradek;
            maradek = 0;
            tiz = Math.floor(hanyszor);
        }  if (forint % 5 != forint) {
            maradek =  forint % 5;
            hanyszor = forint / 5;
            forint = maradek;
            ot = Math.floor(hanyszor);
        }

        System.out.printf("200 - %.0f db \n" +
                "100 - %.0f db \n" +
                "50  - %.0f db \n" +
                "20  - %.0f db \n" +
                "10  - %.0f db \n" +
                "5   - %.0f db \n" +
                "Maradek: %d ft",
                ketszaz, szaz,otven,husz,tiz,ot, forint);


    }
}
