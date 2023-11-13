//Task3 ATM Interface
import java.util.Scanner;

public class ATMInterface {
    private static final int PIN = 1234;
     // Starting balance
    private static double balance = 1000.00; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("👋 Welcome to the ATM👋");
        System.out.print("Please enter your🔒4-digit PIN:");
        int enteredPin = scanner.nextInt();

        if (enteredPin == PIN) {
            System.out.println("PIN🔓accepted.👍");
            displayOptions(scanner);
        } else {
            System.out.println("Incorrect PIN. Exiting...");
        }
    }

    public static void displayOptions(Scanner scanner) {
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance💵💵 is: Rs" + balance);
                    break;
                case 2:
                    System.out.print("How much cash💸💸 would you like to withdraw? =");
                    double amountToWithdraw = scanner.nextDouble();
                    if (amountToWithdraw > balance) {
                        System.out.println("Insufficient😒funds.");
                    } else {
                        balance -= amountToWithdraw;
                        System.out.println("Rs" + amountToWithdraw + "\nPlease take your cash.💵💵");
                    }
                    break;
                case 3:
                    System.out.print("Enter the amount💵💵to deposit: Rs");
                    double amountToDeposit = scanner.nextDouble();
                    if (amountToDeposit <= 0) {
                        System.out.println("Invalid amount.");
                    } else {
                        balance += amountToDeposit;
                        System.out.println("Rs" + amountToDeposit + "Successfully deposited😊");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!👍");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.🙄Please try again.");
                    break;
            }
        }
    }
}
