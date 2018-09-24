package A;

public class Rect {

    private Segment a, b, c, d;
    private String color;
    private double size;

    public Rect(double size) {
        this(size, "black");
    }

    public Rect(double size, String color) {
        this.size = size;
        this.color = color;
    }

    public void stretch(double multiplier) {
        size *= multiplier;
    }

    public void squeeze(double divider) {
        size /= divider;
    }

    public void rotation() {
        // manipulations with segments
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(double size) {
        this.size = size;
    }

    class Point {
        private double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Point point = (Point) o;

            if (Double.compare(point.x, x) != 0) return false;
            return Double.compare(point.y, y) == 0;
        }

        @Override
        public int hashCode() {
            int result;
            long temp;
            temp = Double.doubleToLongBits(x);
            result = (int) (temp ^ (temp >>> 32));
            temp = Double.doubleToLongBits(y);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            return result;
        }

        @Override
        public String toString() {
            return '(' + x +
                    ", " + y +
                    ')';
        }
    }

    class Segment {
        private Point a, b;

        public Segment(Point a, Point b) {
            this.a = a;
            this.b = b;
        }

        public Point getA() {
            return a;
        }

        public Point getB() {
            return b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Segment segment = (Segment) o;

            if (!a.equals(segment.a)) {
                if (!a.equals(segment.b)) {
                    return false;
                } else {
                    return b.equals(segment.a);
                }
            }
            return b.equals(segment.b);
        }

        @Override
        public int hashCode() {
            int result = a.hashCode();
            result = 31 * result + b.hashCode();
            return result;
        }

        @Override
        public String toString() {
            return "{" + a + "; " + b + "}";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rect rect = (Rect) o;

        if (Double.compare(rect.size, size) != 0) return false;
        if (!a.equals(rect.a)) return false;
        if (!b.equals(rect.b)) return false;
        if (!c.equals(rect.c)) return false;
        if (!d.equals(rect.d)) return false;
        return color.equals(rect.color);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = a.hashCode();
        result = 31 * result + b.hashCode();
        result = 31 * result + c.hashCode();
        result = 31 * result + d.hashCode();
        result = 31 * result + color.hashCode();
        temp = Double.doubleToLongBits(size);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Rect: \n" +
                "a=" + a + "\n" +
                ", b=" + b + "\n" +
                ", c=" + c + "\n" +
                ", d=" + d + "\n" +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
