public class three {
    public static void main(String[] args) {
        int lng = 20;
        int brd = 70;
        int perimeter = calcperi(lng, brd);
        System.out.println("the peri is" + perimeter);
    }

    public staic int calcperi(int lng,int brd){
        return 2 *(lng + brd);        
    }

}
