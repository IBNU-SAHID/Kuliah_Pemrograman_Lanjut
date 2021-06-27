package GUI.TugasUAS;

import java.util.LinkedList;

public class Stack {
    private LinkedList<Integer> list = new LinkedList<>();
    private int currentIndex=-1;


    // method push
    public void push(int value){
        list.add(value);
        currentIndex++;
    }

    //method pop
    public int pop(){
        int value = list.remove(currentIndex);
        currentIndex--;
        return value;
    }

    //method peek (untuk melihat data pada tumpukan teratas)
    public int peek(){

        return list.get(currentIndex);
    }

    // method untuk menghapus seluruh isi pada list
    public void clear(){
        list.clear();
        currentIndex=-1;
    }

}