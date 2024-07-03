import java.util.Scanner;

public class calculate {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the shape (1 for rectangle, 2 for circle): ");
        int shape = scanner.nextInt();

        switch (shape) {
            case 1:
                int length = 10;
                int width = 20;
                int areaRectangle = length * width;
                System.out.println("The area of rectangle is " + areaRectangle);
                break;

            case 2:
                int radius = 10;
                double pi = 3.14;
                double areaCircle = pi * radius * radius;
                System.out.println("The area of circle is " + areaCircle);
                break;

            default:
                System.out.println("Invalid shape entered.");
                break;
        }

        scanner.close();
    }
}
