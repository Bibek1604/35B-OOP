public class FunctionClass {
    void printSomething(){
        System.out.println("The function prints");
    }

    /* Method with return type int */
    int returnInt(){
        int value = 10;
        return value;
    }

    /* Placeholder method for adding two values */
    double addValue(int a, double b){
        double sum = a + b;
        return sum;
    }
    boolean isEqual (double num1, double num2){
        boolean equal = num1 ==num2;
        return equal; 
    }

    public static void main(String[] args) {

        /* To call a normal non-static function we need to create an object */
        FunctionClass fc = new FunctionClass();
        
        /* Call function from object variable of FunctionClass */
        fc.printSomething();
        /* Can call multiple times */
        fc.printSomething();

        /* Calling the returnInt method */
        int returnFromFunction = fc.returnInt();
        System.out.println("Return from function is " + returnFromFunction);

        /* Calling the addValue method */
        double returnFromAdd = fc.addValue(10, 20.2);
        System.out.println("Add returns " + returnFromAdd);
    }
}
