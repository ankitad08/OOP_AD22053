import java.util.Scanner;
public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(&quot;Enter the radius of the circle:&quot;);
        double radius = scanner.nextDouble();
        if (radius &lt;= 0) {
            System.out.println(&quot;Please enter a non-zero positive number.&quot;);
        } else {
            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;
            System.out.println(&quot;Perimeter of the circle: &quot; + perimeter);
            System.out.println(&quot;Area of the circle: &quot; + area);
        }
        scanner.close();
    }
}