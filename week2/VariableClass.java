public class VariableClass {
    // Instance variable
    // Access with object
    // Is not shared with other objects
    int instanceVariable = 120;

    /// Static variable
    // Access with class
    // Is shared with objects
    static int staticVariable = 2000;

    public static void main(String[] args) {
        // Creating an object of VariableClass
        VariableClass variableObj = new VariableClass();

        // Accessing instance variable using object
        System.out.println("Instance Variable: " + variableObj.instanceVariable);

        // Accessing static variable using class name
        System.out.println("Static Variable: " + VariableClass.staticVariable);
    }
}
