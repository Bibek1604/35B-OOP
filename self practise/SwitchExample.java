public class SwitchExample {
    public static void main(String[] args) {
        int value = 3; // Initialize the value variable
        
        switch (value) {
            case 1:
                System.out.println("Switch: Value is one.");
                break;
            case 2:
                System.out.println("Switch: Value is two.");
                break;
            case 3:
                System.out.println("Switch: Value is three.");
                break;
            case 4:
                System.out.println("Switch: Value is four.");
                break;
            case 5:
                System.out.println("Switch: Value is five.");
                break;
            default:
                System.out.println("Switch: Value is something else.");
                break;
        }
    }
}
