public class operator {
    public static void main(String[] args) {
        /// arithmetic operator
        int a = 10, b = 6;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a * b = " + (a * b));

        // Assignment Operator
        int asNum1 = 20; /// used to assign value in variable
        asNum1 += 1; // same as asNum1 = asNum +1 ;
        System.out.println("+= value is " + asNum1);
        System.out.println("-= value is " + (asNum1 -= 10));
        System.out.println("*= value is " + (asNum1 *= 10));
        System.out.println("/= value is " + (asNum1 /= 10));
        System.out.println("%= value is " + (asNum1 %= 10));

        /// relational operator ///
        int rNum1 = 20, rNum2 = 21;
        System.out.println("equal to " + (rNum1 == rNum2));
        System.out.println("greater than " + (rNum1 > rNum2));
        System.out.println("less than " + (rNum1 < rNum2));
        System.out.println("not equals to " + (rNum1 != rNum2));
        System.out.println("greater than or equals to " + (rNum1 >= rNum2));

        /// logical operator
        int lNum1 = 20, lNum2 = 20;
        boolean lExpression1 = lNum1 == lNum2;
        boolean lExpression2 = lNum2 > lNum1;
        System.out.println("&& is used for AND " + (lExpression1 && lExpression2));
        System.out.println("|| is used for OR " + (lExpression1 || lExpression2));
        System.out.println("! is used for NOT " + (!lExpression1));

        /// unary operator
        int UNum1 = 10;
        UNum1++; // UNum1 = UNum1 + 1 //changes value in next line
        ++UNum1; // increment in the same line
        System.out.println("--UNum1 unary is " + --UNum1);
        System.out.println("UNum1-- unary is " + UNum1--);

        /*
         * take following if else as an example
         * if(tNum1 > tNum2){
         * output = "true statement";}
         * else {
         * output = "false statement"
         * }
         */
        int tNum1 = 5, tNum2 = 3;
        String output = tNum1 > tNum2 ? "true statement" : "false statement";

        int intOutput = tNum2 == tNum1 ? -10 : 10;
        System.out.println(output);
        System.out.println(intOutput);
    }
}
