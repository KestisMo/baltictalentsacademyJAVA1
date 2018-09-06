package p08;

public class Square extends Rectangle {

    public Square(String color, double krastine) {
        super(color, krastine, krastine);
    }

    @Override
    public double pusplotis() {
        return area() / 2;
    }

    static Square pagalPlota(double plotas) {
        return new Square(null, Math.sqrt(plotas));
    }

    static Square pagalPerimetra(double p) {
        return new Square(null, p / 4);
    }
}
