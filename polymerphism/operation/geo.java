// double calculateArea(double radius) - This method should calculate and return the area of a circle with the given radius.

// b) double calculateArea(double length, double width) - This method should calculate and return the area of a rectangle with the given length and width.

// c) double calculateArea(double base, double height, boolean type) - This method should calculate and return the area of a triangle with the given base and height.



public class geo {
    public static void main(String[] args) {
        area areaCalculator = new area();
        double circleArea = areaCalculator.calculateArea(5.0);
        double rectangleArea = areaCalculator.calculateArea(4.0, 6.0);
        double triangleArea = areaCalculator.calculateArea(3.0, 5.0, true);

        System.out.println("Circle Area: " + circleArea);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Triangle Area: " + triangleArea);

        
        
    }
    
}
class area{
    double calculateArea(double radius){
        return radius;
    }
    double rectangle(double length , double width){
        return length * width;
    }
    double traingle (double base , double height , boolean type ){
        if (type){
            return 0.5*base*height;
        }else{
            return base*height;
        }
    }
}
