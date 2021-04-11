package NimMahasiswa;

import java.util.Scanner;
public class NimRun {
    public static void main(String[] args) {
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
            //Menampilkan output data mahasiswa
            Data.Mahasiswa(nama,nim);
        }else{
            System.out.println("---------------Error---------------");
            System.out.println("Nim yang anda masukan tidak sesuai!");
        }

    }
}
