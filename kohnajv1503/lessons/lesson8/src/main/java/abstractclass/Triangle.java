package abstractclass;

/**
 * Created by Симон on 06.12.2015.
 */
public class Triangle extends Shape {
    @Override
    public void moveHor() {
        System.out.println("Движение по горизонтали");
    }

    @Override
    public void moveVer() {
        System.out.println("Движение по вертикали");

    }

    @Override
    public void movedrav() {
        System.out.println("Прорисовка треугольника");

    }
}
