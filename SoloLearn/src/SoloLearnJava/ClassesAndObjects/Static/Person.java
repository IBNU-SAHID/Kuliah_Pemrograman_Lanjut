package SoloLearnJava.ClassesAndObjects.Static;

class Person {
    //What output results from this code?
    public static int pCount;
    public static void main(String[ ] args) {
        Person.pCount = 1;
        Person.pCount++;
        System.out.println(Person.pCount);
    }
}
