// 2. Create an abstract class called Shape with an abstract method called calculateArea(). 
// Implement two subclasses called Rectangle and Circle that inherit from Shape. Override the calculateArea() 
// method in both subclasses to calculate and return the area of a rectangle and a circle, 
// respectively. Write the Java code to implement this scenario with Scanner Input.

public class task2 {

    public static void main(String[] args) {
        rectangle r1= new rectangle();
        r1.calculateArea();

        circle c1 = new circle();
        c1.calculateArea();

        traingle t1 = new traingle();
        t1.calculateArea();
        
    }
}
abstract class shape{
    abstract void calculateArea();
}
class rectangle extends shape{
    int length = 10;
    int breadth = 20;

    @Override
    void calculateArea(){
        int area = length * breadth ; 
        System.out.println("Area is " +area);
    }
}
 
class circle extends shape {
    int length = 2;
    int breadth =3 ;
    int height = 2;

    @Override
    void calculateArea(){
        int area = length * breadth *height; 
        System.out.println("Area is " +area);
    }


    
}
class traingle extends shape {
    int abs=10;
    int bcs=20;
    
    @Override

    void calculateArea(){
        int perimeter = abs*bcs;
        System.out.println("This calculate area of traingle" +perimeter);
    }

}