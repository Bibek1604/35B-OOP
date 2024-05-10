///2. Write a JAVA program to check whether a number is negative, positive, or zero.

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int number = scanner.nextInt(); 

        if(number > 0){
            System.out.println("Your number is positive");
        }

        else if (number < 0){
            System.out.println("Yout number is negative");
        }
        else{
            System.out.println("your number is zero");
        }
        

        scanner.close();
        
    }
    
}
