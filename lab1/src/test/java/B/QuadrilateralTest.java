package B;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class QuadrilateralTest {

    List<Quadrilateral> quadrilaterals = new ArrayList<>();

    @Before
    public void init() {
        quadrilaterals.add(new Quadrilateral(new Point(0.0,0.0), new Point(0.0,1.0),
                new Point(1.0,1.0), new Point(1.0,0.0)));
        quadrilaterals.add(new Quadrilateral(new Point(4.0,0.0), new Point(0.0,1.0),
                new Point(1.0,1.0), new Point(1.0,0.0)));
        quadrilaterals.add(new Quadrilateral(new Point(4.0,0.0), new Point(6.0,1.0),
                new Point(1.0,1.0), new Point(1.0,0.0)));
        quadrilaterals.add(new Quadrilateral(new Point(4.0,0.0), new Point(6.0,1.0),
                new Point(1.0,1.0), new Point(3.0,0.0)));
    }

    @Test
    public void test1() {
        int rect=0;
        int pram=0;
        int romb=0;
        int rand=0;
        for (Quadrilateral quadrilateral : quadrilaterals) {
            switch (quadrilateral.getType()) {
                case "Квадрат":
                    rect++;
                    break;
                case "Ромб":
                    romb++;
                    break;
                case "Прямоугольник":
                    pram++;
                    break;
                case "Произвольный":
                    rand++;
                    break;
            }
        }
        System.out.println("Квадраты: " + rect);
        System.out.println("Ромбы: " + romb);
        System.out.println("Прямоугольники: " + pram);
        System.out.println("Произвольные: " + rand);

    }


    @Test
    public void maxSq() {
        double maxSq = 0;
        Quadrilateral maxQ = new Quadrilateral();
        for (Quadrilateral q : quadrilaterals) {
            double sq = q.getSquare();
            if (sq > maxSq) {
                maxQ = q;
                maxSq = sq;
            }
        }
        System.out.println("Максимальную площадь имеет четырёхугольник " + maxQ);
    }

    @Test
    public void maxPr() {
        double maxSr = 0;
        Quadrilateral maxQ = new Quadrilateral();
        for (Quadrilateral q : quadrilaterals) {
            double p = q.getPerimeter();
            if (p > maxSr) {
                maxQ = q;
                maxSr = p;
            }
        }
        System.out.println("Максимальный периметр имеет четырёхугольник " + maxQ);
    }

}
