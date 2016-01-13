package uits.jv1503;


public class App {
    public static void main(String[] args) {

        int[][] x = new int[5][];
        int n;

        for (int i = 0; i < x.length; i++) {
            x[i] = new int[x.length - i];
        }

        for (int i = 0; i < x.length; i++) {
            n = 0;
            for (int j = 0; j < x[i].length; j++) {
                for (int k = 0; k < i - n; k++) {
                    System.out.print(" ");
                }
                System.out.print(x[i][j]);
                n = 4;
            }
            System.out.println();
        }
    }
}






















