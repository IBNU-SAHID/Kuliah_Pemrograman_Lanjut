package SoloLearnJava.ExeptionsListsThreadsAndFiles.WorkingWithFiles;

import java.io.File;

public class MyClass {
    public static void main(String[ ] args) {
        File x = new File("D:\\Pemrograman Lanjut\\SoloLearn\\src\\SoloLearnJava\\ExeptionsListsThreadsAndFiles\\WorkingWithFiles\\test.txt");
        if(x.exists()) {
            System.out.println(x.getName() +  " exists!");
        }
        else {
            System.out.println("The file does not exist");
        }
    }
}
