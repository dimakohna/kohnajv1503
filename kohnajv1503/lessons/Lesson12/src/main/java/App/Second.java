package App;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;






public class Second {
    public static void main(String[] args) {


        try (BufferedReader tr = new BufferedReader(new FileReader("D:/1.txt"))) {
            System.out.println(tr.readLine());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}