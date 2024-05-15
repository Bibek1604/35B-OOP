public class ArrayLoop {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = -10;
        arr[1] = 0;
        arr[2] = 10;
        arr[3] = 20;

        int arrayLength = arr.length;
        
        // Ascending Loop
        for (int index = 0; index < arrayLength; index++) {
            System.out.println(arr[index]);
        }
        
        System.out.println("Descending Loop");
        
        // Descending Loop
        for (int index = arrayLength - 1; index >= 0; index--) {
            System.out.println(arr[index]);
        }
    }
}
