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