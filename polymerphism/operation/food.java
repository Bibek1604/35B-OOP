public class food {

    public static void main(String[] args) {

        foods fs = new foods();
        fs.eats();

        ieat is = new ieat();
        is.eats();
        
    }
}


class foods{
    public void eats(){
        System.out.println("i eatas eeat");
    }
}

class ieat extends foods{
    @Override
    public void eats(){
        System.out.println("I doesnot eats eat ");
    }
}