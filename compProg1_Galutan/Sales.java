import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare and initialize variables
        String name = "";
        String mobileNumber = "";
        int monthlyPay = 0;
        int totalSales = 0;
        double commission = 0.0;
        double totalIncome = 0.0;

        // Input section
        System.out.print("SalesPerson: ");
        name = scanner.nextLine();

        System.out.print("MobileNumber: ");
        mobileNumber = scanner.nextLine();

        System.out.print("MonthlyPay: ");
        monthlyPay = scanner.nextInt();

        System.out.print("TotalSales: ");
        totalSales = scanner.nextInt();

        // Calculations
        commission = totalSales * 0.015;
        totalIncome = monthlyPay + commission;

        // Output section
        System.out.println("\n--- Salesperson Details ---");
        System.out.println("Name: " + name);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Monthly Pay: $" + monthlyPay);
        System.out.println("Total Sales: $" + totalSales);
        System.out.printf("Commission (1.5%%): $%.2f\n", commission);
        System.out.printf("Total Income: $%.2f\n", totalIncome);
    }
}
