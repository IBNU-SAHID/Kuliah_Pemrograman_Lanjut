package GUI.Mahasiswa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBiodata {
    private JPanel rootPanel;
    private JTextField textNama;
    private JTextField textNIM;

    private JTextArea textDisplay;
    private JButton buttonCek;
    private JButton selesaiButton;
    private JPanel buttonPanel;
    private JButton buttonSelesai;
    private JLabel textData;

    public FormBiodata() {

        buttonCek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mengambil data dari teksNama
                String nama = textNama.getText();
                //Mengambil data dari teksNIM
                String nim = textNIM.getText();
                //Proses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNim(nim);
                mhs.setNama(nama);
                //output
                if (nim.length() == 11) {
                    textData.setText("Data Mahasiswa");
                    textDisplay.setText(
                            "Nama\t\t: " + mhs.getNama() + "\n"
                                    + "NIM\t\t: " + mhs.getNim() + "\n"
                                    + "Jenjang Pendidikan\t: " + mhs.jenjangPendidikan() + "\n"
                                    + "Angkatan\t\t: " + mhs.tahunMasuk() + "\n"
                                    + "Fakultas\t\t: " + mhs.Fakultas() + "\n"
                                    + "Prodi\t\t: " + mhs.Prodi() + "\n"
                                    + "Jeis Kelamin\t\t: " + mhs.jenisKelamin() + "\n"
                                    + "Nomor Mahasiswa\t: " + mhs.nomorMahasiswa() + "\n"

                    );

                }else{
                    textData.setText("Nim yang anda masukan salah!");
                }


            }
        });
        selesaiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNama.setText(null);
                textNIM.setText(null);
                textDisplay.setText(null);
                textData.setText(null);
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
