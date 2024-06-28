// 1. Create an abstract class called Animal with an abstract method called sound().
//  Implement two subclasses called Dog and Cat that inherit from Animal. Override the sound() method in 
// both subclasses to display the specific sound made by each animal. Write the Java code to implement this scenario.
public class task1 {
    public static void main(String[] args) {
        dog d1= new dog();
        d1.sound();

        cat c1= new cat();
        c1.sound();

        
    }
    
}

abstract class Animal{
    abstract void sound();
}

class dog extends  Animal {
    @Override
    void sound(){
        System.out.println("Dog Do bhow bhow");
    }

}
class cat extends dog {
    @Override
    void sound(){
        System.out.println("cat do meow meow");
    }
}