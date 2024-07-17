
import java.util.Scanner;

/*
 * Design and implement a simple Java program that prompts the user to enter a string
 * within a specified length, for example between 5 and 20 characters. Your application
 * should throw and handle a custom exception if the user enters a string outside this length.
 * 
 * - InvalidStringLengthException
 * - A custom exception that is thrown when the user enters a string with a length outside the valid range(5 to 20 characters)
 */


public class qsn7 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the string between 5 to 20: ");
            String a = scanner.nextLine();


            if(a.length()<5||a.length()>20){
                throw new InvalidStringLengthException("Enter digit between 5 to 20");
            }
            else{
                System.out.println("your answer is"+a);
            }
        }
        catch(Exception e){
            System.out.println("Eror here");
        }
    }
    
}

class InvalidStringLengthException extends Exception{
    public InvalidStringLengthException(String message){
        super(message);
    }
}
