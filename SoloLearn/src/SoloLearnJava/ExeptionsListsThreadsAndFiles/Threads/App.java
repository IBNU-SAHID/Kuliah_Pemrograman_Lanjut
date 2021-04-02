package SoloLearnJava.ExeptionsListsThreadsAndFiles.Threads;

//Drag and drop from the options below to implement the Runnable interface and run a new thread.
class A implements Runnable {
    public void run() {
        System.out.println("Bye");
    }

}
public class App {
    public static void main(String[] args) {
        Thread ob = new Thread(new A());
        ob.start();
    }
}
