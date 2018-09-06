package p08;
//Sukurkite abstrakčią klasę Figura kurioje būtų aprašyti abstraktūs metodai
//plotui ir perimetrui paskaičiuoti
//Tada sukurkite dukterines klases Apskritimas, Kvadratas, Trikampis
//(lygiakraštis).

//1. Paskaičiuokite kokie turėtų būti visų perimetrai, kad plotai būtų vienodi,
//tarkime lygūs 100.

public class Main {

    public static void main(String[] args) {

//        Figura f = new Figura("balta");
//        print(f);

        Figure k = new Square("juodas", 2);
        Figure a = new Circle("juodas", 2);
        Figure t = new LygiakrastisTrikampis("juodas", 2);

        apie(k);
        apie(a);
        apie(t);

        Figure a100 = Circle.pagalPlota(100);
        apie(a100);

        Figure k100 = Square.pagalPlota(100);
        apie(k100);
    }

    static void print(Figure a) {
        System.out.println("Pusplotis:" + a.pusplotis());
    }

    static void apie(Figure f) {
        System.out.println(
                f.getClass().getSimpleName() + " " +
                        "Plotas: " + f.area() +
                        ", perimetras: " + f.perimetras());
    }

}