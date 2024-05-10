import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        System.out.println("This string breaks lines");
        System.out.print("this will not break the line");
        System.out.print("this will be continue");
        System.out.printf("hello %s, Nice", "world");
        System.out.printf("Num %.1f and bool, %b", 10.3f, false);

        // Call the user input method
        userInput();
    }

    // User input method
    public static void userInput() {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("\nThe following takes whole string:");
            String wholeWString = scan.nextLine();
            System.out.println("The input is " + wholeWString);

            System.out.println("\nThe following takes integer:");
            int intInput = scan.nextInt();
            System.out.println("The input is " + intInput);

            System.out.println("\nThe following takes double:");
            double doubleInput = scan.nextDouble();
            System.out.println("The input is " + doubleInput);

            System.out.println("\nThe following takes boolean:");
            boolean booleanInput = scan.nextBoolean();
            System.out.println("The input is " + booleanInput);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter the correct type.");
            e.printStackTrace(); // Print the stack trace for debugging
        } finally {
            scan.close();
        }
    }
}
