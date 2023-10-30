public class Doggy {
    public static void main(String[] args)
    {

            Dog d1 = new Dog();
            d1.bark();

        }
    }

class Dog {
    String name;
    String breed;
    int age;

    void bark() {
        System.out.println("Wow wow!");
    }
}
