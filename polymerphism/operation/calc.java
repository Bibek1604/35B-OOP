
// . You are designing a calculator application. Create a class called "Calculator" with the following overloaded methods:

// a) int add(int a, int b) - This method should add two integers and return the result.

// b) double add(double a, double b) - This method should add two doubles and return the result.

// c) int add(int a, int b, int c) - This method should add three integers and return the result.
public class calc {
    public static void main(String[] args) {
        calculator cl = new calculator();
        cl.add(10, 20);
        cl.add(20, 30);
        cl.add(10, 20, 30);
        
        System.out.println( cl.add(10, 20));
        System.out.println(cl.add(20, 30));
        System.out.println(cl.add(10, 20, 30));
    }
    
}
class calculator{
    public int add(int a, int b){
        return a+b;
    }

    public double add(double a , double b){
        return a+b;
    }

    public int add(int a ,int b , int c){
        return a+b+c;
    }

}
