// 5. You are designing a car rental system, and you need to create a Car class. 
// The Car class should have private instance variables for the car's make, model, and rental price per day. 
// Implement appropriate getter and setter methods for these variables, ensuring that the make and model can only be set once 
// during object creation. Additionally, include a private variable to track the availability of the car
// (e.g., true if available for rent, false if rented), and provide public methods to rent and return the car,
// updating its availability status.

import java.util.Scanner;

public class rental{
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the model: ");
        String model = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Enter the price: ");
        int price = scanner.nextInt();



        car cr = new car();
        cr.setmodel(model);
        cr.setrentalprice(price);



        System.out.println("model is"+cr.getmodel());
        System.out.println("price is"+cr.getrentalprice());
        System.out.println("Available: " + car.isAvailable());

    }}


class car{
    private String model;
    private int rentalprice;
    private boolean available;

    public String getmodel(){
        return model;

    }
    public void setmodel(String model){
        this.model = model ;
    }
    public int getrentalprice(){
        return rentalprice;
    }
    public void setrentalprice(int rentalprice){
        this.rentalprice=rentalprice;
    }

    public boolean isAvailable(){
        return available;
    
    }
    public void setAvailable(boolean available){
        this.available = available;
    }


}
