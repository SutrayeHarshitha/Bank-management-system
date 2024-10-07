import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter your customer ID: ");
        String customerId = scanner.nextLine();

        BankAccount account = new BankAccount(customerName, customerId);
        account.showMenu();

        scanner.close();
    }
}
