import java.util.Scanner;

public class qtn4 {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int a = scanner.nextInt();

            if(a%2 == 0 ){
                System.out.println("your number is even");
            }else{
                System.out.println("your numberis odd");
            }
        }catch(Exception e){
            System.out.println("Error Here");

        }finally{
            System.out.println("Finally is not runnable");
        }
    }
    
}
