package GUI.TugasUAS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pesan {
    private JPanel rootPanel;
    private JTabbedPane tabbedPane1;
    private JPanel enskripsiPane;
    private JTextArea textInputEnkripsi;
    private JButton enkripsiButton;
    private JTextArea textOutputEnkripsi;
    private JTextArea textInputDekripsi;
    private JButton dekripsiButton;
    private JTextArea textOutputDekripsi;
    private JTextField textKunciEnkripsi;
    private JTextField textKunciDekripsi;
    private JButton resetButtonEnkripsi;
    private JButton resetButtonDekripsi;

    public Pesan() {

        //Tombol Enkripsi
        enkripsiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //membuat objek baru
                caesarCipher CaesarCipher = new caesarCipher();
                Teks teks = new Teks();

                String inputKey = textKunciEnkripsi.getText();  //mengambil input kunci dari jTextField
                String plainTeks = textInputEnkripsi.getText(); //mengambil input pesan dari jTextArea

                if (inputKey.isEmpty() && plainTeks.isEmpty()){
                    JOptionPane.showMessageDialog(rootPanel,
                            "inputkan pesan dan kunci untuk enkripsi!",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }else if (inputKey.isEmpty()){
                    JOptionPane.showMessageDialog(rootPanel,
                            "Tidak ada kunci yang di inputkan",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }else if (plainTeks.isEmpty()){
                    JOptionPane.showMessageDialog(rootPanel,
                            "Tidak ada pesan untuk di enkripsi",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }else {
                    int key = Integer.parseInt(inputKey);           // mengubah data string menjadi integer
                    String cipherteks = CaesarCipher.enkripsi(plainTeks,key);   //men enkripsikan pesan menjadi cipherteks dengan metode Caesarcipher
                    String reverse = teks.reverse(cipherteks); // membalik karakter pada cipherteks berpasangan ( "ab" menjadi "ba")
                    textOutputEnkripsi.setText(reverse);   // menampilkan enkripsi pesan hasil dari enkripsi caesar cipher yang sudah di balik dan di tukar karakternya
                }


            }
        });
        //Tombol dekripsi
        dekripsiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //membuat objek baru
                caesarCipher CaesarCipher = new caesarCipher();
                Teks teks = new Teks();

                String inputKey = textKunciDekripsi.getText(); // mengambil input kunci dari jtextfield
                String cipherteks = textInputDekripsi.getText(); // mengambil input pesa ter enkripsi dari jtextArea

                if (inputKey.isEmpty() && cipherteks.isEmpty()){
                    JOptionPane.showMessageDialog(rootPanel,
                            "Inputkan pesan dan kunci untuk di dekripsi!",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }else if (inputKey.isEmpty()){
                    JOptionPane.showMessageDialog(rootPanel,
                            "Tidak ada kunci yang di inputkan",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }else if (cipherteks.isEmpty()){
                    JOptionPane.showMessageDialog(rootPanel,
                            "Tidak ada teks yang di inputkan",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }else {
                    int key = Integer.parseInt(inputKey);            //mengubah data String ke integer
                    String reverse = teks.reverse(cipherteks);      // membalikan karakter pada cipherteks berpasangan ( "ba" menjadi "ab")
                    String plainteks = CaesarCipher.dekripsi(reverse,key);  // men dekripsikan cipherteks menjadi sebuah plainteks(pesan) yang dapat dibaca
                    textOutputDekripsi.setText(plainteks);          // menampilkan plainteks
                }


          }
        });
        resetButtonEnkripsi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // mengosongkan teks teks kunci,input dan output
                textKunciEnkripsi.setText(null);
                textInputEnkripsi.setText(null);
                textOutputEnkripsi.setText(null);
            }
        });
        resetButtonDekripsi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // mengosongkan teks teks kunci,input dan output
                textInputDekripsi.setText(null);
                textKunciDekripsi.setText(null);
                textOutputDekripsi.setText(null);

            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
//IBNU SAHID - 12050110489
