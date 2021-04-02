package SoloLearnJava.MoreOnClasses.TheEqualsMethod;

public class A {
    private int x;
    public boolean equals(Object o) {
        return ((A)o).x == this.x;
    }
    public static void main(String[ ] args) {
        A a = new A();
        a.x = 5;
        A b = new A();
        b.x = 5;
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
