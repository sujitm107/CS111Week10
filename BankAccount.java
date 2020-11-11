public class BankAccount {
    // instance variables
    private String accountNumber;
    private String name;
    private String address;
    private double balance;

    // constructor 1
    public BankAccount(String acctnum, String name, String addr) {
        this.accountNumber = acctnum;
        this.name = name;
        this.address = addr;
        this.balance = 0;
    }

    // constructor 2
    public BankAccount(String acctnum, String name, String addr, double initialDeposit) {
        this.accountNumber = acctnum;
        this.name = name;
        this.address = addr;
        this.balance = initialDeposit;
    }

    public boolean depositMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdrawMoney(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public static boolean transferMoney(BankAccount from, BankAccount to, double amount) {
        if (from.withdrawMoney(amount)) {
            to.depositMoney(amount);
            return true;
        }
        return false;
    }

    public String toString() {
        return this.accountNumber + " - " + this.name + ": $" + this.balance;
    }

    public boolean equals(BankAccount other) {
        if (this.accountNumber.equals(other.accountNumber)) {
            return true;
        }
        return false;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}
