import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
             
        int count = 0; // Initialize count to 0
        while (count < 3) { // While count is less than 3
            System.out.println("While Count" + count); // Print "While Count" followed by the current value of count
            count++;
        }
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert a number between 0 and 100:");

        int inputInt = scan.nextInt();
        while (inputInt < 0 || inputInt > 100) {
            System.out.println("Number must be between 0 and 100. Please try again:");
            inputInt = scan.nextInt();
        }

        System.out.println("Condition matched: " + inputInt);
        scan.close();
    }
}
