public class Prefixpostfix {
    public static void main(String[] args) {
        int prefixValue=10;
        System.out.println("prefix will update here" + ++prefixValue);
        System.out.println("prefix will remain the same" + prefixValue);

        

        int postFixvalue = 20;
        System.out.println("prefix will not update here" + postFixvalue++);
        System.out.println("prefix will not update here" + postFixvalue);
        
        
    }
}