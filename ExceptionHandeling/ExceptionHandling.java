public class ExceptionHandling {

    public static void main(String[] args) {
        System.out.println("Here it starts to run the program");

        // Note: catch and finally are optional, but either or both should be present after try

        int[] numA = new int[5];
        numA[0] = 1000;
        try {
            numA[100] = 1000;  // ArrayIndexOutOfBoundsException occurs here 
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array is not long enough");
        }

        // Any object can be assigned a value of null
        String data = null;
        try {
            if (data != null) {
                System.out.println(data.length());
            } else {
                System.out.println("Data is null");
            }
        } catch (NullPointerException ex) {
            System.out.println("Null Value");
            // TODO: handle exception
        }

        // Multi-layered exception
        try {
            int numMulti = 1000 / 0;  // ArithmeticException
            String d2 = null;  // NullPointerException
            System.err.println(d2.length());

        } catch (ArithmeticException ex) {
            System.err.println("Number Error");
        } catch (NullPointerException ex) {
            System.err.println("Null value encountered");
        } finally {
            System.err.println("Try End");
        }

        System.err.println("Program End");

        // Example of a block that catches all exceptions
        try {
            int num3 = 10 / 0;
            int[] numArr2 = new int[100];
            numArr2[10000] = 10;
        } catch (Exception ex) {
            System.out.println("I catch all exceptions");
        }

        throwExample();
        System.out.println("Program end");
    }

    static void throwExample() {
        throw new ArithmeticException("Where is the number?");
    }

    static void checkTry() throws Exception {
        System.out.println("When running this function, wrap around try-catch");
    }
}
