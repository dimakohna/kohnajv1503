package uits.work;

/**
 * Created by пїЅпїЅпїЅпїЅ on 28.11.2015.
 */
public class App {

    public static void main(String[] args) {
        String res="";
        int in = 5;
        int in2 = in % 10;
        int in3 = in - in2;
        switch (in3){
            case (10):{
                res = "Один";
            }break;
            case (20):{
                res = "Два";
            }break;
            case (30):{
                res = "Три";
            }break;
            case (40):{
                res = "Четыре";
            }break;
            case (50):{
                res = "Пять";
            }break;
            case (60):{
                res = "Шесть";
            }break;
            case (70):{
                res = "Семь";
            }break;
            case (80):{
                res = "Восемь";
            }break;
            case (90):{
                res = "Девять";
            }break;
          
        }

        switch (in2){
            case (1):{
                res = res + " " +"Один";
            }break;
            case (2):{
                res =res + " " + "Два";
            }break;
            case (3):{
                res =res + " " + "Три";
            }break;
            case (4):{
                res = res + " " +"Четыре";
            }break;
            case (5):{
                res =res + " " + "Пять";
            }break;
            case (6):{
                res = res + " " +"Шесть";
            }break;
            case (7):{
                res =res + " " + "Семь";
            }break;
            case (8):{
                res =res + " " + "Восемь";
            }break;
            default:{
                res =res + " " + "Девять";
            }break;
        }
        System.out.println(res);

    }
}


