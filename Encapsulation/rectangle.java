import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length: ");
        int length = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character left by nextInt()
        System.out.println("Enter the breadth: ");
        int breadth = scanner.nextInt();

        scanner.close();

        Area a = new Area();

        a.setLength(length);
        a.setBreadth(breadth);

        System.out.println("Length: " + a.getLength());
        System.out.println("Breadth: " + a.getBreadth());
    }
}

class Area {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int l) {
        length = l;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int b) {
        breadth = b;
    }
}
