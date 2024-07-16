
import java.util.Scanner;

public class qtn5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = scanner.nextInt();

        try{
            int number =121/a;
            System.out.println(number);
        }catch(ArithmeticException e){
            System.out.println("number should not be divided by 0");
        }finally{
            System.out.println("Finally blocks run");
        }
    }
}