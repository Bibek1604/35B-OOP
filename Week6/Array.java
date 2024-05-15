/* array alwasy intialiaze with 0 

declearing an arrya

int [] myArray ;
myArray = new int[5];


int [] myArray = new int[6];

*/   



public class Array {
    public static void main(String[] args) {
         
        /* Array Decleration*/
        int [] myFirstArray = new int[5];
        /*Memory Allocation */
        int [] mySecondArray = new int[3];
        /*Array Decleration and memory allocation */
        int[] myThirdArray = {10,20,30,40};

        //Array index -> Position of element /values
        //starts with zero
        mySecondArray[0] = 10;
        mySecondArray[1]=20;
        mySecondArray[2]=100;

        /* Access/store in new  variable */
        int arrayElement = mySecondArray[0];
        System.out.println("first index" + arrayElement);
        System.out.println("second Index" +mySecondArray[1]);

    }
}