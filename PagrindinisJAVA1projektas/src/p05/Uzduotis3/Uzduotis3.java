package p05.Uzduotis3;
//Mokiniu masyvo rusiavimas pagal klase, pavarde ir varda
public class Uzduotis3 {

    public static void main(String[] args) {
        Mokinys[] mokiniai = {
                new Mokinys("Jonas", "Jonaitis", 3),
                new Mokinys("Antanas", "Jonaitis", 2),
                new Mokinys("Vycka", "Antanaitis", 3),
                new Mokinys("Petras", "Jonaitis", 1),
                new Mokinys("Ona", "Jonaite", 4),
                new Mokinys("Maryte", "Petryte", 1)
        };

        for (int i = 0; i < mokiniai.length - 1; i++) {

            for (int j = i + 1; j < mokiniai.length; j++) {

//                if (mokiniai[i].klase > mokiniai[j].klase) {
//                    Mokinys x = mokiniai[i];
//                    mokiniai[i] = mokiniai[j];
//                    mokiniai[j] = x;
//                } else if (mokiniai[i].klase < mokiniai[j].klase) {
//                    // nieko nedarom
//                } else if (mokiniai[i].pavarde.compareTo(mokiniai[j].pavarde) > 0) {
//                    Mokinys x = mokiniai[i];
//                    mokiniai[i] = mokiniai[j];
//                    mokiniai[j] = x;
//                } else if (mokiniai[i].pavarde.compareTo(mokiniai[j].pavarde) < 0) {
//                } else if (mokiniai[i].vardas.compareTo(mokiniai[j].vardas) > 0) {
//                    Mokinys x = mokiniai[i];
//                    mokiniai[i] = mokiniai[j];
//                    mokiniai[j] = x;
//                }

                if (mokiniai[i].klase > mokiniai[j].klase ||
                        (mokiniai[i].klase == mokiniai[j].klase &&
                                mokiniai[i].pavarde.compareTo(mokiniai[j].pavarde) > 0) ||
                        (mokiniai[i].klase == mokiniai[j].klase &&
                                mokiniai[i].pavarde.compareTo(mokiniai[j].pavarde) == 0 &&
                                mokiniai[i].vardas.compareTo(mokiniai[j].vardas) > 0)
                ) {
                    Mokinys x = mokiniai[i];
                    mokiniai[i] = mokiniai[j];
                    mokiniai[j] = x;
                }
            }
        }

        for (Mokinys m : mokiniai) {
            System.out.println(m.klase + " " + m.pavarde + " " + m.vardas);
        }

    }
}

class Mokinys {

    String vardas;

    String pavarde;

    int klase;

    public Mokinys(String vardas, String pavarde, int klase) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
    }


}