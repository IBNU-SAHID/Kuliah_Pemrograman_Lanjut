package SoloLearnJava.ExeptionsListsThreadsAndFiles.SortingLists;
import  java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        //What is the output of this code?
        List<String> list = new ArrayList<String>();
        list.add("b");
        list.add("a");
        list.add("c");
        Collections.sort(list);
        System.out.println(list.get(0));
    }

}
