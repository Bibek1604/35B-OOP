public class first {

    public static void main(String[] args) {
        Base b = new Base();
        b.set(4);

        System.out.println(b.get());


        Delivered D = new Delivered();
        D.set(19);
        System.out.println(D.get());
        
    }
}

class Base{

    int x;

    public int get(){
        return x;
    }
    public void set(int x){
        this.x=x;
    }
    public void printMe(){
        System.out.println("i am a constructor");
    }


}

class Delivered extends Base{
    int y;
    @Override
    public int get(){
        return y;
    }
    @Override
    public void set(int y){
        this.y = y;
    }
    public void Printus(){
        System.out.println("I am not a construcotr");
    }
}