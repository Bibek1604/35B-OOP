import java.util.Scanner;

public class SimpleInterest {
    public static void si(int principal, int time,int rate){
        int simple=principal*time*rate/100;
        System.out.println("Your  si is"+simple);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principal: ");
        int principal = scanner.nextInt();
        System.out.println("Enter Time: ");
        int time = scanner.nextInt();
        System.out.println("Enter Rate: ");
        int rate = scanner.nextInt();


        si(principal,time,rate);
    }
}