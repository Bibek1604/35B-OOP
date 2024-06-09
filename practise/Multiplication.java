import java.util.Scanner;

public class Multiplication {

    public static void Multiply(int a , int b){
    int Multiples = a*b;
    System.out.println(Multiples);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number :");
        int a =  sc.nextInt();
        System.out.println("Enter the Second number :");
        int b = sc.nextInt();
        Multiply(a, b);
        sc.close() ; 
        
    }
}
