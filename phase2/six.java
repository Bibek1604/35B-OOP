// Use a while loop for the following,
// int index = 1;
// Loop from 1 - 20
// Increament the loop 2
// If the value of index is 5, 7, 9 skip the iteration
// If the value of index is 17 exit the loop
// Print the index
// Output:
// 1
// 3
// 11
// 13
// 15

public class six {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            if (i == 5 || i == 7 || i == 9) {
                i = i + 2;
                continue;
            }
            System.out.println(i);

            if (i == 17) {
                break;
            }
            i = i + 2;
        }

    }
}
