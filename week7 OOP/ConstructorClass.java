public class ConstructorClass {
    public static void main(String[] args) {
        ConstructorExample ce = new ConstructorExample();
        System.out.println("after object");
    }
    
}
class ConstructorExample{
    ConstructorExample(){
        System.out.println("I run in object creation");
    }
}