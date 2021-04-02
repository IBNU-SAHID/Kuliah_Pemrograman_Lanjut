package SoloLearnJava.ExeptionsListsThreadsAndFiles.RuntimeVSCheckedExceptions;

public class MyClass {
    public static void main(String[ ] args) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            //some code
        }
    }
}
