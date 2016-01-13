package app;

import point.Point;
import java.util.Arrays;
import java.util.Random;


public class App {
        public static void main(String[] args) {
            Random r = new Random();
            Point [] array = new Point [10];
            for (int i=0; i<10; i++){
                //Array [i] =i;
                array[i]=new Point(r.nextInt(100),r.nextInt(100));
            }

            for( Point p: array){
                System.out.println(p.toString());
            }
            Arrays.sort(array);

            System.out.println("\n" + "После сортировки\n");
            for( Point p: array){
                System.out.println(p.toString());
            }

        }

}
