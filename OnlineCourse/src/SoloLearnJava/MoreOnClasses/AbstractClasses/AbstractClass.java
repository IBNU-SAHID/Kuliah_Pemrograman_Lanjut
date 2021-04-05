package SoloLearnJava.MoreOnClasses.AbstractClasses;

abstract class animal {

    public int age;

    public abstract int printAge();

}
class Dog extends animal {

    public int printAge() {
        return this.age;
    }
}


