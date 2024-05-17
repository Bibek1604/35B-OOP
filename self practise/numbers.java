
// Type casting is when you assign a value of one primitive data type to another type.

// In Java, there are two types of casting:

// Widening Casting (automatically) - converting a smaller type to a larger type size
// byte -> short -> char -> int -> long -> float -> double

// Narrowing Casting (manually) - converting a larger type to a smaller size type
// double -> float -> long -> int -> char -> short -> byte



public class numbers {
    public static void main(String[] args) {

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