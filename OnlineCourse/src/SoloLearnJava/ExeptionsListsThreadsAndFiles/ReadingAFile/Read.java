package SoloLearnJava.ExeptionsListsThreadsAndFiles.ReadingAFile;

import java.io.File;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        /*Drag and drop from the options below to read and print the
        content of the file a.txt, and then close it.
         */
        try { File f = new File("a.txt");

            Scanner sc = new Scanner(f);

            while (sc.hasNext()) {

                String a =sc.next();

                String b = sc.next();

                System.out.println(a + " " + b);

            }

            sc.close();

        }

        catch (Exception e) {

            System.out.println("Error");

        }
    }
}
