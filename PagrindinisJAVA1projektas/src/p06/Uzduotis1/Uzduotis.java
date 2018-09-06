package p06.Uzduotis1;
//Tarkime turime masyvą objektų Mokinys. Reikia atspausdinti
//mokinių klasės numerį bei vardus ir pavardes su jų trimestro
//vidurkiu pagal klases vidurkio mažėjimo tvarka.
public class Uzduotis {
    public static void main(String[] args) {
        Mokinys[] mokiniai = {
                new Mokinys("Maryte", "Petraityte", 2, new int[] {7,7,9,4,10}),
                new Mokinys("Ona", "Plona", 3, new int[] {7,8,6,4,10}),
                new Mokinys("Irena", "Jonaityte", 2, new int[] {7,8,1,4,5}),
                new Mokinys("Jonas", "Balionas", 1, new int[] {7,8,9,4,10}),
                new Mokinys("Zose", "Antose", 4, new int[] {7,10,9,4,10})
        };
        for (Mokinys m : mokiniai) {
            System.out.println(m.vardas);
        }

        for (int i = 0; i < mokiniai.length - 2; i++) {

            for (int j = i + 1; j < mokiniai.length; j++) {
                // lyginame i mokini su j mokiniu
                Mokinys iMokinys = mokiniai[i];
                Mokinys jMokinys = mokiniai[j];
                if (iMokinys.vardas.compareTo(jMokinys.vardas) > 0) {
                    Mokinys x = mokiniai[i];
                    mokiniai[i] = mokiniai[j];
                    mokiniai[j] = x;
                }
            }
        }
        System.out.println("Sulygiuoti pagal varda:");
        for (Mokinys m : mokiniai) {
            System.out.println("Klase: " + m.klase + " Vardas: " + m.vardas + " Pavarde: " + m.pavarde + " Vidurkis: "  + m.vidurkis());
        }
        for (int i = 0; i < mokiniai.length -1; i++) {
            for (int j = i + 1; j < mokiniai.length; j++) {
                // lyginame i zmogu su j zmogumi
                Mokinys iMokinys = mokiniai[i];
                Mokinys jMokinys = mokiniai[j];
                if (iMokinys.klase > jMokinys.klase) {
                    Mokinys x = mokiniai[i];
                    mokiniai[i] = mokiniai[j];
                    mokiniai[j] = x;
                }
            }
        }

//        System.out.println("Sulygiuoti paga amziu:");
//        for (Mokinys m : mokiniai) {
//            System.out.println(m.klase + " " + m.klase);
//        }
    }
}
class Mokinys {

    String vardas;
    String pavarde;
    int klase;
    int[] pazymiai;



    public Mokinys(String vardas, String pavarde, int klase, int[] pazymiai) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
        this.pazymiai = pazymiai;
    }
    double vidurkis() {
        double suma = 0;
        for (int p : this.pazymiai) {
            suma += p;
        }
        return Math.round(suma/ this.pazymiai.length * 100.0)/100.0;
    }

}

