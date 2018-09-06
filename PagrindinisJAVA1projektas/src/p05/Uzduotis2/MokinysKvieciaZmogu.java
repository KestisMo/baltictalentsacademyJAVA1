package p05.Uzduotis2;
//Mokinio konstruktorius kvieciantis Zmogaus konstruktoriu su super(…)
public class MokinysKvieciaZmogu {

    public static void main(String[] args) {

        Zmogus z = new Zmogus("Jonas", 12);

        System.out.println(z.getClass().getName());

        Mokinys m = new Mokinys("Ona", 6, 1);

        System.out.println(m.getClass().getName());

        Object z2 = m;
        System.out.println(z2.getClass().getName());


        Object[] belenkai = new Object[] {
                10,
                "Kuku",
                z2,
                z,
                true,
                Math.PI
        };

        for (Object o : belenkai) {
            if (o instanceof Mokinys) {
                Mokinys m1 = (Mokinys)o;
                System.out.println("Mokinys " + m1.klase);
            } else if (o instanceof Zmogus) {
                System.out.println("Zmogus " + ((Zmogus) o).vardas);
            } else {
                System.out.println(o);
            }
        }
    }
}

class Zmogus {

    String vardas;

    int amzius;

    public Zmogus(String vardas, int amzius) {
        this.vardas = vardas;
        this.amzius = amzius;
    }

}

class Mokinys extends Zmogus {

    int klase;

    String vardas;

    Mokinys(String vardas) {
        this(vardas, 6, 1);
    }

    Mokinys(String vardas, int amzius, int klase) {
        super(vardas, amzius);
        this.klase = klase;
    }
}