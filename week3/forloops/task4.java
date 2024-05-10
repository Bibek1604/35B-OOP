// 4. Write a JAVA program to check whether a number is even or odd.

import java.util.Scanner;



public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int number = scanner.nextInt(); 

        if (number%2 ==0){
            System.out.println("Your number is  even");
        }
        else{
            System.out.println("your number is odd");
        }
    }
    
}
