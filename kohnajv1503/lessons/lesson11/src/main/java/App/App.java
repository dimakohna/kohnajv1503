package App;

import Package1.Computers;
import Package1.Drive;
import Package1.ROM;

import java.util.Arrays;

public class App {
    @Override
    public String toString() {
        return "App{}";
    }

    public static void main(String[] args) {
        Drive d1=new Drive(120, Drive.Drivetype.HDD,"hp");
        ROM r1=new ROM(4,"Samsung", ROM.RomType.DDR2);
        Computers comp1=new Computers(3, d1,r1, Computers.TYPE_COMPUTER.PC);

        System.out.println(comp1.toString());
    }
}
