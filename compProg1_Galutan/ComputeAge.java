import java.util.Scanner;

public class ComputeAge {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // Corrected scanner declaration

        int present_year = 2025;
        int year_born = 0;
        int age;

        System.out.print("Enter the Born Year: ");
        year_born = input.nextInt(); // Read the input from the user

        age = present_year - year_born; // Calculate age
        System.out.println("Age: " + age);
    }
}
