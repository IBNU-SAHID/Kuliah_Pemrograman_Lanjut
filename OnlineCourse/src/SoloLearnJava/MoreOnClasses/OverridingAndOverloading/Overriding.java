package SoloLearnJava.MoreOnClasses.OverridingAndOverloading;

public class Overriding {
}
class Animal {
    public void makeSound() {
        System.out.println("Grr..");
    }
}
class Cat extends Animal{
    public void makeSound() {
        System.out.println("Meow");
    }
}
