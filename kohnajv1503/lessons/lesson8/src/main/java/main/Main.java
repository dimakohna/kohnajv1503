package main;

import abstractclass.Reactangle;
import abstractclass.Shape;
import abstractclass.Square;
import abstractclass.Triangle;


/**
 * Created by Симон on 06.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        Shape fg1= new Reactangle();
        Shape fg2= new Square();
        Shape fg3=new Triangle();

        fg1.movedrav();
        fg2.moveHor();
        fg3.moveVer();
    }
}
