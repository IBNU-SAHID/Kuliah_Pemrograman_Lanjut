package SoloLearnJava.ExeptionsListsThreadsAndFiles.CreatingAndWritingFiles;

import java.util.Formatter;
public class CreatingAndWritingFile {
    public static void main(String[ ] args) {
        try {
            Formatter f = new Formatter("D:\\Pemrograman Lanjut\\SoloLearn\\src\\SoloLearnJava\\ExeptionsListsThreadsAndFiles\\CreatingAndWritingFiles\\test.txt");
            f.format("%s %s %s","1.","Ibnu","Sahid \r\n");
            f.format("%s %s %s","2.","Dihas","Inu");
            f.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
