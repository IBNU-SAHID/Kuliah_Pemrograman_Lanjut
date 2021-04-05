package SoloLearnJava.ClassesAndObjects.CreatingClassesAndObjects;

public class A {
    public void test() {
        System.out.println("Hi");
    }
    static class B {
        public static void main(String[] args) {
            A obj = new A();
            obj.test();
        }

    }
}
