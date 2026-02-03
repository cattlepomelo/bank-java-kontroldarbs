import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();

        System.out.println("Internetbanka!");

        while (true) {
            System.out.print(
                "\nIzvēlies darbību (1 => pievienot, 2 => izņemt, 3 => balanss, 4 => iziet): "
            );

            String cmd = sc.nextLine();

            switch (cmd) {
                case "1":
                    System.out.print("Ievadiet pievienojamo summu: ");
                    double dep = Double.parseDouble(sc.nextLine());
                    bankAccount.deposit(dep);
                    break;

                case "2":
                    System.out.print("Ievadiet izņemamo summu: ");
                    double wit = Double.parseDouble(sc.nextLine());
                    bankAccount.withdraw(wit);
                    break;

                case "3":
                    System.out.println("Konta balanss: " + bankAccount.getBalance());
                    break;

                case "4":
                    System.out.println("Visu labu!");
                    sc.close();
                    return;

                default:
                    System.out.println("Nederīga komanda!");
            }
        }
    }
}