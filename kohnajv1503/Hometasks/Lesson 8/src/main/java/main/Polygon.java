package main;



/**
 * Реализовать приложение, которое создает иерархию геометрических фигур.
 * При проектировании приложения использовать внутренние/вложенные классы
 * Добавить пример реализации анонимного класса, описывающего 6-тиугольник.
 *
 *  1. Вложенный класс - класс который объявлен внутри блока кода другого класса. Существует два типа вложенных классов:
 *     статические (вложенный класс с модификатором static(ВЛОЖЕННЫЙ КЛАСС)) и нестатические
 *     (нестатический вложенный класс (ВНУТРЕННИЙ КЛАСС)).
 *
 *  2. Анонимный класс - безимянный внутренний класс
 */
public class Polygon extends App { // Многоугольник
    private final String LINES_COLOR = "Black";
    public void shape () {
    }
    public void init (){
        addNewPolygon(new Polygon()
        {
            public void say () {
                System.out.println("Внитри анонимного класса, расширяющего \"Polygon\"");
            }
        });
    }


    // реазизация внутреннего класса
    public class Triangle {// Треугольник

        private final int NUMBER_OF_SIDES_OF_TRIANGLE = 3;

        public void say() {
            System.out.println("Я треугольник.");
        }
    }
    // реализация вложенного класса
    static public class Quadrangle {
        private final int NUMBER_OF_SIDES_OF_QUADRANGLE = 4;

        public class Rectangle {
            public class Square {

            }
        }
    }




}