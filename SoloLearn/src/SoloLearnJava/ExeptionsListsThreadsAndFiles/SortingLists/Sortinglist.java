package SoloLearnJava.ExeptionsListsThreadsAndFiles.SortingLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortinglist {
    public static void main(String[] args) {
        //Fill in the blanks to add three items to the list, sort it,  and print 2.
        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(2);
        list.add(1);
        Collections.sort(list);
        System.out.println(list.get(1));

    }

}
