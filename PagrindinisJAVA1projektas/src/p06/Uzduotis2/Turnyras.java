package p06.Uzduotis2;

//Mokykla organizuoja mokinių turnyrą. Turnyras bus rengiamas taurės principu, t.y. susitinka du ir tik laimėtojas išeina į kitą ratą ir t.t. Atspausdinkite turnyro susitikimų lentelę, t.y. kuriame rate kas su kuo žaidžia. Kiekvienai porai suteikite eilės numerį, kad galėtumėt jas identifikuoti, pvz, jei turim 7 vaikus, tai 6 žaidžia pirmame rate, o vienas (Petras) papuola iš kart į antrą ratą, nes neturi poros pirmame rate:
//1 ratas - 1/4:
//   1) Jonas - Ona
//   2) Marytė - Ilona
//   3) Juozas - Marius
//2 ratas - pusfinalis:
//   4) 1 poros laimėtojas - Petras
//   5) 2 poros laimėtojas - 3 poros laimėtojas
//3 ratas - finalas:
//   4 poros laimėtojas - 5 poros laimėtojas
//Išbandykite programą su įvairiu mokinių skaičiumi: 2, 3, 4, 5, 6, 33
public class Turnyras {
    public static void main(String[] args) {
        int numerioSkaitliukas = 1;
        Pretendentai[] dalyviai = {
                new Pretendentai(numerioSkaitliukas++, "Eglė"),
                new Pretendentai(numerioSkaitliukas++, "Darius"),
                new Pretendentai(numerioSkaitliukas++, "Vytis"),
                new Pretendentai(numerioSkaitliukas++, "Marius"),
                new Pretendentai(numerioSkaitliukas++, "Kęstutis"),
                new Pretendentai(numerioSkaitliukas++, "Ernestas"),
                new Pretendentai(numerioSkaitliukas++, "Mindaugas"),
                new Pretendentai(numerioSkaitliukas++, "Deimantas"),
        };
    }
}

class Dalyvis {
    int numeris;

    String getPavadinimas() {
        return "";
    }
}

class Pretendentai extends Dalyvis {
    String vardas;

    public Pretendentai(int numeris, String vardas) {
        this.numeris = numeris;
        this.vardas = vardas;
    }

    String getPavadinimas() {
        return numeris + " " + vardas;
    }
}

