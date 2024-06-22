/*
You are building a shape hierarchy for a drawing application. 
Design an abstract class named "Shape" with the following abstract methods:

calculateArea(): 
This method should calculate and return the area of the shape.

calculatePerimeter(): 
This method should calculate and return the perimeter of the shape.

Implement the abstract class and provide concrete implementations for
 the abstract methods. Create subclasses for different shapes such as "Circle,"
  "Rectangle," and "Triangle." 
  Each subclass should provide specific implementations for 
  calculating the area and perimeter of that shape. 
  Create instances of each shape class and demonstrate 
  how you can calculate their respective areas and perimeters.
*/ 


public class Abstractclasstask {
    public static void main(String[] args) {
        Cirlce c1 = new Cirlce();
        c1.calculateArea();
        c1.calculatePerimeter();

        traingle t1 = new traingle();
        t1.calculateArea();
        t1.calculatePerimeter();

        Rectangle r1 = new Rectangle();
        r1.calculateArea();
        r1.calculatePerimeter();
        
    }
    
}



abstract class Shape{
    abstract void calculateArea();
    abstract void  calculatePerimeter();

    
}

class Rectangle extends Shape{
    int length = 10;
    int breadth = 20;

    @Override
    void calculateArea(){
        int area = length*breadth;
        System.out.println("This is area"+area);
    }

    @Override
    void  calculatePerimeter(){
        int perimeter = 2 *(length * breadth);
        System.out.println("This is calculate periemter"+perimeter);
    }
}

class Cirlce extends Shape{

    int r=20;
    int pi=10;

    @Override
    void calculateArea(){
        int area =pi *r;
        System.out.println("This is area of circle is"+area);
    }

    @Override
    void  calculatePerimeter(){
        int perimeter = 2 * pi *r ;
        System.out.println("This is calculate periemter of cirlce"+perimeter);
    }
}

class traingle extends Shape{
    int height = 10;
    int breadth = 20;
    int length=30;

    @Override
    void calculateArea(){
        int area = breadth*height;
        System.out.println("This is area of permiteter       "+area);
    }

    @Override
    void  calculatePerimeter(){
        int perimeter = length + breadth + height;
        System.out.println("This is calculate periemter"+perimeter);
    }
}