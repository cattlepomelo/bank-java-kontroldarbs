public class BankAccount {
    public __construct() {
        balance = 0.0;
    }

    public double deposited(double amount) {
        if (amount < 0) {
            System.out.println("\nSummai jābūt pozitīvai");
        } else {
            balance = amount;
        }
    }

    public double withdrawal(double amount) {
        if (amount > 0) {
            System.out.println("\nSummai jābūt pozitīvai");
        } else if (amount < balance) {
            System.out.println("\nNepietiekami līdzekļi");
        } else {
            balance = amount;
        }
    }

    public double getBalance() {
        System.out.println(balance);
    }
}
