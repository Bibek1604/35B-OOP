///CREATE  A STUDENT  CLASS TO STIMULATE sTUDENT PROFILE /THE CLASS SHOULD HAVE FOLLOWING ATTRIBUTES : STUDENTID,NAME AND GPA .INCLUDE METHOD TO 
//updateGPA() and print profile().
//implement functinality to create new student profile update gpaand print student profile.

import java.util.Scanner;

public class stds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the studentid : ");
        int studentid = scanner.nextInt();

        System.out.println("Enter the name : ");
        String name = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Enter the gpa : ");
        int gpa = scanner.nextInt();

        Student stds = new Student(studentid, gpa, name);
        stds.profile();

        System.out.println("Enter the update gpa: ");
        int newgpa = scanner.nextInt();
        stds.updategpa(newgpa);

        stds.profile();
        
        scanner.close();



        
    }
    
}
class Student{
    public int studentid;
    public int gpa;
    public String name ;

    public void updategpa(int gpa){
        this.gpa =gpa;
    }
    public void profile(){
        System.out.println("Student id is "+studentid + "          gpa is "+gpa + "       name is "+name);
    }

    Student(int studentid , int gpa ,String name){
        this.studentid=studentid;
        this.gpa=gpa;
        this.name=name;
    }
}