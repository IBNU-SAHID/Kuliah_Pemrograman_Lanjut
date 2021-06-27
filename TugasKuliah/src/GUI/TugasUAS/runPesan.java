package GUI.TugasUAS;

import GUI.TugasUAS.Pesan;
import javax.swing.*;

public class runPesan {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Pesan Rahasia");
        jFrame.setContentPane(new Pesan().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(400, 500);
        jFrame.setVisible(true);
    }
}
