package SoloLearnJava.ClassesAndObjects.MethodReturnTypes;

public class Sample {
    // returns an int value 5
    static int returnFive() {
        return 5;
    }

    // has a parameter
    static void sayHelloTo(String name) {
        System.out.println("Hello " + name);
    }

    // simply prints"Hello World!"
    static void sayHello() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        System.out.println(returnFive());
        sayHelloTo("ibnu");
        sayHello();

    }
}
