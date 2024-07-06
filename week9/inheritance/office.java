
import java.lang.classfile.Superclass;


// Write a Java program to create a class called Employee with methods called work() and getSalary(). 
// Create a subclass called HRManager that overrides the work() method.


public class office {
    public static void main(String[] args) {

        HRManager hr = new HRManager();
        hr.work();
        hr.getSalary();
        hr.works();
        
    }
}

class Employee{
    void work(){
        System.out.println("It will show employee wokr");
    }
    void getSalary(){
        System.out.println("here employee wth get salary");
    }
}
class HRManager extends  Employee{
    @Override
    void work(){
        System.out.println("this is override wokr");
    }
    void works(){
        System.out.println("Here it works with 2 function ");
    }

}