public class AccessTask {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("puppy");
        d1.breed = "shepard";
        d1.setAge(10);

        System.out.println("name: " + d1.getName());
        System.out.println("breed: " + d1.breed);
        System.out.println("age: " + d1.getAge());
    }
}

class Dog {
    private String name;
    private int age;
    public String breed;

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}