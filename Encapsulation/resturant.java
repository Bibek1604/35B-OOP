
import java.util.Scanner;


// You are developing a restaurant management system and want to create a Menu class. 
// The Menu class should encapsulate a list of MenuItem objects. 
// Implement the Menu class with private instance variables for the menu items and provide public methods 
// to add and remove items from the menu. Ensure that the list of menu items cannot be directly accessed
//  or modified from outside the class.



public class resturant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        
        
        System.out.println("Enter the price: ");
        int price = scanner.nextInt();
        
        MenuItems mi = new MenuItems();
        mi.setname(name);
        mi.setprice(price);
        
        System.out.println("Name: " + mi.getname());
        System.out.println("Price: " + mi.getprice());


        



    }
}

class MenuItems {
    private String name;
    private int price;

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getprice() {
        return price;
    }

    public void setprice(int price) {
        this.price = price;
    }


}

