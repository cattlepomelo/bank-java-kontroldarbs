import java.util.Scanner;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Internetbanka!");

        while (true) {
            System.out.print("\nIzvēlies darbību (1 => pievienot, 2 => izņemt, 3 => balanss, 4 => iziet): ");
            String cmd = sc.nextLine();

            if (cmd.equals(1)) {
                break;
            }

            switch (cmd) {
                case "1":
                    System.out.print("\nIevadiet pievienojamo summu: ");
                    int dep = (int) Double.parseDouble(sc.nextLine());
                    bankAcount.deposit();
                    break;
                case "2":
                    System.out.print("\nIevadiet izņemto summu: ");
                    int wit = (int) Double.parseDouble(sc.nextLine());
                    bankAcount.withdraw();
                    break;
                case "3":
                    System.out.print("Konta balanss: " + bankAcount.getBalance);
                    break;
                case "4":
                    System.out.print("Visu labu!");
                    break;
                default:
                    System.out.print("Nederīga komanda!");
            }
        }

        sc.close();
    }
}
