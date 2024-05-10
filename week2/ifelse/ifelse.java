public class IfElse {
    public static void main(String[] args) {
        if (true) {
            System.out.println("true statement");
        }

        int num1 = 10, num2 = 20;
        if (num1 == num2) {
            System.out.println("equal statement");
        } else {
            System.out.println("false statement");
        }
        if (num1 > num2) {
            System.out.println("greater");
        } else if (num1 != num2) {
            System.out.println("not equal");
        } else if (num1 == num2) {
            System.out.println("equal");
        } else {
            System.out.println("default statement");
        }

        // Nested if-else
        if (num1 < 0) {
            if (num1 > num2) {
                System.out.println("negative and greater");
            } else {
                System.out.println("negative and lesser");
            }
        } else {
            if (num1 > num2) {
                System.out.println("positive and greater");
            } else {
                System.out.println("positive and lesser");
            }
        }
    }
}


/* calculate the total avg of annn varibale 
 * if any of the marming i ess than 35 ,print fail
 * id avg is less than 40 pront second dev
 * 
 * if avg is less thna 60 ,print third div
 * f avg is less than 7 0peint seconf dev
 * if avg is less than 8- print first div
 * if avf is equal or greater than 80 print distintion
 * if avg is less tha n 0 or more than 100 print invalid
 * 
 * int sceince =35 english 55 ,math =89
*/

