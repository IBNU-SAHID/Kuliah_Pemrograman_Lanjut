package SoloLearnJava.ExeptionsListsThreadsAndFiles.Threads;

public class MyClass extends Thread {
    //Fill in the blanks to run the method in a separate thread.
    public void run() {

        System.out.println("Hello");

    }
    public static void main(String[ ] args) {

        MyClass object = new MyClass();

        object.start();

    }
}
