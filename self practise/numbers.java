import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object


        int firstNumber = 10;
        System.err.println(firstNumber);

        String secondName = "biebek pandey"; // Use double quotes for strings
        System.err.println(secondName);

        char thirdName = 't'; /// use sing quotes only and use only one letter 
        System.err.println(thirdName);

        boolean myName = false;
        System.err.println(myName);

        boolean isStudy = true;
        boolean notStudy = false;


        if (isStudy){
            System.err.println("Bibek is studying");
        }else{
            System.err.println("bibek is ssss studying");
        }
        
        if (notStudy){
            System.err.println("biek is not studying");
        }else{
            System.err.println("bibek is not studyng");
        }


        String myText = "Hello";     // String
        System.out.println(myText);

    }
}