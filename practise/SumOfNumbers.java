

import java.util.Scanner;

public class SumOfNumbers {

    public static void additionOfNumber(int first, int second) {
        int addition = first + second;
        System.out.println("The sum is: " + addition);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        System.out.print("Enter the second number: ");
        int second = sc.nextInt();
        additionOfNumber(first, second);
        sc.close();
    }
}
