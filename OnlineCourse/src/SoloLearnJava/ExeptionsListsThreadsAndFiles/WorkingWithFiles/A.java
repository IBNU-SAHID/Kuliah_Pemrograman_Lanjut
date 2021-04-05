package SoloLearnJava.ExeptionsListsThreadsAndFiles.WorkingWithFiles;

import java.io.File;
public class A {
    public static void main(String args[ ]) {

        File file = new File("a.txt");
        if(file.exists()) {
            System.out.println("Yes");
        }

    }
}
