import java.util.Scanner;

public class VolumeCalculator {
   
    // Method to calculate the volume of a cube
    public static Double calculateVolume(Double sideLength) {
        return sideLength * sideLength * sideLength;
    }
   
    // Method to calculate the volume of a cylinder
    public static Double calculateVolume(Double radius, Double height) {
        return Math.PI * radius * radius * height;
    }
   
    // Method to calculate the volume of a box
    public static Double calculateVolume(Double length, Double width, Double height) {
        return length * width * height;
    }
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        // Taking input for cube
        System.out.print("Enter side length of the cube: ");
        Double cubeSideLength = Double.parseDouble(scanner.nextLine());
       
        // Taking input for cylinder
        System.out.print("Enter radius of the cylinder: ");
        Double cylinderRadius = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter height of the cylinder: ");
        Double cylinderHeight = Double.parseDouble(scanner.nextLine());
       
        // Taking input for box
        System.out.print("Enter length of the box: ");
        Double boxLength = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter width of the box: ");
        Double boxWidth = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter height of the box: ");
        Double boxHeight = Double.parseDouble(scanner.nextLine());
       
        // Calculating volumes
        Double cubeVolume = calculateVolume(cubeSideLength);
        Double cylinderVolume = calculateVolume(cylinderRadius, cylinderHeight);
        Double boxVolume = calculateVolume(boxLength, boxWidth, boxHeight);
       
        // Displaying results
        System.out.println("Volume of Cube: " + cubeVolume);
        System.out.println("Volume of Cylinder: " + cylinderVolume);
        System.out.println("Volume of Box: " + boxVolume);
       
        // Closing scanner
        scanner.close();
    }
}
