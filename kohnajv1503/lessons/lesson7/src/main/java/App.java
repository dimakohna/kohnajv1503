import fruit.fruit;

/**
 * Created by Симон on 02.12.2015.
 */
public class App {
    public static void main(String[] args){
        fruit f1;
        fruit f2;
        fruit f3;
        f1=new fruit();
        f2=new fruit(0.3);
        f3=new fruit("green", 3, "бяка" );

        f1.setWeight(1);
        f2.setWeight(-5);

    }
}
