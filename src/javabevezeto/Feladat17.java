package javabevezeto;

public class Feladat17 {
    public static void main(String[] args) {
        double[] tomb = new double[10];
        double[] tomb2 = new double[10];
        double[] tomb3 = new double[10];
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = Math.random() * 10 - 1;
            tomb2[i] = Math.random() * 10 - 1;
        }
        for (int i = 0; i < tomb.length; i++) {
            tomb3[i] =  tomb[i] + tomb2[i];
        }
        for (int i = 0; i < tomb.length; i++) {
            System.out.printf("%f + %f = %f \n", tomb[i], tomb2[i], tomb3[i]);
        }
    }
}
