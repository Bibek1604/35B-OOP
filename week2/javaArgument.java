/**
 * javaArgument
 */
public class javaArgument {

    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("not enough argument");
            return;
        }
        System.out.println("the first args is"+args[0]);
        System.out.println("the first args is"+args[1]);

        int normalValue =10;
        int parseInt= Integer.parseInt(args[1]);
        int sum = normalValue + parseInt;
        System.out.println(sum);
    }
}