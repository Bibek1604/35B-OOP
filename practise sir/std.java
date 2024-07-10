/*  create a student class to simulate a students profile .the class should have the follwoing attributes :student id , name and gpa . include 
 * method to update gpa() and printProfile() . implement functionality to create a new student profile , update gpa and print stundet profile.
 */

import java.util.Scanner;

public class std {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the student id: ");
        int student_id = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter the name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the gpa: ");
        int gpa = scanner.nextInt();



        Student student  = new Student(student_id, name, gpa);
        student.printProfile();

        System.out.println("Enter new gpa: ");
        int newgpa = scanner.nextInt();
        student.updategpa(newgpa);

        student.printProfile();
        scanner.close();


        
        
    }
}
class Student{
    public int student_id;
    public String name;

    public int gpa;

    public void  updategpa(int gpa){
        this.gpa= gpa;
    };
    public void printProfile( ){
     System.out.println("          id"+student_id + "         name"+name + "      gpa"+gpa);
    }

    Student(int student_id, String name , int gpa){
        this.student_id  = student_id;
        this.name = name;
        this.gpa = gpa;
    }


}