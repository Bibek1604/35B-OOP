public class JumpStatement {
    public static void main(String[] args) {
        for (int index = 0; index < 3; index++) {
            if (index == 1) {
                break;
            }
            System.out.println("index" + index);
        }

        int counter = 0;
        while (counter < 3) {
            if (counter == 1) {
                break;
            }
            System.out.println("while counter" + counter);
            counter++;
        }

        for (int index = 0; index < 5; index++) {
            if (index == 2) {
                continue;
            }
            System.out.println("Continue Index" + index);
        }
        for (int outer=0;outer<2;outer++){
            for (int inner =0; inner <=5 ;inner++){
                if(inner ==2 ){
                    break;
                }
                System.err.println("Inner INdex" + inner);
            }
            System.err.println("Outer index" + outer);
        }
        System.out.println("Labeled Break");
        outerLoop :for (int outer = 0; outer < 10; outer++) {
            innerLoop:for (int inner = 0; inner < 10; inner++) {
                if (inner == 2){
                    break outerLoop;
                }
                System.err.println("inner index"+inner);
                
            }
            System.err.println("outer index"+outer);
            
        }
    }
}
