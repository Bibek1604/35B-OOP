/*
 * Create a Student class to simulate a student's profile. The class should have
 * the following attributes: student ID ,name and GPA, Include methods to
 * updateGPA() and printProfile(), Implement functionality to create new student
 * profiles, update GPAs, and print student profiles
 */


public class qtn1 {

    public static void main(String[] args) {

        Student s1 = new Student(10, "biebk", 0);
        s1.printProfile();
        
    }
}

class Student {
    public int studentid;
    public String name;
    public int gpa;

    public Student(int studentid,String name, int gpa) {
        this.studentid=studentid;
        this.name = name;
        this.gpa = gpa;
    }

    public int updateGPA(int newgpa){
        return this.gpa = newgpa;
    }

    public void printProfile(){
        System.out.println("id is "+studentid);
        System.out.println("name is "+name);

        System.out.println(" gpa is "+gpa);

    }

    

    
    
}