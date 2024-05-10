package task;
import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What is your name?");
    
        String name = myObj.nextLine();  // Read user input
        System.out.println("Are you over 18?");
        boolean status = myObj.nextBoolean();
        System.out.println("How many siblings?");
        int siblings = myObj.nextInt();  // Read user input

        // Output user inputs
        System.out.println("Name: " + name);
        System.out.println("Over 18: " + status);
        System.out.println("Number of siblings: " + siblings);
        
        // Close the Scanner object
        myObj.close();
    }
}
