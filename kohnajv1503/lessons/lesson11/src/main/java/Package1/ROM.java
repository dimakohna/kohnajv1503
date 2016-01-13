package Package1;

/**
 * Created by Симон on 20.12.2015.
 */
public class ROM {
   private int size;
   private String vender;
   private RomType type;
    public enum RomType{
        SDRAM,
        DDR,
        DDR2,
        DD3;
    }

    @Override
    public String toString() {
        return "ROM{" +
                "size=" + size +
                ", vender='" + vender + '\'' +
                ", type=" + type +
                '}';
    }

    public ROM(int size, String vender, RomType type) {
        this.size = size;
        this.vender = vender;
        this.type = type;
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

    public RomType getType() {
        return type;
    }

    public void setType(RomType type) {
        this.type = type;
    }
}
