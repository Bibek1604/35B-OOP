
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lenght: ");
        int length = scanner.nextInt();

        System.out.println("Enter the breadth: ");
        int breadth= scanner.nextInt();

        result rs = new result();
        rs.setlength(length);
        rs.setbreadth(breadth);


        System.out.println(rs.getlength());
        System.out.println(rs.getbreadth());

        
    }
    
}


class result {
    private int length;
    private int breadth;

    public int getlength(){
        return length;
    }
    public void setlength(int l){
         length = l;
    }
    public int getbreadth(){
        return  breadth;
    }
    public void setbreadth(int b){
        breadth = b;
    }

}