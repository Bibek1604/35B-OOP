import java.util.Scanner;

public class Table {
    public static void mult(int number) {
        for (int i = 1;i<=10;i++) {
            System.out.println(number + 'X' + i + "=" +(number*i));
        }
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        mult(number);
    }
    
}



