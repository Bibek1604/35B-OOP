
/* make a class cat
 * make 2 private attribute name,age
 * make 2 public attribute breed,color
 * make a constructor to nly st na,e amd age
 * ake fetter for name and age
 * make setter for age
 * ,ake an object of cat
 * fill the attribute
 * add +1 to the current page
 * print the following using obkejct
 * name:ny
 * age:4
 * Breed:xy
 * Color:orange
 */
public class ConstructorTask {
    public static void main(String[] args) {
        Cat myCat = new Cat("Ny", 3);

        myCat.breed = "xy"; 
        myCat.color = "orange"; 

        myCat.setAge(myCat.getAge() + 1); 

        System.out.println("Name: " + myCat.getName());
        System.out.println("Age: " + myCat.getAge());
        System.out.println("Breed: " + myCat.breed);
        System.out.println("Color: " + myCat.color);
    }
}

class Cat {
    private String name;
    private int age;
    public String breed;
    public String color;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}