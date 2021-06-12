package GUI.SortingDataArray;

public class insertionSort {



    /*
    Disini saya mengurutkan angka dengan menggunakan algoritma insertion sort
     */

    //Menaik
    public static void ascending(int angka[]) {
        int n = angka.length;
        for (int j = 1; j < n; j++) {
            int key = angka[j];
            int i = j - 1;
            while ((i > -1) && (angka[i] > key)) {
                angka[i + 1] = angka[i];
                i--;
            }
            angka[i + 1] = key;
        }
    }

    //Menurun
    public static void descending(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] < key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

}
