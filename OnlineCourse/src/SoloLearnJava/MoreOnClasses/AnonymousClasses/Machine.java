package SoloLearnJava.MoreOnClasses.AnonymousClasses;

class Machine {
    public void start() {
        System.out.println("Starting...");
    }

    public static void main(String[] args) {
        Machine m = new Machine() {

            @Override
            public void start() {

                System.out.println("Hi");

            }

        };
        m.start();
    }
}

