
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]=7;
        marks[1]=54;
        marks[1]=6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();
        
        System.out.println("Enter the number you want tot dicide the value with: ");
        int number = sc.nextInt();
        try {
            System.out.println("tha value at array index entered is: "+marks[ind]);
            System.out.println("the value of array-valu e/numbeer is : "+marks[ind]/number);
        } catch (ArithmeticException e) {
            System.out.println("ArithematicException occured!");
            System.out.println(e);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        } catch (Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }
    }
}