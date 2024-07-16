import java.util.Scanner;

public class qtn2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter a index:");
        int a = scanner.nextInt();
            
            try {
                int[] mynumber ={1,2,3};
                System.out.println(mynumber[a]);
                
            } catch (Exception e) {
                System.out.println("You have entered wroong number");
            }
        }
    }
