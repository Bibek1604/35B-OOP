
// Write a Java program that takes an integer input (1 to 12) representing a month and prints the 
// corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case.

import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        

        Scanner scanner =new Scanner(System.in);


        System.out.println("Enter a month: ");
        int month = scanner.nextInt();


        switch (month) {
            case 1: 
                System.out.println("IT is winter");
                break;
            case 2:
                System.out.println("It is winter");
                break;
            case 3:
                System.out.println("It is winter");
                break;
            case 4: 
                System.out.println("It is Spring");
                break;
            case 5: 
                System.out.println("It is Spring");
                break;
            case 6: 
                System.out.println("It is Spring"); 
                break;
            case 7: 
                System.out.println("It is Summer");
                break;
            case 8: 
                System.out.println("It is Summer");
                break;
            case 9: 
                System.out.println("It is Summer"); 
                break;
            case 10: 
                System.out.println("It is Fall");
                break;
            case 11: 
                System.out.println("It is Fall");
                break;
            case 12: 
                System.out.println("It is Fall");
                break;
        }
    }
}
