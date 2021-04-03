package SoloLearnJava.ExeptionsListsThreadsAndFiles.Module6Quiz;

public class Quiz1 {
        /*Fill in the blanks to declare a function that takes two
        integers as arguments and prints their division. Handle the possible exception.
         */
    void myFunc(int a, int b) {

        try {
            System.out.println(a / b);

        }
        catch (Exception e) {

            System.out.println("Error");

        }

    }
}
