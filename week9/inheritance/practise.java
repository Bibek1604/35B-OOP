// In the above example Animal and Dog both classes have eat() method if we call eat() method from Dog class,
//  it will call the eat() method of Dog class by default because priority is given to local.

// To call the parent class method, we need to use super keyword.


public class practise {
    public static void main(String[] args) {

        Dog dg = new Dog();
        dg.eat();
        dg.work();
        dg.bark();
        
        
    }
}
class Animal{
    void eat(){
        System.out.println("Yes animal eats plants");
    }

}
class Dog extends Animal{
    void eat(){
        System.out.println("DOe eats bone");

    }
    void bark(){
        System.out.println("Dog Do BowBow");

    }

    void work(){

        super.eat();///invoke parent class
        bark();

    }
    
}   