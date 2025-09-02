
import java.util.Scanner;
import java.time.Year;

public class register {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get current year
        int currentYear = Year.now().getValue();

        // Input from user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Calculate age
        int age = currentYear - birthYear;

        // Display output
        System.out.println("\n--- User Information ---");
        System.out.println("Name      : " + name);
        System.out.println("Address   : " + address);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age       : " + age + " years old");

        scanner.close();
    }
}


