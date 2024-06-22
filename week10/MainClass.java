public class MainClass {
    public static void main(String[] args){
        

    }
}

interface AnimalDo {
    public void move();
    public boolean eat(String food);
}
interface mammaDog extends AnimalDo{
    public int legs();
}
//can be extended into  miltople layer
interface dogdo extends mammaDog{
    public void bark();
}
interface DomasticANimalDO{
    public void pet();
}

class Husky implements dogdo, DomasticANimalDO{

//wehen implemeting inreface that extends another interface
//muse overrie  all the function made on the tiop ofit

    @Override
    public void pet(){
        System.out.println("Hsuky likes pets dogs");
    }
    @Override
    public void bark(){
        System.out.println("Bow Wow");
    }
    @Override
    public int legs(){
        return 4;
    }
    @Override
    public void move(){
        System.out.println("Husky moves fasst");
    }
    @Override
    public boolean eat(String food){
        System.out.println("Husky eat fish");
        return false;
    }
}




class Wolf implements AnimalDo {
    @Override
    public void move(){
        System.out.println("Wolf moves fast");
    }

    @Override
    public boolean eat(String food) {
        System.out.println("Wolf eats " + food);
        return true;
    }
}

class Cow implements AnimalDo {
    @Override
    public void move(){
        System.out.println("Cow moves slow");
    }

    @Override
    public boolean eat(String food){
        System.out.println("Cow eats " + food);
        return true;
    }
}
