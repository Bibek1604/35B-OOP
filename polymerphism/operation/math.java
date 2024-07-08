
public class math {
    public static void main(String[] args) {
        sub math = new sub();

        int a1 = math.add(10, 20);
        int a2 = math.less(30, 40);

        System.out.print("first number is :"+ a1);
        System.out.println("second number is :" +a2);
        
    }
    
}
class sub{
    int add(int a , int b){
        return a+b;
    }

    int less(int c , int d){

        return d-c;

    }
}