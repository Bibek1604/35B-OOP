// 1. Write a Java program to create a class called Vehicle with a method called drive().
//  Create a subclass called Car with method display() method to print details of the Car.



public class car {
    public static void main(String[] args) {
        
        Subvechicle sv = new Subvechicle();
        sv.compnay();
        sv.details();
        sv.drive();
        sv.model();
        sv.name();
    }
    
}
class Vehicle{
    void drive(){
        System.out.println("Yeah i can drive car");
    }
}

class Subvechicle extends Vehicle{
    void details(){
        System.out.println("here it will be seen details");
    }
    void name(){/////
        System.out.println("Breeza");
    }
    void model(){
        System.out.println("2021");
    }
    void compnay(){
        super.drive();
        System.out.println("Suzuki");
   }
} 