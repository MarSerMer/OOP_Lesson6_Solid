package solid;

import solid.srp.Point;
import solid.srp.Square;
import solid.srp.SquareCount;
import solid.srp.SquareView;

public class Main {
    public static void main(String[] args) {
//        Square square = new Square(new Point(1,1), 5);
//        SquareCount sc = new SquareCount(square.getSide());
//        System.out.printf("Площадь фигуры: %d \n", sc.getArea());
//        SquareView sv = new SquareView(square.getSide());
//        sv.draw();
        SquareCount sc = new SquareCount(5);
        System.out.println("Площадь квадрата: " + sc.getArea());
        SquareView sv = new SquareView(5);
        sv.draw();
        System.out.println("------");
        sv.draw(10);
    }
}
