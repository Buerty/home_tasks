public class Rectangle extends Shape {
    int firstside=8;
    int secondside=6;


    @Override
    public int doingArea() {
        return firstside*secondside;
    }
}
