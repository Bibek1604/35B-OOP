public class JavaTypeCasting {
    public static void main(String[] args) {
        // Implicit Type Casting (Widening)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println("Implicit Type Casting:");
        System.out.println("int value: " + myInt);
        System.out.println("double value (after implicit casting): " + myDouble);

        // Explicit Type Casting (Narrowing)
        double myDoubleValue = 9.78;
        int myIntValue = (int) myDoubleValue; // Manual casting: double to int
        System.out.println("Explicit Type Casting:");
        System.out.println("double value: " + myDoubleValue);
        System.out.println("int value (after explicit casting): " + myIntValue);

        // Type Casting in expressions
        byte a = 40;
        byte b = 50;
        byte c = 100;
        int result = a * b / c; // byte is automatically cast to int in arithmetic operations
        System.out.println("Type Casting in Expressions:");
        System.out.println("Result of (a * b / c): " + result);

        // Type Casting with char
        char ch = 'A';
        int asciiValue = (int) ch; // Manual casting: char to int
        System.out.println("Type Casting with char:");
        System.out.println("char value: " + ch);
        System.out.println("ASCII value (after casting): " + asciiValue);
    }
}
