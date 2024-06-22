public class interface {
    public static void main(String[] args){

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

class hondacity implements car{
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
