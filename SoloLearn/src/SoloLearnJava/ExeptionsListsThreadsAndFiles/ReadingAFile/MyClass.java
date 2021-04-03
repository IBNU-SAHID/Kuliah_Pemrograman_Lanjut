package SoloLearnJava.ExeptionsListsThreadsAndFiles.ReadingAFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class MyClass {
    public static void main(String[] args) {
        try {
            File x = new File("D:\\Pemrograman Lanjut\\SoloLearn\\src\\SoloLearnJava\\ExeptionsListsThreadsAndFiles\\ReadingAFile\\test.txt");
            Scanner sc = new Scanner(x);
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
    }
}
