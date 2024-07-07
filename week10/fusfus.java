public class fusfus {
    public static void main(String[] args){
        hondacity hc = new hondacity();
        hc.speed();
        hc.eats("foods");

        brezza bz = new brezza();
        bz.speed();
        bz.eats("foods");
        
    }

}
interface Car{
    public void speed();
    public boolean eats(String food);
}


class brezza implements Car{
    @Override
    public void speed(){
        System.out.println("It has 100 km spped");

    }
    @Override
    public boolean eats(String food){
        System.out.println("It eats water");
        return false;
    }
}

class hondacity implements Car{
    @Override
    public void speed(){
        System.out.println("It has 10 km speed");

    }
    @Override
    public boolean eats(String food){
        System.out.println("It eats water");
        return false;
    }
}
