package whileloop;

public class dowhile {

    public static void main(String[] args) {
        int counter=0;
        while(counter <0){
            System.out.println("The ocndition is false, it wot run");
        }
        do { 
            System.out.println("this run first and other runs at second time");
        } while (counter <0 );
    }
    
}
