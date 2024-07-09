// You are developing a car rental system. There are different types of vehicles available for rent, such as cars, motorcycles, and bicycles.
//  Each vehicle type has different rental calculation rules.
//  Implement a Java program using polymorphism to calculate the rental cost for different vehicle types.


public class rental {
    public static void main(String[] args) {

        cars cr = new cars();
        cr.rent();

        motorcycles mc = new motorcycles();
        mc.rent();


        bicycles bc = new bicycles();
        bc.rent();
    }
}

interface vechicles {
    public void rent();
}

class cars implements vechicles{
    public void rent(){
        int day=5 ;
        int perdayprice = 5000;
        int cost = day*perdayprice;
        System.out.println("Price of car is "+cost);
    }
}

class motorcycles implements  vechicles{
    public void rent(){
        int petrol = 150;
        int priceperhour = 20;
        int cost = petrol * priceperhour;
        System.out.println("Price of motorcycle is "+cost);

    }


}

class bicycles implements  vechicles{
    public void rent(){
        int time = 150;
        int priceperhour = 20;
        int cost = time * priceperhour;
        System.out.println("Price of bicycles is "+cost);

    }


}