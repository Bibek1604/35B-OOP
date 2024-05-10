import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        System.out.println("Enter First number: ");
        int firstNumber = scanner.nextInt();  

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();  

        System.out.println("Enter third number: ");
        int thirdNumber = scanner.nextInt();  

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Maximum number is: " + firstNumber);
        }
        else if (secondNumber > thirdNumber) {
            System.out.println("Maximum number is: " + secondNumber);
        }
        else {
            System.out.println("Maximum number is: " + thirdNumber);
        } 
        scanner.close();
}
