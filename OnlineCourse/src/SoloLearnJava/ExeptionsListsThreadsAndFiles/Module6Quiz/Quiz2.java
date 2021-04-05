package SoloLearnJava.ExeptionsListsThreadsAndFiles.Module6Quiz;

public class Quiz2 {
    /*Fill in the blanks to define a function ''myFunc'',
    which throws an exception if its parameter is less than 0.
     */
    void myFunc(int arg) throws IllegalArgumentException {

        if (arg < 0)

            throw new IllegalArgumentException();

    }
}
