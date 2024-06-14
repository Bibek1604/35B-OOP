import java.util.Scanner;

public class Prime {
    public static void prime(int number){
        if(number % number == 1 && number % 1 == number  ){
            System.out.println("It's prime  number");
        }else{
            System.out.println("It is not prime number");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        prime(number);
    }
    
}
