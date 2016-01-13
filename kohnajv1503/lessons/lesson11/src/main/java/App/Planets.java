package App;

/**
 * Created by Симон on 20.12.2015.
 */


    public enum Planets {
        VENUS (2),
        EARTH (3),
        MARS (4),
        SATURN (6);

    private int i;
    private Planets (int i){
        this.i=i;

    }
    public int num () {
        return this.i;
    }

    }
