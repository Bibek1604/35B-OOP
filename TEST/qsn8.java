
import java.util.Scanner;

/*
 * Design and implement a simple Java application that prompts the user to enter valid email address.
 * Your application should throw and handle a custom exception if the user enters an invalid email address.
 * - InvalidEmailException:
 * - A custom exception that is thrown when the user enters an email address that does not match a valid email pattern
 * (e.g., it should contain '@' and '.' characters).
 */


public class qsn8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter your email address: ");
            String b=scanner.nextLine();
            String c= "@gmail.com";
            if(!(b.contains(c))){
                throw new InvalidEmailException("invalid email address");
            }
            else{
                System.out.println("your address is "+b);

            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            scanner.close();
        }
        

    }
}

class InvalidEmailException extends Exception{
    public InvalidEmailException(String message){
        super(message);
    }
}