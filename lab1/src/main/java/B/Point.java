package B;

import static java.lang.Math.sqrt;

public class Point {
    Double x, y;

    Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(Point p) {
        return sqrt((this.x-p.x)*(this.x-p.x) + (this.y-p.y)*(this.y-p.y));
    }

    @Override
    public String toString() {
        return "x=" + x.toString() +
                " y=" + y.toString() + "\n";
    }
}
