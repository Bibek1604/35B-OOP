
import java.util.Scanner;

/*
 * Design and implement a simple Java program that prompts the user to enter a string
 * within a specified length, for example between 5 and 20 characters. Your application
 * should throw and handle a custom exception if the user enters a string outside this length.
 * 
 * - InvalidStringLengthException
 * - A custom exception that is thrown when the user enters a string with a length outside the valid range(5 to 20 characters)
 */

/**
 * qsnt7
 */
public class qsnt7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter the spicific length between 5 and 20: ");
            String a = scanner.nextLine();
            if(a.length()>20 || a.length()<5){
                throw new InvalidStringLengthException("String length must be between 5 and 20 characters.");

            }
            System.out.println("you entred valid string:    "+a);
        }
        catch(InvalidStringLengthException e){
            System.out.println("Error: "+e.getMessage());
        }finally{
            scanner.close();
        }

    }
}
public class InvalidStringLengthException extends Exception {
    public InvalidStringLengthException(String message) {
        super(message);
    }
}
