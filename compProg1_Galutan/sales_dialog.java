import javax.swing.JOptionPane;

public class sales_dialog {
    public static void main(String[] args) {
        // Declare and initialize variables
        String name = "";
        String mobileNumber = "";
        int monthlyPay = 0;
        int totalSales = 0;
        double commission = 0.0;
        double totalIncome = 0.0;

        // Input section using dialog boxes
        name = JOptionPane.showInputDialog("Enter Salesperson Name:");
        mobileNumber = JOptionPane.showInputDialog("Enter Mobile Number:");

        String monthlyPayStr = JOptionPane.showInputDialog("Enter Monthly Pay:");
        monthlyPay = Integer.parseInt(monthlyPayStr);

        String totalSalesStr = JOptionPane.showInputDialog("Enter Total Sales:");
        totalSales = Integer.parseInt(totalSalesStr);

        // Calculations
        commission = totalSales * 0.015;
        totalIncome = monthlyPay + commission;

        // Prepare output message
        String message = "---- Salesperson Details ----\n"
                       + "Name: " + name + "\n"
                       + "Mobile Number: " + mobileNumber + "\n"
                       + "Monthly Pay: $" + monthlyPay + "\n"
                       + "Total Sales: $" + totalSales + "\n"
                       + String.format("Commission (1.5%%): $%.2f\n", commission)
                       + String.format("Total Income: $%.2f", totalIncome);

        JOptionPane.showMessageDialog(null, message);
    }
}