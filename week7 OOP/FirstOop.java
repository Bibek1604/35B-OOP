public class FirstOop{
    public static void main(String[] args){
        Person p1= new Person();
        person2 p2 = new person2();
        p2.name = "biebk pandye";
        System.out.println(p2.name);

        p2.age =291;
        System.out.println(p1.age);

        p2.gender='M';
        System.out.println(p1.gender);

        p1.name="ram";
        System.out.println(p1.name);
        p2.introduction();

        p1.age=12;
        p1.gender='M';
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.gender);
        p1.introduction();



        Square sq= new Square();
        sq.sides = 10 ;
        int sqArea = sq.area();
        System.out.println(sqArea);
        sq.addSides(2);
        System.out.println(sq.area());


        Rectangle rc = new Rectangle();
        rc.length = 10;
        rc.breadth = 20;

        int rcArea = rc.area();
        System.out.println("Area: " + rcArea);

        int rcPerimeter = rc.perimeter();
        System.out.println("Perimeter: " + rcPerimeter);
        
    }
}

class Person{
    String name;
    int age;
    char gender;

    void introduction(){
        System.out.println("hi my name is name" + name);
    }
}
class person2{
    String name;
    int age;
    char gender;
    void introduction(){
        System.out.println( "here is what i want the result" + age
        );
    }
}
class Square {
    int sides;
    int area(){
        int area = sides * sides;
        return area;
    }
    void addSides(int val){
        sides = sides + val;
    }
}

class Rectangle{
    int length;
    int breadth;
    int area(){
        int area = length * breadth;
        return area;
    }
    int perimeter(){
        int parimeter=2*(length+breadth);
        return parimeter;

        
    }
}

/*
 * make attribute name brand year car
 * make a function modify() that tkaes new color and set to old color
 * make  a function expiry() that return 100 added to year
    make a function start() that prints (name is starting)
    make a function stop() that print (name,brand is stopping)
    make a function details() that print (name,brand ,color and year )
    make 3 object of car
    start all 3 object
    stop only 1st object
    modoify 2nd car to green color
    print the expiry of 3d object
    parint detail of all 3 objects
    
    
    */
