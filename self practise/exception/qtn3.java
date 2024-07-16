public class qtn3 {
    
    public static void main(String[] args) {
        try{
            int data =100/0;
        }catch(ArithmeticException e){
            System.out.println("enter correct number");
        }finally{
            System.out.println("Enter the number");
        }
    }
}