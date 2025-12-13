public class Triangle extends Shape {
    protected int c;

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public int getPerimeter() {
        return super.getPerimeter() + this.c;
    }

}
