
// 2. You are developing a library management system and need to implement a Book class. The Book class should 
// have private instance variables for the book title, author name, and publication year. Implement appropriate
//  getter and setter methods to ensure encapsulation. Additionally, include a private variable to track the availability of 
//  the book (e.g., true if available, false if borrowed),
//  and provide a public method to borrow the book, updating its availability status.
import java.util.Scanner;
public class lms {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the title: ");
        String title =scanner.nextLine();


        System.out.println("Enter the authorname: ");
        String author =scanner.nextLine();

        
        System.out.println("Enter the publicationyear: ");
        String publicationyear =scanner.nextLine();



        book b= new book();
        b.settitle(title);
        b.setauthorname(author);
        b.setpublicationyear(publicationyear);
        

        System.out.println("Book details entered:");
        System.out.println("Title: " + b.gettitle());
        System.out.println("Author: " + b.getauthorname());
        System.out.println("Publication Year: " + b.getpublicationyear());
    }
    
}
class book{
    private String title;
    private String authorname;
    private String publicationyear;
    private Boolean available;


    public  String gettitle(){
        return title;
    }
    public void settitle(String t){
        title = t;
    }

    public String getauthorname(){
        return authorname;
    }
    public void setauthorname(String an){
        authorname = an;
        
    }
    public String getpublicationyear(){
        return publicationyear;
    }
    public void setpublicationyear(String py){
        publicationyear = py;
    }
    public boolean isavailable(){
        return available;
    }
    public  void borrowBook(){
        if(available){
            available=false;
            System.out.println("Book has been borrowed.");
        } else {
            System.out.println("Sorry, the book is not available for borrowing.");
        }
            
    }
    }

