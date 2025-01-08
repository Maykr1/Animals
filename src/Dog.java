package Animals.src;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println(getName() + " barked!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food.");
    }
}