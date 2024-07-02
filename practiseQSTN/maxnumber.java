// 1. Write a JAVA program to find the maximum between three numbers.
import java.util.Scanner;

public class maxnumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        
        int number1 =scanner.nextInt();

        System.out.println("Enter the second number : ");
        int number2 = scanner .nextInt();

        System.out.println("Enter the third Number: ");
        int number3 = scanner.nextInt();

        if(number1>number2 && number1>number3){
            System.out.println("number 1 is greater");
        }else if (number2>number3 && number2 >number1) {
            System.out.println("Number 2 is greater ");
        }else{
            System.out.println("Number  3 is greater ");

        }
    }
}