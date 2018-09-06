package p08;

    public class Circle extends Figure {

        double d;

        public Circle(String color, double d) {
            super(color);
            this.d = d;
        }

        @Override
        public double area() {
            return Math.PI * d * d / 4;
        }

        @Override
        public double perimetras() {
            return Math.PI * d;
        }

        // plotas = pi * d * d / 4
        // 1 = pi * d * d / 4 / plotas
        // 1 /(d*d) = pi / 4 / plotas
        // d*d = 1 / (pi / 4 / plotas)
        static Circle pagalPlota(double plotas) {
            double d = Math.sqrt(1.0 / (Math.PI / 4.0 / plotas));
            return new Circle(null, d);
        }
    }