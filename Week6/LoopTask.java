public class LoopTask {
    public static void main(String[] args) {
        String [] arr = new String[4];
        arr[0]= "john";
        arr[1] = "Doe";
        arr[2] = "foo";
        arr[3] = "bar";

        int arrayLength = arr.length;
        int i = 0;
        while (i < arrayLength) {
            if (arr[i].equals("foo")) {
                System.out.println(arr[i]);
            }
            i++;
        }

    }
    
}
