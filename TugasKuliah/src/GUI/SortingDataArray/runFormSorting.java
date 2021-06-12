package GUI.SortingDataArray;

import javax.swing.*;

public class runFormSorting {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Program Sorting Angka");
        jFrame.setContentPane(new FormSorting().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(700, 400);
        jFrame.setVisible(true);
    }
}
