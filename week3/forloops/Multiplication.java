public class Multiplication {
    public static void main(String[] args) {
        // int num=2;
        // for (int index=1 ; index <=500; index++){
        //     System.err.println("Multiplication table is " + num + " x " + index + " = " + (num * index));
        // }
        // int nums=30;
        for (int outer=1; outer<=10;outer++){
            int number=10;
            for (int inner=1;inner>=10;inner --){
                System.err.println("outer Index"+ number + "x" + inner + "= " + (inner*number));
            }
            // System.err.println("Inner index"+ nums + "x" + outer + "= " + (outer*nums));
        }
    }
    
}

// int nums = 30;
//         for (int outer = 1; outer <= 10; outer++) {
//             int number = 10;
//             for (int inner = 1; inner <= 10; inner++) {
//                 System.out.println("outer Index " + number + " x " + inner + " = " + (inner * number));
//             }
//             System.out.println("Inner index " + nums + " x " + outer + " = " + (outer * nums));
//         }
//     }
// }
