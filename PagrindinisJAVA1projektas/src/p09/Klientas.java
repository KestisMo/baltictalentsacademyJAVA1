package p09;

public class Klientas implements Mokejimai {

    private String name;

    private String code;

    private String bankAccount;

    private double amount;

    public Klientas(String name, String code, String bankAccount, double amount) {
        this.name = name;
        this.code = code;
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String getBankAccount() {
        return bankAccount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

}
