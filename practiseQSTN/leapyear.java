import java.util.Scanner;

public class leapyear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENter the number: ");
        int number =scanner.nextInt();

        if (number % 4 == 0 && number % 400 == 0 ){
            System.out.println("This is leap year" );

        }
        else{
            System.out.println("THis is not leap year");
        }

    }
}