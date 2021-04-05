package SoloLearnJava.ClassesAndObjects.Constructors;

public class Vehicle2 {
    private String color;

    Vehicle2() {
        this.setColor("Red");
    }
    Vehicle2(String c) {
        this.setColor(c);
    }

    // Setter
    public void setColor(String c) {
        this.color = c;
    }
}
