package SoloLearnJava.ExeptionsListsThreadsAndFiles.ExceptionHandling;

public class MyClass {
    //Fill in the blanks to handle any possible exceptions.
    public static void main(String[] args) {
        int x = 12;
        int y = 0;
        try {
            int z = x / y;

            System.out.println(z);

        } catch(Exception e) {

            System.out.println("Error");

        }
    }

}
