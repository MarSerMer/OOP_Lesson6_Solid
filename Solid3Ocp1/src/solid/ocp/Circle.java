package solid.ocp;

public class Circle implements Shape{
    private int radius;

    double pi = Math.PI;
    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double countSquare() {
        return radius*radius*pi;
    }
}
