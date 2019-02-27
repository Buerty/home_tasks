public class square extends Shape {
    int firstSide;

    public square(int firstSide) {
        this.firstSide = firstSide;
    }

    @Override
    public int doingArea() {
        return firstSide*firstSide;
    }
}