package C;

public class Point {
    Complex x,y,z;

    Point(Complex x, Complex y, Complex z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Complex distance(Point p) {
        return Complex.sqrt(Complex.pow2(this.x.diff(p.x)).add(Complex.pow2(this.y.diff(p.y)).add(Complex.pow2(this.y.diff(p.y)))));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
