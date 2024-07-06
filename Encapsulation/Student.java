
// 3. You are working on a student information system and need to create a Student class. 
// The student class should have private instance variables for the student's name, ID number, and grade point average (GPA).
//  Implement getter and setter methods for the name and ID number, ensuring that they can be accessed and modified 
//  only through these methods.
//  However, the GPA should be read-only and can only be set within the class constructor.

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter gpa: ");
        int gpa = scanner.nextInt();

        System.out.println("Enter id: ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter the name: ");
        String name = scanner.nextLine();




        school sl = new school();
        sl.setGpa(gpa);
        sl.setIdNumber(id);
        sl.setName(name);


        System.out.println("GPA is " + sl.getGpa());
        System.out.println("Your ID is " + sl.getIdNumber());
        System.out.println("Your name is " + sl.getName());



    }
    
}
class school {
    private String name;
    private int idNumber;
    private int gpa;

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int id) {
        idNumber = id;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
