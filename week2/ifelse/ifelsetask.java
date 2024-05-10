

public class ifelsetask {
    public static void main(String[] args) {
        int sceince=35 ;
        int english=55;
        int mmath=50;

        int avg = sceince+english +mmath;
        float total = avg /3 * 100 ;
        

        if(sceince <35 ||  english <35 || mmath <35) {
            System.out.println(" fail");
        }
        else if (total > 60 ){
            System.out.println("print third div");
        }else if (total > 70 ){
            System.out.println("print second div");
        }else if (total > 80 ){
            System.out.println("printfirst div");
        }else if (total > 90 ){
            System.out.println("print Disctinction");
        }
        else {
            System.out.println("A grade");
        }
    }
    
}