package SoloLearnJava.MoreOnClasses.Shapes;

import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}

// subClass Square
class Square extends Shape{

    //konstruktor Square
    Square(int width){
        this.width = width;
    }

    //Method area
    @Override
    void area(){
        //cetak hasil
        System.out.println(width * width);
    }

}

//subClass Circle
class Circle extends Shape{

    //konstruktor Circle
    Circle(int witdh){
        this.width = witdh;
    }

    //Method area
    @Override
    void area() {
        //cetak hasil
        System.out.println(Math.PI * width * width);
    }
}

//Superclass Main
public class Main {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);

        a.area();
        b.area();
    }
}
