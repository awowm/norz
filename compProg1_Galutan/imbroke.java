import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class imbroke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---- Input ----
        System.out.print("Student Name: ");
        String name = sc.nextLine().trim();

        System.out.print("Total Tuition Fee: ");
        double tuition = sc.nextDouble();

        System.out.print("Amount Paid: ");
        double amountPaid = sc.nextDouble();

        // ---- Computations ----
        double down = tuition * 0.40;
        double prelim = tuition * 0.20;
        double midterm = tuition * 0.20;
        double prefinal = tuition * 0.20;

        boolean belowDown = amountPaid < down;

        double balance = belowDown ? tuition : Math.max(0, tuition - amountPaid);

        // ---- Formatting helper (₱ with no decimals) ----
        NumberFormat peso = NumberFormat.getCurrencyInstance(new Locale("en", "PH"));
        peso.setMaximumFractionDigits(0);
        peso.setMinimumFractionDigits(0);

        // ---- Output (mirrors your Sample output 1) ----
        String line = "------------------------------------------------------------";
        System.out.println();
        System.out.println("Sample output 1:");
        System.out.println(line);
        System.out.printf("%-22s: %s%n", "Student Name", name);
        System.out.printf("%-22s: %s%n", "Total Tuition Fee", peso.format(tuition));
        System.out.println("Financial Breakdown");
        System.out.printf("  %-22s: %s%n", "Down Payment (40%)", peso.format(down));
        System.out.printf("  %-22s: %s%n", "Prelim (20%)",      peso.format(prelim));
        System.out.printf("  %-22s: %s%n", "Midterm (20%)",     peso.format(midterm));
        System.out.printf("  %-22s: %s%n", "PreFinal (20%)",    peso.format(prefinal));
        System.out.printf("%-22s: %s%n", "Amount paid", peso.format(amountPaid));

        if (belowDown) {
            System.out.println("\"Payment is lower than the down payment. Please");
            System.out.println("pay " + peso.format(down) + " or higher.\"");
        }

        System.out.printf("%-22s: %s%n", "Balance", peso.format(balance));
        System.out.println(line);

        sc.close();
    }
}
