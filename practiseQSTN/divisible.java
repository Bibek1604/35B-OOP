
import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");   
        int  a1 = scanner.nextInt();

        if (a1 % 5 ==0 && a1 %11 ==0){
            System.out.println("This number can be divided by 5 and 11 ");
        }
        else{
            System.err.println("It cannot be divisible by 5 and 11");
        }


    }
}
