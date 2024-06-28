// 5. You are building a shape hierarchy for a drawing application. Design an abstract class named "Draw" with the following abstract methods:

// calculateVolume(): This method should calculate and return the area of the shape

// calculateArea(): This method should calculate and return the area of the shape.

// calculatePerimeter(): This method should calculate and return the perimeter of the shape.
// Implement the abstract class and provide concrete implementations for the abstract methods. 
// Create subclasses for different shapes such as "Cube," "Cuboid," and "Cylinder." 
// Each subclass should provide specific implementations for calculating the volume,
//  area and perimeter of that shape. Create instances of each shape class and demonstrate how you can 
//  calculate their respective volume, areas and perimeters.
public class task3 {

    public static void main(String[] args) {
        Cube c1= new Cube();
        c1.calculateArea();
        c1.calculatePerimeter();
        c1.calculateVolume();

        Cuboid c2 = new Cuboid();
        c2.calculateArea();;
        c2.calculatePerimeter();
        c2.calculateVolume();
        
    }
}
abstract class Draw {
    public abstract void calculateVolume();
    public abstract void calculateArea();
    public abstract void calculatePerimeter();

    
}
class Cube extends Draw{
    @Override
    public void calculateVolume(){
        int a=20;
        int b=30;
        int volume= 2*(a+b);
        System.out.println("The volume is "+volume);
    }
    @Override

    public void calculateArea(){
        int c=20;
        int d=40 ;
        int Area= c*d;
        System.out.println("the are of cube is " +Area);
    }
    @Override

    public void calculatePerimeter(){
        int e=40;
        int f=50;
        int Perimeter = 2*(e+f);
        System.out.println("the perimeter of perimeter is " + Perimeter);
    }
}

class Cuboid extends Cube{
    @Override
    public void calculateVolume(){
        int a=20;
        int b=30;
        int volume= 2*(a+b);
        System.out.println("The volume of CUboid is "+volume);
    }
    @Override

    public void calculateArea(){
        int c=20;
        int d=40 ;
        int Area= c*d;
        System.out.println("the area of  CUboid c is " +Area);
    }
    @Override

    public void calculatePerimeter(){
        int e=40;
        int f=50;
        int Perimeter = 2*(e+f);
        System.out.println("the are of CUboid  perimeter is " + Perimeter);
    }
}