
import java.util.Scanner;

public class status {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number :");
        int number = scanner.nextInt();
        
        
        if(number>0){
            System.out.println("IT is positive");
        }else if (number < 0) {
            System.out.println("IT is Negative");

        }else {
            System.out.println("It is zero");
        }
    }
    
}
