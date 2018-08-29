package p03;
//Duoti trys skaičiai: a, b, c. Nustatykite ar šie skaičiai gali būti
//trikampio kraštinių ilgiai ir jei gali tai kokio trikampio:
//lygiakraščio, lygiašonio ar įvairiakraščio. Atspausdinkite
//atsakymą.
public class Uzduotis1 {

    public static void main(String[] args) {

        trikampis(1, 2, 4);

        double[][] a = {
                {8, 10, 2},
                {8, 2, 10},
                {2, 8, 10},
                {-8, 10, 3},
                {8, -10, 3},
                {8, 10, -3},
                {4, 4, 4},
                {8, 10, 8},
                {4, 3, 5}
        };

        for (double[] e : a) {
            trikampis(e[0], e[1], e[2]);
        }

    }

    static void trikampis(double a, double b, double c) {
        System.out.print(a + " " + b + " " + c);

        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println(" nera trikampis");
        } else {
            System.out.print(" yra ");

            if (a == b && a == c) {
                System.out.println("lygiakrastis");
            } else if (a == b || a == c || b == c) {
                System.out.println("lygiasonis");
            } else {
                System.out.println("belenkoks");
            }
        }
    }
}
