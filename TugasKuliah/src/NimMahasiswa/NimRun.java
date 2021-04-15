package NimMahasiswa;

import java.util.Scanner;

public class NimRun {
    public static void main(String[] args) {
        //Membuat objek NIM baru
        NIM objNim = new NIM();
        //Membuat objek Scanner baru
        Scanner input = new Scanner(System.in);

        //Mengambil input user
        System.out.println("---------------SELAMAT DATANG---------------");
        System.out.println("Masukan nama dan NIM");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("NIM: ");
        String nim = input.nextLine();

        if (nim.length() == 11){

            //memasukan nilai NIM
            objNim.setNim(nim);

            //Menampilkan output data mahasiswa
            System.out.println("---------------Data Mahasiswa---------------");
            System.out.printf("Nama\t\t\t\t: %S\n",nama);
            System.out.println("NIM\t\t\t\t\t: " + nim);
            System.out.println("Universitas\t\t\t: " + objNim.Universitas);
            System.out.println("Jenjang Pendidikan\t: " + objNim.jenjangPendidikan());
            System.out.println("Angkatan \t\t\t: " + objNim.tahunMasuk());
            System.out.println("Fakultas \t\t\t: " + objNim.Fakultas());
            System.out.println("Prodi \t\t\t\t: " + objNim.Prodi());
            System.out.println("Jeis Kelamin \t\t: " + objNim.jenisKelamin());
            System.out.println("Nomor Mahasiswa \t: " + objNim.nomorMahasiswa());
        }else{
            System.out.println("---------------Error---------------");
            System.out.println("Nim yang anda masukan tidak sesuai!");
        }

    }
}
