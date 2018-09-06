package p09;

public class Darbuotojas implements Mokejimai {

    private String vardas;

    private String pavarde;

    private String bankAccount;

    private double salary;


    public Darbuotojas(String vardas, String pavarde, String bankAccount, double salary) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.bankAccount = bankAccount;
        this.salary = salary;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getName() {
        return vardas + " " + pavarde;
    }

    @Override
    public String getBankAccount() {
        return bankAccount;
    }

    @Override
    public double getAmount() {
        return salary;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
}
