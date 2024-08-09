public class two {

    public static void main(String[] args) {
        int length = 20;
        int breadth = 30;
        int perimeter = calculatePerimeter(length, breadth);
        System.out.println("perimeter is " + perimeter);

    }

    public static int calculatePerimeter(int length, int breadth) {
        return 2 * (length + breadth);
    }
}
