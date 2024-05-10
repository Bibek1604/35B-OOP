//keep asking numebr until ser inser the negative number

import java.util.Scanner;

public class negative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input

        do{
            System.out.println("Enter neagtive: ");
            input = scanner.nextInt();
        }

        while (input < 0);
            System.out.println("enter number again"+input);
        
        System.out.println("Enter number again: ");
        
    }
}