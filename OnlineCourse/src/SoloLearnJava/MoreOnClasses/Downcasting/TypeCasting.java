package SoloLearnJava.MoreOnClasses.Downcasting;

    //What is the output of this code?
    class A {
        public void print() {
            System.out.println("A");
        }
    }
    class B extends A {
        public void print() {
            System.out.println("B");
        }
        public static void main(String[ ] args) {
            A object = new B();
            B b = (B) object;
            b.print();
        }
    }
