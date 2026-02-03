public class BankAccount {

    private double balance;

    public BankAccount() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Summai jābūt pozitīvai");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Summai jābūt pozitīvai");
        } else if (amount > balance) {
            System.out.println("Nepietiekami līdzekļi");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
