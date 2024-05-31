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


public class FirstTask {
    public static void main(String[] args) {
        Car car = new Car();
        car.name="brezza";

        car.brand="Suzuki";

        car.year=2021;
        car.color="Mat Black";
    }

    


    class Car{
        String name;
        String brand;
        int year;
        String color;
        void modify(String newColor){
            color=newColor;
        }
        int expiry(){
            return 100 + year;
        }
        void start(){
            System.out.println(name + "is starting");
        }
        void stop(){
            System.out.println(name + ","+brand+"is stooping");
        }
        void detail(){
            System.out.println(name + "," + brand +","+color+"," + "and" +year);
        }

    }
    
}
