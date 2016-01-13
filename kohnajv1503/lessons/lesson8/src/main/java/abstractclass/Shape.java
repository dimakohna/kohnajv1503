package abstractclass;

/**
 * Created by Симон on 06.12.2015.
 */
public abstract class Shape {
    public abstract void moveHor();
    public abstract void moveVer();
    public abstract void movedrav();

    public static class Point{
        private int x=1;
        private int y=1;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
