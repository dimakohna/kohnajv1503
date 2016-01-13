package point;

import java.io.Serializable;

/**
 * Created by Симон on 09.12.2015.
 */
public class Point implements Comparable<Point>, Serializable {
   private int x;
   private int y;



    public Point(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int compareTo(Point o) {
        return this.x - o.getX();
    }
}
