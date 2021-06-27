package GUI.TugasUAS;

public class Teks {
    // method membalik karakter pada string
    public String reverse(String str) {
        char[] karakter = str.toCharArray(); // Mengubah tring ke char array
        int size = karakter.length;     // membuat variabel size dengan tipe data integer, dan data berupa panjang dari array karakter
        Stack stack = new Stack();      // membuat objek baru

        // perulangan untuk memasukan data pada tiap index karakter pada array karakter kedalam stack dengan push
        for(int i = 0; i < size; ++i) {
            stack.push(karakter[i]);
        }

        // perulangan untuk mengeluarkan data tumpukan teratas yang ada pada stack kembali kedalam array karakter dengan pop;
        for(int i = 0; i < size; ++i) {
            karakter[i] = (char) stack.pop();
        }

        //return hasil string yang karakternya sudah dirangkai secara terbalik dengan stack
        return String.valueOf(karakter);
    }

}
//IBNU SAHID - 12050110489