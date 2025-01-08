package Animals.src;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);

        dog.eat();
        dog.sleep();
        dog.bark();

        System.out.println("\n");
        
        cat.eat();
        cat.sleep();
        cat.meow();
    }
}