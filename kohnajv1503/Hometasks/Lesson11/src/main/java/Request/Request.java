package Request;

/**
 * Created by Симон on 22.12.2015.
 */
public class Request {
    Castomer c;
    Worker w;
    private TYPE t;
    private PRIORITY p;
    public enum TYPE{
        REPAIR(1), WARRANTY_REPAIR(2), DIAGNOSTICS(3);
        private int i;
        private TYPE(int i){
            this.i = i;
        }
        public int num(){
            return this.i;
        }

    }
    public enum PRIORITY {
        HITH(1), MEDIUM(2), LOW(3);
        private int i;
        private PRIORITY(int i){
            this.i = i;
        }
        public int num(){
            return this.i;
        }
    }
    private String deskription;


    public Request(Castomer c, Worker w, Request.TYPE t, Request.PRIORITY p, String deskription) {
        this.c = c;
        this.w = w;
        this.t = t;
        this.p = p;
        this.deskription = deskription;
    }

    public Castomer getC() {
        return c;
    }

    public void setC(Castomer c) {
        this.c = c;
    }

    public Worker getW() {
        return w;
    }

    public void setW(Worker w) {
        this.w = w;
    }

    public TYPE getT() {
        return t;
    }

    public void setT(TYPE t) {
        this.t = t;
    }

    public PRIORITY getP() {
        return p;
    }

    public void setP(PRIORITY p) {
        this.p = p;
    }

    public String getDeskription() {
        return deskription;
    }

    public void setDeskription(String deskription) {
        this.deskription = deskription;
    }

    @Override
    public String toString() {
        return "Request{" +
                "c=" + c +
                ", w=" + w +
                ", t=" + t +
                ", p=" + p +
                ", deskription='" + deskription + '\'' +
                '}';
    }
}

