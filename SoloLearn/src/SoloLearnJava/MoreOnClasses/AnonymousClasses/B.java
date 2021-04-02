package SoloLearnJava.MoreOnClasses.AnonymousClasses;

public class B {
    public static void main(String[ ] args) {
        A object = new A() {
            @Override public void print() {
                System.out.println("Hello");

            }

        };
        object.print();
    }
}
