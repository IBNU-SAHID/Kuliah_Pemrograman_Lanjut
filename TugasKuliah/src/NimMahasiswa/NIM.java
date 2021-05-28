package NimMahasiswa;

public class NIM {
    public  final String Universitas = "Universitas Islam Negeri Sultan Syarif Kasim Riau";
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

        return "20" + kodeTahun1 + kodeTahun2;

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
        //tarbiah keguruan

        if (Fakultas().equals("TARBIYAH DAN KEGURUAN")){
            if (kodeProdi.equals("01") ){
                return "Hukum Keluarga (Ahwal Al-Syakhsiyah)";
            }else if (kodeProdi.equals("02") ){
                return "Pendidikan Bahasa Arab";
            }else if (kodeProdi.equals("03") ){
                return "Manajemen Pendidikan Islam";
            }else if (kodeProdi.equals("04") ){
                return "Pendidikan Bahasa Inggris";
            }else if (kodeProdi.equals("05") ){
                return "Pendidikan Matematika";
            }else if (kodeProdi.equals("06") ){
                return "Pendidikan Ekonomi";
            }else if (kodeProdi.equals("07") ){
                return "Pendidikan Kimia";
            }else if (kodeProdi.equals("08") ){
                return "Pendidikan Guru Madrasah Ibtidaiyah";
            }else if (kodeProdi.equals("09") ){
                return "Pendidikan Guru Raudhatul Athfal";
            }else{
                return "Tidak Diketahui";
            }

            //Syariah dan hukum
        }else if (Fakultas().equals("SYARI’AH DAN HUKUM")){
            if (kodeProdi.equals("01") ){
                return "Hukum Keluarga (Ahwal Al-Syakhsiyah)";
            }else if (kodeProdi.equals("02") ){
                return "Hukum Ekonomi Syariah (Muamalah)";
            }else if (kodeProdi.equals("03") ){
                return "Perbandingan Mazhab dan Hukum";
            }else if (kodeProdi.equals("04") ){
                return "Hukum Tata Negara(Siyasah)";
            }else if (kodeProdi.equals("05") ){
                return "Ekonomi Islam";
            }else if (kodeProdi.equals("06") ){
                return "Perbankan Syari’ah";
            }else if (kodeProdi.equals("07") ){
                return "Ilmu Hukum";
            }else{
                return "Tidak Diketahui";
            }

            // Ushuluddin
        }else if (Fakultas().equals("USHULUDDIN")) {
            if (kodeProdi.equals("01")) {
                return "Ilmu Aqidah";
            } else if (kodeProdi.equals("02")) {
                return "Ilmu Al-qur’an dan Tafsir";
            } else if (kodeProdi.equals("03")) {
                return "Perbandingan Agama";
            } else {
                return "Tidak Diketahui";
            }

            //Dakwah dan Ilmu Komunikasi
        }else if (Fakultas().equals("DAKWAH & KOMUNIKASI")) {
            if (kodeProdi.equals("01")) {
                return "Pengembangan Masyarakat Islam";
            } else if (kodeProdi.equals("02")) {
                return "Bimbingan Penyuluhan Islam";
            } else if (kodeProdi.equals("03")) {
                return "Ilmu Komunikasi";
            } else if (kodeProdi.equals("04")) {
                return "Manajemen Dakwah";
            } else {
                return "Tidak Diketahui";
            }

            //Sains dan Teknologi
        }else if (Fakultas().equals("SAINS DAN TEKNOLOGI")) {
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
        }else if (Fakultas().equals("PSIKOLOGI")) {
            if (kodeProdi.equals("01") ){
                return "Psikologi";
            }else{
                return "Tidak Diketahui";
            }
        }else if (Fakultas().equals("EKONOMI DAN ILMU SOSIAL")) {
            if (kodeProdi.equals("01") ){
                return "Manajemen";
            }else if (kodeProdi.equals("02") ){
                return "Manajemen Perusahaan";
            }else if (kodeProdi.equals("03") ){
                return "Akuntansi";
            }else if (kodeProdi.equals("04") ){
                return "Akuntansi D3";
            }else if (kodeProdi.equals("05") ){
                return "Ilmu Administrasi Negara";
            }else if (kodeProdi.equals("06") ){
                return "Administrasi Perpajakan";
            }else{
                return "Tidak Diketahui";
            }
        }else if (Fakultas().equals("PERTANIAN DAN PETERNAKAN")) {
            if (kodeProdi.equals("01") ){
                return "Peternakan";
            }else if (kodeProdi.equals("02") ){
                return "Agroteknologi";
            }else{
                return "Tidak Diketahui";
            }
        }else {
            return "tidak diketahui";
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
