public class Shape {
    protected int a;
    protected int b;
    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getPerimeter() {
        return this.a + this.b;
    }
}
