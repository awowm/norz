import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get employee data
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter skill level (1, 2, or 3): ");
        int skillLevel = scanner.nextInt();

        System.out.print("Enter number of hours worked: ");
        int hoursWorked = scanner.nextInt();

        // Determine rate per hour using if-else
        double ratePerHour = 0;
        if (skillLevel == 1) {
            ratePerHour = 800;
        } else if (skillLevel == 2) {
            ratePerHour = 650;
        } else if (skillLevel == 3) {
            ratePerHour = 500;
        } else {
            System.out.println("Invalid skill level!");
            return; // stop program if invalid
        }

        // Calculate regular and overtime hours
        int regularHours = hoursWorked;
        int overtimeHours = 0;

        if (hoursWorked > 40) {
            regularHours = 40;
            overtimeHours = hoursWorked - 40;
        }

        // Calculate pay
        double regularPay = regularHours * ratePerHour;
        double overtimePay = overtimeHours * ratePerHour * 1.5;
        double grossPay = regularPay + overtimePay;
        double tithe = grossPay * 0.10;
        double netPay = grossPay - tithe;

        // Display results
        System.out.println("\n--- Payroll Summary ---");
        System.out.println("Employee Name: " + name);
        System.out.println("Skill Level: " + skillLevel);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Rate per Hour: " + ratePerHour);
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Regular Pay: " + regularPay);
        System.out.println("Overtime Pay: " + overtimePay);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Tithe: " + tithe);
        System.out.println("Net Pay: " + netPay);
    }
}
