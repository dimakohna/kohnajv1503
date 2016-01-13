package Package1;

public class Computers {

    private double weight;
    Drive d;
    ROM r;
    private TYPE_COMPUTER type_computer;
    public enum TYPE_COMPUTER{
        PC,
        LAPTOP,
        NETBOOK,
        NETTOP;
    }

    @Override
    public String toString() {
        return "Computers{" +
                "weight=" + weight +
                ", d=" + d +
                ", r=" + r +
                ", type_computer=" + type_computer +
                '}';
    }

    public Computers(double weight, Drive d, ROM r, TYPE_COMPUTER type_computer) {
        this.weight = weight;
        this.d = d;
        this.r = r;
        this.type_computer = type_computer;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Drive getD() {
        return d;
    }

    public void setD(Drive d) {
        this.d = d;
    }

    public ROM getR() {
        return r;
    }

    public void setR(ROM r) {
        this.r = r;
    }

    public TYPE_COMPUTER getType_computer() {
        return type_computer;
    }

    public void setType_computer(TYPE_COMPUTER type_computer) {
        this.type_computer = type_computer;
    }
}












