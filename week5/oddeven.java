import java.util.Scanner;

public class oddeven {
    public static void oddeven(int first){
        if (first % 2 == 0) {
            System.out.println("This is even number");
        } else {
            System.out.println("This is odd number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first =scanner.nextInt();

        oddeven(first);
    }
}
