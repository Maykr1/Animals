package Animals.src;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void meow() {
        System.out.println(getName() + " meowed!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating cat food.");
    }
}
