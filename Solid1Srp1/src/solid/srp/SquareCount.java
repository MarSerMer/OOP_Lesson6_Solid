package solid.srp;

public class SquareCount {
    int side;

    public SquareCount(int size) {
        this.side = size;
    }

    public int getArea() {
        return this.side * this.side;
    }
}
