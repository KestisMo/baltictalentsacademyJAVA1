package p08;

public class Trikampis extends Figure {

    double a, b, c;

    public Trikampis(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double area() {
        double pp = perimetras() / 2;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }

    @Override
    public double perimetras() {
        return a + b + c;
    }
}
