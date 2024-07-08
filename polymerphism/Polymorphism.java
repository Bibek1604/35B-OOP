public class Polymorphism {
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();
        
        System.out.println(mo.add(10, 20));          // Calls add(int, int)
        System.out.println(mo.add(10, 10, 10));      // Calls add(int, int, int)
        System.out.println(mo.add(9.5, 19.5));      // Calls add(double, double)
        mo.add();                                   // Calls add() with no parameters


        //methiod overriding
        Document d1 = new Document();
        d1.print("Black");
        //polymerphism allow child object to be stored in parent class varibale


        Document d2 = new Msword();
        d2.print("Black");

        Document d3 = new office69();
        d3.print("red");

    }
}

class MathOperation {
    // Method to add two integers
    int add(int num1, int num2) {
        return num1 + num2;
    }

    // Overloaded method to add three integers
    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Overloaded method to add two doubles
    double add(double num1, double num2) {
        return num1 + num2;
    }
    // method overlaoding expect the unique datatuype of parameter\
    //cannot oeroad ,ethod just by changing varibale
    // eg int add(1int a int b) => cannot do this as add with 2 int already made.
    //cannot ocerload by just changing return tupe

    // Method with no parameters
    void add() {
        System.out.println("Invalid operation");
    }
}



//method overriding - run time polymerphism
//making the functiin of parent calss in chaild class
class Document{
    public  void print(String paper) {
        System.out.println("Document Printing");
    }
}

//methiod overrding is possible in child claass

class Msword extends Document{
    boolean online=false;
    @Override
        public void print(String paper){
        System.out.println("Ms word is printing");
    }
}
class office69 extends Msword {
    boolean online = true;
    @Override
    public void print (String paper){
        System.out.println("Online is priniting");
    }

}