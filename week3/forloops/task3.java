// 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int number = scanner.nextInt(); 

        if( number % 5 == 0 && number % 11 == 0){

            System.out.println("is divisible by 5 AND 11");
        }
        else{
            System.out.println("it is not diviisble");
        }
        scanner.close();


        
    }
    
}
