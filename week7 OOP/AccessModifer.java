public class AccessModifer {
    public static void main(String[] args) {
        AccessExample ae = new AccessExample();
        ae.name = "ram";
        ae.age=12;
        // ae.salary=1000.21;
        ae.defaultfunction();
        ae.publicFunction();
        // ae.privateFunction();  /*error beacuse it can be interact on;y inprivate palces */        
        ae.accessPrivate();
        ae.setSalary(1000.22);
        System.out.println(ae.getSalary());


    }
    
}

/* to expose priavte property we can use setter and getter */

/* prive ma bahira bata value kasari halne is the case hai ta */
class AccessExample {
    String name;
    public int age;
    private double salary;
    void setSalary(double s){
        salary = s;

    }
    double getSalary (){
        return salary;
    }

    void defaultfunction(){
        System.out.println("I can be accessd inside a package");
    }
    public void publicFunction(){
        System.out.println("I can be accessed from any where");
    }
    private void privateFunction(){
        System.out.println("I can be only accessed inside the class");
    }
    void accessPrivate(){
        System.out.println(salary);
        privateFunction();
    }
}
