package SoloLearnJava.MoreOnClasses.OverridingAndOverloading;

//What is the output of this code?
class A {
    public void doSomething() {
        System.out.println("A");
    }
    public void doSomething(String str) {
        System.out.println(str);
    }
}
class B {
    public static void main(String[ ] args) {
        A object = new A();
        object.doSomething("B");
    }
}
