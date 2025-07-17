public class shape{

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Volume of cube,cylinder and rectangular prism");
        System.out.println("");

        // Assign input values directly
        double side = 2; // Cube side length
        double length = 2.5; // Rectangular prism length
        double width = 5.0; // Rectangular prism width
        double height = 3.0; // Rectangular prism and cylinder height
        double radius = 5; // Cylinder radius

        // Cube Volume Calculation
        double cubeVolume = side * side * side;
        System.out.println("");
        System.out.println("==================================");
        System.out.println("|         VOLUME of a Cube       |");
        System.out.println("==================================");
        System.out.println("The value of side is " + side);
        System.out.println("Formula: side * side * side");
        System.out.println("Volume of the cube: " + cubeVolume);
        System.out.println("");

        // Rectangular Prism Volume Calculation
        System.out.println("");
        System.out.println("==================================");
        System.out.println("| VOLUME of a Rectangular Prism  |");
        System.out.println("==================================");
        double rectangularPrismVolume = length * width * height;
        System.out.println("The value of the length is " + length);
        System.out.println("The value of the width is " + width);
        System.out.println("The value of the heigth is " + height);
        System.out.println("Formula:length * width * height");
        System.out.println("Volume of the rectangular prism: " + rectangularPrismVolume);
        System.out.println("");

        // Cylinder Volume Calculation
        System.out.println("");
        System.out.println("==================================");
        System.out.println("|      VOLUME of a Cylinder      |");
        System.out.println("==================================");
        double cylinderVolume = 3.1416 * radius * radius * height;
        System.out.println("The value of the radius is " + radius);
        System.out.println("The value of the height is " + height);
        System.out.println("Formula:3.1416 * radius * radius * height");
        System.out.println("Volume of the cylinder: " + cylinderVolume);
        System.out.println("");
    }
}