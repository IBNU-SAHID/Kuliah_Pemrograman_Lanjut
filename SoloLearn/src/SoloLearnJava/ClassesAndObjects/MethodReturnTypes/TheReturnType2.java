package SoloLearnJava.ClassesAndObjects.MethodReturnTypes;

public class TheReturnType2 {
    //The Return Type What output results from this code?
    public static void main(String[ ] args) {
        int x = 10;
        int y = myFunc(x);
        System.out.println(y);
    }
    public static int myFunc(int x) {
        return x*3;
    }
}
