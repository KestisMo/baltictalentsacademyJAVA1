package p05.Uzduotis1;
//Sukurkite masyvą, kuriame būtų bent trys Zmogus klasės
  //      objektai ir atspausdinkite visus sukurtus žmones.
 //  Surūšiuokite žmones pagal vardą ir amžių.
public class Pratimas {

    public static void main(String[] args) {

        Zmogus m1 = new Zmogus("Jone", 15);

        Zmogus[] zmones = {
                m1,
                new Zmogus("maryte", 6),
                new Zmogus("Ona", 21),
                new Zmogus("Irena", 18),
                new Zmogus("Šarūnė", 19),
                new Zmogus("Zose", 16)
        };

        for (Zmogus m : zmones) {
            System.out.println(m.vardas);
        }

        for (int i = 0; i < zmones.length - 2; i++) {
            //Zmogus min = zmones[i];

            for (int j = i + 1; j < zmones.length; j++) {
                // lyginame i zmogu su j zmogumi
                Zmogus iZmogus = zmones[i];
                Zmogus jZmogus = zmones[j];
                if (iZmogus.vardas.compareTo(jZmogus.vardas) > 0) {
                    Zmogus x = zmones[i];
                    zmones[i] = zmones[j];
                    zmones[j] = x;
                }
            }
        }

        System.out.println("Sulygiuoti paga varda:");
        for (Zmogus m : zmones) {
            System.out.println(m.vardas);
        }

        for (int i = 0; i < zmones.length - 2; i++) {
            for (int j = i + 1; j < zmones.length; j++) {
                // lyginame i zmogu su j zmogumi
                Zmogus iZmogus = zmones[i];
                Zmogus jZmogus = zmones[j];
                if (iZmogus.amzius > jZmogus.amzius) {
                    Zmogus x = zmones[i];
                    zmones[i] = zmones[j];
                    zmones[j] = x;
                }
            }
        }

        System.out.println("Sulygiuoti paga amziu:");
        for (Zmogus m : zmones) {
            System.out.println(m.amzius + " " + m.vardas);
        }
    }
}

class Zmogus {
    String vardas;

    int amzius;

    Zmogus(String vardas, int amzius) {
        this.vardas = vardas;
        this.amzius = amzius;
    }
}