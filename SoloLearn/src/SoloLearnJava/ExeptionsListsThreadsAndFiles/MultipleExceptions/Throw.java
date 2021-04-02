package SoloLearnJava.ExeptionsListsThreadsAndFiles.MultipleExceptions;

import  java.io.IOException;

/*Drag and drop from the options below to create a method that
throws an IOException if the parameter is negative.*/
public class Throw {

    public  void Do(int x) throws IOException {

        if (x < 0) {
            throw new IOException();
        } else {

        }

    }

}
