
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");
        String a =sc.nextLine();   

        if(a='a'|| a='e'|| a='i'|| a='o'|| a='u'){
            System.out.println("character is vowel");
        }
        else{
            System.out.println("consonenet");
        }
    }

}
