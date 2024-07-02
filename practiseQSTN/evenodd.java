
import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter  the number: ");
        int number = scanner.nextInt();

        if (number %2 ==0 ){
            System.out.println("it is even");
        }else if(number%2 !=0){
            System.err.println("It is odd");
        }else{
            System.err.println("THis is nothing");
        }

        

    }
    
}
