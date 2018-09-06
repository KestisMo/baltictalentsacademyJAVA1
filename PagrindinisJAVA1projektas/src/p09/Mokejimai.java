package p09;

public interface Mokejimai {

    String getName();

    String getBankAccount();

    double getAmount();

    default String makeString() {
        return "Kam: " + getName() + "kur: " + getBankAccount() + "kiek: " + getAmount();

    }
}