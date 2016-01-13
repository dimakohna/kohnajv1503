package uits.jv1503;

/**
 * Created by Жека on 26.11.2015.
 */
public class app {
    public static void main(String[] args){
        int dd = 23;//10111
        int mm = 11;//1011
        int yy = 2015;//111 1101 1111
        int pack = ((dd) | (mm << 8) | (yy  << 20));
        int mask = 0xfff;//1111 1111 1111
        int mask1 = 0xff;// 1111 1111
        int dd1 = (int) (pack & mask1 );
        int mm1 = (int)(mask & pack >>> 8);
        int yy1 = (int)(mask & pack >>> 20);

        System.out.println( "День:" + dd1 + " Месяц:" + mm1 + " Год:" + yy1 );
    }
}
