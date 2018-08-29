package p05;

public class Zmogus {

    static class zmogus {

        String vardas;
        String pavarde;
        String metai;

        zmogus (String vardas, String pavarde, String metai) {
            this.vardas = vardas;
            this.pavarde = pavarde;
            this.metai = metai;
        }
    }

    public static void main(String[] args) {

        zmogus[] zmones = new zmogus[3];
        zmones[0] = new zmogus("Kestutis", "Mozeris", "22");
        zmones[1] = new zmogus("Jonas", "Jonaitis", "45");
        zmones[2] = new zmogus("Petras", "Petraitis", "70");

        for (zmogus z : zmones)
            System.out.println("Vardas: " + z.vardas + ". " + "Pavardė: " + z.pavarde + ". " + "Metai: " + z.metai + ". ");
    }
}