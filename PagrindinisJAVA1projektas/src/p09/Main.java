package p09;

public class Main {

    public static void main(String[] args) {

        Sarasas mokejimai = new Sarasas();
        mokejimai.add(new Darbuotojas("Jonas", "Jonaitis", "LT11222", 500.0));
        mokejimai.add(new Darbuotojas("Petras", "Petroitis", "LT11444", 666.0));
        mokejimai.add(new Klientas("UAB abc", "123", "LT7654", 1000.0));

//        Mokejimai[] mokejimai = {
//                new Darbuotojas("Jonas", "Jonaitos", "LT11222", 500.0),
//                new Darbuotojas("Petras", "Petro", "LT11444", 666.0),
//                new Klientas("UAB abc", "123", "LT7654", 1000.0)
//        };
        print(mokejimai);
    }

////    public static void print(Mokejimai[] moketojai) {
////        for (Mokejimai m : moketojai) {
////            System.out.println("Kam: " + m.getName() +
////                    ", kur: " + m.getBankAccount() +
////                    ", kiek: " + m.getAmount());
//            System.out.println(m.makeString());
//        }
//    }

    public static void print(Sarasas sarasas) {

        for (int i = 0; i < sarasas.size(); i++) {
            System.out.println(sarasas.get(i).makeString());
        }
    }
}
