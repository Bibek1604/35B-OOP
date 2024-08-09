// Write a function that takes length and breadth and calculates and returns the
// perimeter of a rectangle
public class one {

    public static void main(String[] args) {

        int length = 20;
        int breadth = 20;

        int perimeter = calculatePerimeter(length, breadth);
        System.out.println("The perimeter is: " + perimeter);
    }

    public static int calculatePerimeter(int length, int breadth) {
        return 2 * (length + breadth);
    }
}
d