//////
///5. Write a JAVA program to check whether a year is a leap year or not. 

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int number = scanner.nextInt(); 


        if (number % 4==0 && number <365){
            System.out.println("This is called leap year");
        }
        else{
            System.out.println("This is not leap year");
        }
        scanner.close();
    }
    
}