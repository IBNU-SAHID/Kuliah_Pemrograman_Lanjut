package GUI.SortingDataArray;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormSorting {
    private JTextField textAngka;
    private JButton ascendingButton;
    private JButton descendingButton;
    private JTable tabelShorting;
    private JPanel rootPanel;
    private JButton buttonInput;
    private JButton buttonReset;
    private JLabel labelNotif;
    private DefaultTableModel tableModel;
    private int[]Angka;
    private String[] inputAngka;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public FormSorting() {
        insertionSort Sorting = new insertionSort();
        this.initComponents();

        //Tombol menguurtkan menaik
        ascendingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Menghapus isi tabel sebelumnya
                tableModel.setRowCount(0);

                try {
                    inputAngka = textAngka.getText().split(",");
                    Angka = new int[inputAngka.length];
                    for (int i = 0; i < inputAngka.length; i++) {
                        Angka[i] = Integer.parseInt(inputAngka[i].trim());
                    }

                    //sorting menaik
                    Sorting.ascending(Angka);



                    //notifAscending
                    labelNotif.setText("Data diurutkan secara ascending");

                    //menampilkan output pada tabel
                    for (int i = 0; i < inputAngka.length; i++) {
                        tableModel.addRow(new Object[]{Angka[i]});
                    }
                }catch (NumberFormatException kosong){
                    JOptionPane.showMessageDialog(rootPanel,
                            "Tidak ada angka untuk di sorting",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        //Tombol mengurutkan menurun
        descendingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Menghapus isi tabel sebelumnya
                tableModel.setRowCount(0);

                try {

                    inputAngka = textAngka.getText().split(",");
                    Angka = new int[inputAngka.length];
                    for (int i = 0; i < inputAngka.length; i++) {
                        Angka[i] = Integer.parseInt(inputAngka[i].trim());
                    }

                    //sorting menurun
                    Sorting.descending(Angka);

                    //notifAscending
                    labelNotif.setText("Data diurutkan secara descending");

                    //menampilkan output pada tabel
                    for (int i = 0; i < Angka.length; i++) {
                        tableModel.addRow(new Object[]{Angka[i]});
                    }

                }catch (NumberFormatException kosong){
                    JOptionPane.showMessageDialog(rootPanel,
                            "Tidak ada angka untuk di sorting",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        //Tombol Input
        buttonInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Menghapus isi tabel sebelumnya
                tableModel.setRowCount(0);

                try {

                    inputAngka = textAngka.getText().split(",");
                    Angka = new int[inputAngka.length];

                    for (int i = 0; i < inputAngka.length; i++) {
                        Angka[i] = Integer.parseInt(inputAngka[i].trim());
                        tableModel.addRow(new Object[]{Angka[i]});
                    }
                } catch (NumberFormatException kosong) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Tidak ada angka yang di inputkan",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }


                }
        });

        //Tombol reset
        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Menghapus isi tabel
                tableModel.setRowCount(0);

                //menghapus isi textAngka
                textAngka.setText(null);

                //manghapus label notif
                labelNotif.setText(null);
            }
        });
    }

    private void initComponents() {
        Object[] tableColom = {
                "Angka",
        };
        Object[][] initData = {
        };
        tableModel = new DefaultTableModel(initData, tableColom);
        //set table model
        tabelShorting.setModel(tableModel);
        //menampilkan sorting di setiap colom
        tabelShorting.setAutoCreateRowSorter(true);
        // enable single selection
        tabelShorting.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }

}
