import java.time.Year;
import java.util.Scanner;

public class activity1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    String name = "";
    int birthYear = 0;
    int currentYear = Year.now().getValue();

    System.out.print("Enter your name: ");
      name = scanner.nextLine();

    System.out.print("Enter your birth year: ");
      birthYear = scanner.nextInt();

    int age = currentYear - birthYear;

    if (age < 18) {
        System.out.println("You are not yet " + age + " years old to vote");
    }

    
    }
}
