public class ach {
    public static void main(String[] args) {

        language lg = new language();
        lg.displayinfo();

        java jv = new java();
        jv.displayinfo();
        
    }
}

class language {
    public void displayinfo(){
        System.out.println("It will show language");
    }

}
class java extends  language{
    @Override
    
    public void displayinfo(){
        System.out.println("Here it will show java  ");
    }
}