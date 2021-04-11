package NimMahasiswa;


public class Data {

    public static final String Universitas = "Universitas Islam Negeri Sultan Syarif Kasim Riau";

    public static void Mahasiswa(String nama, String nim){
        //Membuat objek NIM baru
        NIM objNim = new NIM();
        //memasukan nilai NIM
        objNim.setNim(nim);

        System.out.println("---------------Data Mahasiswa---------------");
        System.out.printf("Nama\t\t\t\t: %S\n",nama);
        System.out.println("NIM\t\t\t\t\t: " + nim);
        System.out.println("Universitas\t\t\t: " + Universitas );
        System.out.println("Jenjang Pendidikan\t: " + objNim.jenjangPendidikan());
        System.out.println("Angkatan \t\t\t: " + objNim.tahunMasuk());
        System.out.println("Fakultas \t\t\t: " + objNim.Fakultas());
        System.out.println("Prodi \t\t\t\t: " + objNim.Prodi());
        System.out.println("Jeis Kelamin \t\t: " + objNim.jenisKelamin());
        System.out.println("Nomor Mahasiswa \t: " + objNim.nomorMahasiswa());
    }
}
