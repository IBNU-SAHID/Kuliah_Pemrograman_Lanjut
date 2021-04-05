package SoloLearnJava.MoreOnClasses.Polymorphism;

public class Animal {
    public void makeSound() {
        System.out.println("Grr...");
    }
    public static void main(String[ ] args) {
        Animal a = new Dog();
        Animal b = new Cat();

        a.makeSound();
        b.makeSound();
    }
}
