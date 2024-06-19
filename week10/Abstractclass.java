public class Abstractclass {

    public static void main(String[] args) {
        
    }
}

//to make abstaract he keyword "abstract" jould be used before "class"
//if you make abstract claass, we cannanot make object of it

abstract class SmartPhone{
    //abstract class may or may not contain abstract functiojn

    //to make function use"abstract " before making function
    //abstract class donot have abody"
    abstract void sms();
    abstract public boolean call(String number);
    //abstract ca;;s can have normal function

    void imei(){
        System.out.println("Imei numbers here");
    }
}

class Samsung extends SmartPhone{
    //while extending abstration class we havr to  override
    // all the abstract finction of absteract class
    @Override
    void sms(){
        System.out.println("Samsubg way of sending sms");
    }
    @Override
    public boolean call(String number){
        System.out.println("Samsung callng to "+number);
        return  true;
    }
}

class Apple extends SmartPhone{
    @Override
    void sms(){
        System.out.println("Called byapp;");
    }
    @Override
    public boolean call(String number){
        System.out.println("Called by apple"+number);
        return false;
    }
}