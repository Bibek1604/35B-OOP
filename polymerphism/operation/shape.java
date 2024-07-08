// You are developing a shape drawing application. There are different types of shapes such as circles, rectangles, and triangles. 
// Each shape has its own area calculation method. 
// Implement a Java program using polymorphism to calculate and display the area of different shapes.


public class shape{
    public static void main(String[] args) {

        circle cs= new circle();
        cs.area();

        rectangle rc = new rectangle();
        rc.area();

        triangles tc = new triangles();
        tc.area();        
    }
}

class circle{
    public void  area(){
        int a =10 ;
        int b = 20;
        int area = a*b;

        System.out.println("area is "+area);
    }
}

class rectangle extends circle{
    public void area(){
        int c=10;
        int d = 60;
        int e = c*d;
        System.out.println("reacangle is "+e);
    }
}
class triangles extends circle{
    public void area(){
        int f=10;

        int h= 40;
        int n = f*h;

        System.out.println("traingle is "+n);
    }
}