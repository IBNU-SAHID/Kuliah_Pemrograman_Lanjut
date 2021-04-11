package NimMahasiswa;

public class NIM {
    private String nim;


    public void setNim(String nim) {

        this.nim = nim;
    }

    //Jenjang pendidikan
    public String jenjangPendidikan(){

        char kodeJenjang = nim.charAt(0);

        if(kodeJenjang == '1'){
            return "S1(Sarjana)";
        }else if(kodeJenjang == '2'){
            return "S2(Megister)";
        }else if(kodeJenjang == '3'){
            return  "S3(Doktoral)";
        }else {
            return "Tidak Diketahui";
        }

    }

    //tahun masuk
    public String tahunMasuk(){

        char kodeTahun1 = nim.charAt(1);
        char kodeTahun2 = nim.charAt(2);

        return "" + kodeTahun1 + kodeTahun2;

    }

    //Fakultas
    public String Fakultas(){

        char kodeFakultas = nim.charAt(3);

        if(kodeFakultas == '1'){
            return "TARBIYAH DAN KEGURUAN";
        }else if(kodeFakultas == '2'){
            return "SYARI’AH DAN HUKUM";
        }else if(kodeFakultas == '3'){
            return "USHULUDDIN";
        }else if(kodeFakultas == '4'){
            return "DAKWAH & KOMUNIKASI";
        }else if(kodeFakultas == '5'){
            return "SAINS DAN TEKNOLOGI";
        }else if(kodeFakultas == '6'){
            return "PSIKOLOGI";
        }else if(kodeFakultas == '7'){
            return "EKONOMI DAN ILMU SOSIAL";
        }else if(kodeFakultas == '8'){
            return "PERTANIAN DAN PETERNAKAN";
        }else{
            return "Tidak Diketahui";
        }

    }
    //Prodi
    public String Prodi(){

        char kodeProdi1 = nim.charAt(4);
        char kodeProdi2 = nim.charAt(5);

        String kodeProdi = "" + kodeProdi1 +kodeProdi2;

        if (kodeProdi.equals("01") ){
            return "Teknik Informatika";
        }else if (kodeProdi.equals("02") ){
            return "Teknik Industri";
        }else if (kodeProdi.equals("03") ){
            return "Sistem Informasi";
        }else if (kodeProdi.equals("04") ){
            return "Matematika";
        }else if (kodeProdi.equals("05") ){
            return "Teknik Elektro";
        }else{
            return "Tidak Diketahui";
        }

    }

    //Jenis Kelamin
    public String jenisKelamin(){

        char kodeJk = nim.charAt(6);

        if(kodeJk == '1'){
            return "LAKI-LAKI";
        }else if(kodeJk == '2'){
            return "PEREMPUAN";
        }
        return "Tidak Diketahui";
    }

    //Nomor Mahasiswa
    public String nomorMahasiswa(){

        char kodeNoMhs1= nim.charAt(7);
        char kodeNoMhs2 = nim.charAt(8);
        char kodeNoMhs3 = nim.charAt(9);
        char kodeNoMhs4 = nim.charAt(10);

        return "" + kodeNoMhs1 + kodeNoMhs2 + kodeNoMhs3 + kodeNoMhs4;

    }

}
