package draw;




public class draw {
    public static void main(String[] args) {
        int[][] x = new int[5][];

        int n = 0;

        for (int i = 0; i < 5; i++){
            x[i] = new int [i];
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------------------");

        for (int i = 0; i < 5; i++){
            x[i] = new int [x.length-i];
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------------------");

        for (int i = 0; i < 5; i++){
            x[i] = new int [x.length];
        }

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------------------");

        for (int i = 0; i < x.length; i++){
            x[i] = new int[i+1];
        }

        for (int i = 0; i < x.length; i++) {
            n = 0;
            for (int j = 0; j < x[i].length; j++) {
                for (int k = 0; k < 4-i-j-n; k++) {
                    System.out.print(" ");
                }
                System.out.print(x[i][j]);
                n=4;
            }
            System.out.println();
        }

        System.out.println("-------------------------------");

        for (int i = 0; i < x.length; i++){
            x[i] = new int[x.length-i];
        }

        for (int i = 0; i < x.length; i++) {
            n = 0;
            for (int j = 0; j < x[i].length; j++) {
                for (int k = 0; k < i-n; k++) {
                    System.out.print(" ");
                }
                System.out.print(x[i][j]);
                n=4;
            }
            System.out.println();
        }

    }

}