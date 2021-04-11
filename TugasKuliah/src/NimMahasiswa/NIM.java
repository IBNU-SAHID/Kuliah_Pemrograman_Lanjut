package NimMahasiswa;

public class NIM {
    private String nim;


    public void setNim(String nim) {

        this.nim = nim;
    }

    //Jenjang pendidikan
    public String jenjangPendidikan(){
        char kodeJenjang = nim.charAt(0);
        return switch (kodeJenjang) {
            case '1' -> "S1(Sarjana)";
            case '2' -> "S2(Megister)";
            case '3' -> "S3(Doktoral)";
            default -> "Tidak Diketahui";
        };
    }

    //Angkatan
    public String Angkatan(){
        char kodeAngkatan1 = nim.charAt(1);
        char kodeAngkatan2 = nim.charAt(2);
        return "" + kodeAngkatan1 + kodeAngkatan2;

    }

    //Fakultas
    public String Fakultas(){
        char kodeFakultas = nim.charAt(3);
        return switch (kodeFakultas){
            case '1' -> "TARBIYAH DAN KEGURUAN";
            case '2' -> "SYARI’AH DAN HUKUM";
            case '3' -> "USHULUDDIN";
            case '4' -> "DAKWAH & KOMUNIKASI";
            case '5' -> "SAINS DAN TEKNOLOGI";
            case '6' -> "PSIKOLOGI";
            case '7' -> "EKONOMI DAN ILMU SOSIAL";
            case '8' -> "PERTANIAN DAN PETERNAKAN";
            default -> "Tidak Diketahui";

        };
    }
    //Prodi
    public String Prodi(){
        char kodeProdi1 = nim.charAt(4);
        char kodeProdi2 = nim.charAt(5);
        String kodeProdi = "" + kodeProdi1 +kodeProdi2;
        return switch (kodeProdi) {
            case "01" -> "Teknik Informatika";
            case "02" -> "Teknik Industri";
            case "03" -> "Sistem Informasi";
            case "04" -> "Matematika";
            case "05" -> "Teknik Elektro";
            default -> "Tidak Diketahui";
        };
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
