public class Rectangle extends Shape {
    int firstSide;
    int secondSide;

    public Rectangle(int firstside, int secondside) {
        this.firstSide = firstside;
        this.secondSide = secondside;
    }

    @Override
    public int doingArea() {
        return firstSide*secondSide;
    }
}
