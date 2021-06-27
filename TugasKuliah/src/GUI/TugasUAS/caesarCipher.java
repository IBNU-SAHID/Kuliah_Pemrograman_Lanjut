package GUI.TugasUAS;



public class caesarCipher {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";     //indeks 0 - 25 (total 26)

    //Method enkripsi
    public  String enkripsi(String plainteks, int key) {
        StringBuffer ciphertext = new StringBuffer();   //Membuat objek stringbuffer baru
        plainteks = plainteks.toLowerCase();            // setting plaintext/pesan menjadi huruf kecil
        char karakter = plainteks.charAt(0);              // mengambil karakter pada cipherteks
        int charPosition =   ALPHABET.indexOf(karakter);  // menetapkan posisi karakter pada alphabet


        /*
        Merangkai karakter plainteks menjadi cipherteks dengan kondisi jika desimal karakter 32 (SPACE),
        maka nilai desimal karakter akan tetap menjadi 32(SPACE)
         */
        if (karakter == 32 ){
            karakter = 32;
        }else {
            /*
            jika tidak,maka program akan menentukan pergeseran nilai desimal pada karakter plainteks ke cipherteks
            berdasarkan key yang di berikan misal karakter plainteks adalah 'a' dan key adalah 3
            maka, desimal 'a' + ( posisi index karakter pada field alphabet +  nilai key yang diberikan) mod 26
            = 97 + (0 + 3) mod 26
            = 97 + 3 mod 26
            = 97 + 3
            = 100    berdasarkan desimal pada ASCII tabel 100 adalah 'd'
            jadi.. cipherteks dari plainteks pada karakter 'd' adalah 'a'
             */
            karakter = (char) ('a' + (charPosition + key) % 26);
        }
        /*
        Merangkai  cipherteks dengan berdasarkan nilai desimal karakter yang ada berdasarkan ASCII tabel
         */
        ciphertext.append(karakter);
      /*
       kondisi untuk rekursif , jika panjang plainteks lebih dari 1,
       maka fungsi dekripsi akan di panggil kembali dengan merangkai cipherteks mulai dari index karakter pada plainteks berikutnya
      */
        if (plainteks.length() > 1) {
            ciphertext.append(enkripsi(plainteks.substring(1), key));
        }

        return ciphertext.toString();
    }

    //method dekripsi
    public String dekripsi(String ciphertext, int key){
        StringBuffer plainteks = new StringBuffer(); // membuat objek StringBuffer baru
        char karakter = ciphertext.charAt(0);//mengambil karakter pada ciphertext mulai dari index awalnya
        int charPosition =   ALPHABET.indexOf(karakter); // menetapkan posisi karakter


        /*
        merangkai karakter dengan kondisi jika desimal karakter ADALAH 32
        maka desimal karakter akan tetap menjadi 32(' ' atau SPACE)
         */
        if (karakter == 32 ){
            karakter = 32;
        }else {

            /*
            jika tidak, maka program akan menentukan pergeseran nilai desimal pada karakter
            cipherteks berdasarkan key yang di berikan misal karakter cipherteks adalah 'd' dan key adalah 3
            maka,
            desimal 'a' + ( posisi index karakter pada field alphabet -  nilai key yang diberikan) mod 26
            = 97 + (3 - 3) mod 26
            = 97 + 0 mod 26
            = 97 + 0
            = 97    berdasarkan desimal pada ASCII tabel 97 adalah 'a'
            jadi.. plainteks dari cipherteks pada karakter 'd' adalah 'a'
             */
            karakter = (char) ('a' + (charPosition - key) % 26);
        }
        /*
        hanya ada 26 karakter pada alphabet, jika nilai karakter yang didapat tersebut lebih besar dari desimal 32 dan
        lebih kecil dari 97 pada desimal di tabel ASCII...
         */
        if(karakter < 97 && karakter > 32 ){
            karakter += 26;                 //maka, desimal karakter tersebut akan ditambah 26
        }


        /*
        Merangkai plainteks dengan berdasarkan nilai desimal karakter yang ada berdasarkan ASCII tabel
         */
        plainteks.append(karakter);

         /*
            kondisi untuk rekursif, jika panjang cipherteks lebih besar dari 1,
            maka fungsi dekripsi akan di panggil kembali dengan merangkai pesan mulai dari  karakter pada ciphertext berikutnya
             */

        if (ciphertext.length() > 1) {

            plainteks.append(dekripsi(ciphertext.substring(1), key));
        }

        return plainteks.toString();   // menampilkan hasil rangkaian cipherteks
    }

}

//    Ibnu Sahid - 12050110489

