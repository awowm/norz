import java.util.Scanner;
import javax.swing.JOptionPane;

public class hulugan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // Declare and initialize variables
        String bname = "";
        double carPrice = 0;
        double downpayment = 0.0;
        int loanTerm = 0;

        System.out.print("Borrower Name: ");
        bname = scanner.nextLine();

        System.out.print("carprice: ");
        carPrice = scanner.nextDouble();

        System.out.print("downpayment: ");
        downpayment = scanner.nextDouble();

        System.out.print("loanTerm: ");
        loanTerm = scanner.nextInt();
       
        // Calculations
        double loanAmount = (carPrice - downpayment);
        double monthlyPayment = loanAmount / (loanTerm * 12);


        String message = "---- Salesperson Details ----\n"
                       + "barrower's name: " + bname + "\n"
                       + "carprice: " + carPrice + "\n"
                       + "downpayment: $" + downpayment + "\n"
                       + "loan term: $" + loanTerm + "\n"
                       + "loan amount: $" + loanAmount + "\n"
                       + "monthly payment: $" + monthlyPayment + "\n";

        JOptionPane.showMessageDialog(null, message);
    }
}
    

