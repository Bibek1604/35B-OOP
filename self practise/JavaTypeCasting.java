public class JavaTypeCasting {
    public static void main(String[] args) {
        int myInt =9 ;
        double myDouble =myInt;

        System.out.println(myInt);
        System.out.println(myDouble);


        double myName = 823da;
        int myId = (int) myDouble; // Manual casting: double to int
    
        System.out.println(myName);   // Outputs 9.78
        System.out.println(myId);  
    }
    
}
