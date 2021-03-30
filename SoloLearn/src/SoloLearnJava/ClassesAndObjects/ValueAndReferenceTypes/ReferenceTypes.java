package SoloLearnJava.ClassesAndObjects.ValueAndReferenceTypes;

public class ReferenceTypes {
    //What is the output of this code?
    public static void main(String[ ] args) {
        Person p = new Person();
        p.setAge(25);
        change(p);
        System.out.println(p.getAge());
    }
    static void change(Person p) {
        p.setAge(10);
    }
}
