package B;

import static java.lang.Math.sqrt;

public class Quadrilateral {
    Point a, b, c, d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    double getPerimeter() {
        return a.getDistance(b) + b.getDistance(c) + c.getDistance(d) + d.getDistance(a);
    }

    double getSquare() {
        double p = getPerimeter()/2;
        return sqrt((p-a.getDistance(b))*(p-b.getDistance(c))*(p-c.getDistance(d))*(p-d.getDistance(a)));
    }

    @Override
    public String toString() {
        return "Quadrilateral{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    public Quadrilateral() {
    }

    String getType() {
        if (a.getDistance(b) == c.getDistance(d)) {
            if (b.getDistance(c) == a.getDistance(d)) {
                if (a.getDistance(c) == b.getDistance(d)) {
                    return "Квадрат";
                } else {
                    return "Ромб";
                }
            } else if (a.getDistance(c) == b.getDistance(d)) {
                return "Прямоугольник";
            }
        }
        return "Произвольный";
    }

}