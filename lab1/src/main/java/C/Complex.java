package C;

public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public static Complex pow2(Complex c) {
        return new Complex(c.re * c.re + c.im + c.im + 2*c.re, 2*c.re*c.im);
    }

    public Complex diff(Complex complex) {
        return new Complex(this.re - complex.re, this.im - complex.im);
    }

    public Complex add(Complex complex) {
        return new Complex(this.re + complex.re, this.im + complex.im);
    }

    public static Complex sqrt(Complex c) {
        return new Complex(Math.sqrt(c.re), Math.sqrt(c.im));
    }

    @Override
    public String toString() {
        return "(" + re + "+" + im + "i)";
    }
}