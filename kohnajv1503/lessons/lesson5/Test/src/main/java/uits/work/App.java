package uits.work;

/**
 * Created by ���� on 28.11.2015.
 */
public class App {

    public static void main(String[] args) {
        String res="";
        int in = 5;
        int in2 = in % 10;
        int in3 = in - in2;
        switch (in3){
            case (10):{
                res = "����";
            }break;
            case (20):{
                res = "���";
            }break;
            case (30):{
                res = "���";
            }break;
            case (40):{
                res = "������";
            }break;
            case (50):{
                res = "����";
            }break;
            case (60):{
                res = "�����";
            }break;
            case (70):{
                res = "����";
            }break;
            case (80):{
                res = "������";
            }break;
            case (90):{
                res = "������";
            }break;
          
        }

        switch (in2){
            case (1):{
                res = res + " " +"����";
            }break;
            case (2):{
                res =res + " " + "���";
            }break;
            case (3):{
                res =res + " " + "���";
            }break;
            case (4):{
                res = res + " " +"������";
            }break;
            case (5):{
                res =res + " " + "����";
            }break;
            case (6):{
                res = res + " " +"�����";
            }break;
            case (7):{
                res =res + " " + "����";
            }break;
            case (8):{
                res =res + " " + "������";
            }break;
            default:{
                res =res + " " + "������";
            }break;
        }
        System.out.println(res);

    }
}


