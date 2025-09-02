import java.util.Scanner;
public class Triangelinput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("=COMPUTER PROGRAMMING=");
        System.out.println("======================");
        System.out.println("======================");
        System.out.println("==Area Of a Triangel==");

        // Prompt user for base
        System.out.print("Enter the value of base: ");
        int base = scanner.nextInt();

        // Prompt user for height
        System.out.print("Enter the value of height: ");
        double height = scanner.nextDouble();

        System.out.println("The Value of base is " + base);
        System.out.println("The Value of height is " + height);

        double area = (base * height) / 2;
        System.out.println("The area of the triangel is " + area);

        scanner.close();
    }
}
