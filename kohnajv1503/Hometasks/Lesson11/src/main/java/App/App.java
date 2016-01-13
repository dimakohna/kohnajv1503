package App;

import Request.Castomer;
import Request.Request;
import Request.Worker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Симон on 22.12.2015.
 */
public class App {
    @Override
    public String toString() {
        return "App{}";
    }

    public static void main(String[] args) {
        Castomer c1=new Castomer("Dima","Kohna");
        Worker w1=new Worker("Ivanov","Vania","Engineer");
        Request r1= new Request(c1,w1, Request.TYPE.REPAIR, Request.PRIORITY.HITH,"Отремонтируйте пожалуйста");
        Castomer c2=new Castomer("Diana", "Roh");
        Worker w2= new Worker("Petrov", "Petya", "High_Engineeer");
        Request r2 = new Request(c2,w2, Request.TYPE.DIAGNOSTICS, Request.PRIORITY.LOW, "Не включается");
        Castomer c3=new Castomer("Vas", "Vasya");
        Worker w3=new Worker("Pushkin", "Kolia", "Low_Engineer");
        Request r3= new Request(c3, w3, Request.TYPE.WARRANTY_REPAIR, Request.PRIORITY.MEDIUM, "На экране артефакты");

        ArrayList<Request> mass = new ArrayList<Request>();
        mass.add(r1);
        mass.add(r2);
        mass.add(r3);
        Collections.sort(mass, new SORT("TYPE"));
        System.out.println(r1.toString());
        for (Request p : mass) {
            System.out.println(p.toString());

    }
        Collections.sort(mass, new SORT("Author"));

        for (Request r : mass) {
            // System.out.println(p.toString());
        }

    }

    public static class SORT implements Comparator<Request> {
        String valuesor;

        SORT(String valuesor) {
            this.valuesor = valuesor;
        }

        public int compare(Request o1, Request o2) {
            if (valuesor != null) {
                if (valuesor.equals("TYPE")) {
                    int m1 = o1.getT().num();
                    int m2 = o2.getT().num();
                    if (m1 < m2) {
                        return 1;
                    } else if (m1 > m2) {
                        return -1;
                    } else {
                        return 0;
                    }
                } else if (valuesor.equals("PRIORITY")) {
                    int m1 = o1.getP().num();
                    int m2 = o2.getP().num();
                    if (m1 < m2) {
                        return 1;
                    } else if (m1 > m2) {
                        return -1;
                    } else {
                        return 0;
                    }
                } else if (valuesor.equals("Author")) {
                    return o1.get().compareTo(o2.getC());
                } else if (valuesor.equals("Assigned_To")) {
                    return o1.getAssigned_To().compareTo(o2.getAssigned_To());
                } else return 0;
            } else return 0;

        }
    }
}