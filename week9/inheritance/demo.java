import java.util.Scanner;

public class demo {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number a: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number");
        int b = scanner.nextInt();
scanner.close();

        Mycalculation demo = new Mycalculation();
        demo.addition(a, b);
        demo.subtraction(a, b);
        demo.multiplication(a, b);
        
        
    }
}

class calculation{
    int z;
    public void addition(int x , int y){
        z=x+y;
        System.out.println("The sume og fiven number: "+ z);
    }
    public void subtraction(int x , int y){
        z=x-y;
        System.out.println("the difference between the given number: "+z);
    }
}

class Mycalculation extends calculation{
    public void multiplication(int x, int y){
        z=x+y;
        System.out.println("the number is "+z);
    }

}