///Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the 
//corresponding GPA value. Use a switch case statement to handle different grades.
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks: ");
        int marks = scanner.nextInt();

        switch (marks) {
            case 40:
                System.out.println("You have received F");
                break;
            case 50:
                System.out.println("You have received E");
                break;
            case 60:
                System.out.println("You have received D");
                break;
            case 70:
                System.out.println("You have received C");
                break;
            case 80:
                System.out.println("You have received B");
                break;
            case 90:
                System.out.println("You have received A");
                break;
            default:
                System.out.println("Invalid marks entered.");
                break;
        }

        scanner.close();
    }
}
