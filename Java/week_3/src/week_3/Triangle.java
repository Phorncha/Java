package week_3;

public class Triangle {
    private double base;
    private double height;

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}
