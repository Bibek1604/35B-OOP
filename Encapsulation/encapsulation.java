import java.util.Scanner;

public class encapsulation {

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter name: ");
     String name = sc.nextLine();
     System.out.println("Enter age: ");
     int age = sc.nextInt();
sc.close();
    

        Human h1 = new Human();
        h1.setName(name);
        h1.setAge(age);

        System.out.println(h1.getname());
        System.out.println(h1.getAge());
        
  
    }
}


class Human
{
    private int age;
    private String name ;


    public int getAge()
    {
        return this.age;
    }
    public void setAge(int a){
        this.age = a;
    }
    public String getname(){
        return this.name;
    }
    public void setName(String n){
        this.name = n;
    }

    
}