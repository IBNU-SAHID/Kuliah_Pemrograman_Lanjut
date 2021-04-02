package SoloLearnJava.ExeptionsListsThreadsAndFiles.Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class MyClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        Iterator<Integer> it = list.iterator();
        it.next();
        System.out.println(it.next());
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
