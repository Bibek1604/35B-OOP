public class day {
    public static void main(String[] args) {
        int value=6;
        switch (value) {
            case 1:
            System.out.println("sunday");
            break;
                
            case 2:
            System.out.println("monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;

            default:
                throw new AssertionError();
        }
    }
    
}
