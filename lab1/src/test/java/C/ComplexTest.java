package C;

import org.junit.Test;

public class ComplexTest {
    @Test
    public void distance() {
        Point p1 = new Point(new Complex(8,12), new Complex(2, 14), new Complex(3, 13));
        Point p2 = new Point(new Complex(4,15), new Complex(5, 16), new Complex(6, 15));
        System.out.println();
        System.out.println("Расстояние от точки " + p1 + " до " + p2 + " = " + p1.distance(p2));
        System.out.println("Расстояние от точки " + p1 + " до начала координат = " + p1.distance(new Point(new Complex(0.0,0.0), new Complex(0.0,0.0), new Complex(0.0,0.0))));
        System.out.println();
    }
}
