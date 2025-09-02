public class Shapes_Galutan {
    public static void main(String[] args) { // Triangle variables
        double base = 10;
        double height = 5;
        double triangleArea = 0.5 * base * height; // Rectangle variables
        double length = 8;
        double width = 4;
        double rectangleArea = length * width; // Circle variables
        double radius = 7;
        double circleArea = Math.PI * radius * radius;

        // Display results
        System.out.println  ("===========================");
        System.out.println  ("|     Area of Triangle    |");
        System.out.println  ("=============================");
        System.out.println  ("The Value of base is=" + base);
        System.out.println  ("The Value of height=" + height);
        System.out.println  ("The Area of triangleArea=" + triangleArea);
        System.out.println  ("=============================");
        System.out.println("|       Area of Rectangle    |");
        System.out.println("=============================");
        System.out.println("The Value of length" + length);
        System.out.println("The Value of width=" + width);
        System.out.println("The area of Rectangle=" + rectangleArea);
        System.out.println("=============================");
        System.out.println("|       Area of Circle    |");
        System.out.println("=============================");
        System.out.println("The Value of length pi is = " + triangleArea);
        System.out.println("The Value of length radius is = " + rectangleArea);
        System.out.println("The area of Circle is  = " + circleArea);

    }

}