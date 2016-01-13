package main;

import java.util.*;

/**
 * Created by Симон on 13.12.2015.
 */
public class Main {
    public static void main(String[] args) {

        List L=new LinkedList<String>();
        List<String> t=new LinkedList();


        for(int i=0; i<10; i++ ){
            L.add("Pervei_spisok"+(i+1));
            t.add("Hi"+i);
            System.out.println("Razmer" + " " + t.size() + " " +"Znachenie" + " " +t.get(i));
        }
        Iterator i=t.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        L.add(t);
        System.out.println(L.get(10));
        L.addAll(t);
        for(int j=0; j<10; j++){
            System.out.println(L.get(j));
        }
        HashMap <Integer, String> hm = new HashMap();
            for (int j = 0; j < 10; j++) {
                hm.put(j, "Hi" +j);


            }





    }
}
