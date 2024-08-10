public class four {
    public static void main(String[] args) {
        int length = 80;
        int breadth = 20;
        int result = calc(length, breadth);
        System.out.println("The result is " + result);
    }

    public static int calc(int length, int breadth) {
        return 2 * (length + breadth);
    }

}
