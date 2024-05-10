import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String input = scanner.next();

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Invalid input. Please enter a single alphabet character.");
            return;
        }

        char ch = Character.toLowerCase(input.charAt(0)); 

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The letter is a vowel.");
        } else {
            System.out.println("The letter is a consonant.");
        }
    }
}
