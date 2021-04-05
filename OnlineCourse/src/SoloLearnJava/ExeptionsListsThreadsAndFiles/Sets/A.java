package SoloLearnJava.ExeptionsListsThreadsAndFiles.Sets;

import java.util.HashSet;
public class A {
    //What is the output of this code?
    public static void main(String[ ] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set.size());
    }
}
