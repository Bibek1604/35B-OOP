public class work1 {
    public static void main(String[] args) {
        System.out.println("Here program Start");
        int num1 = 10 ; 

        try { 
            int num2 = 10 /0; //arithmeatic error exist here
        }
        catch(ArithmeticException ex){
            //here ex will have the system generated msg
            System.err.println("Cannot divided by 0");
        }finally{
            System.err.println("finally runs wheather excepiton occurs or not ");
        }
        //Note catch ad idnally are optional,but ,either or both should be presesnted after try
        System.out.println("Here program Ends");
    }

    
}