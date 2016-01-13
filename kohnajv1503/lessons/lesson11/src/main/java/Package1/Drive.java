package Package1;

/**
 * Created by Симон on 20.12.2015.
 */
public class Drive {
   private int size;
   private String vender;
   private Drivetype type;

    @Override
    public String toString() {
        return "Drive{" +
                "size=" + size +
                ", vender='" + vender + '\'' +
                ", type=" + type +
                '}';
    }

    public enum Drivetype {
        HDD,
        SSD,
        FDD;
    }

    public Drive(int size, Drivetype type, String vender) {
        this.size = size;
        this.type = type;
        this.vender = vender;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getVender() {
        return vender;
    }

    public void setVender(String vender) {
        this.vender = vender;
    }

    public Drivetype getType() {
        return type;
    }

    public void setType(Drivetype type) {
        this.type = type;
    }
}