import java.util.Scanner;

public class FinancialAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        double amountPaid = 0.0;
        double tuition = 0.0;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();


        System.out.print("Enter Your total tuition fee: ");
        tuition = scanner.nextDouble();


        // financial Breakdown
        double downPayment = tuition * 0.40;
        double prelim = tuition * 0.20;
        double midterm = tuition * 0.20;
        double prefinal = tuition * 0.20;

        System.out.println("\nFinancial Breakdown:");
        System.out.printf("  Down Payment (40%%): %.2f%n", downPayment);
        System.out.printf("  Prelim (20%%): %.2f%n", prelim);
        System.out.printf("  Midterm (20%%): %.2f%n", midterm);
        System.out.printf("  PreFinal (20%%): %.2f%n", prefinal);
        System.out.printf("  Amount Paid: %.2f%n", amountPaid);


        System.out.print("Enter Amount paid: ");
        amountPaid = scanner.nextDouble();

        // compute balance
        double balance = tuition - amountPaid;

        // check if amount paid is below required down payment
        if (amountPaid < downPayment) {
            System.out.println("\n⚠ Payment is lower than the required down payment.");
            System.out.println("Please pay at least " + downPayment + " or higher.");
        }

        // final balance
        System.out.printf("%-22s: %.2f%n", "Balance", balance);

        scanner.close();
    }
}
