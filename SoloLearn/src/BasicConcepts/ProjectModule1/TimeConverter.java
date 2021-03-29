package BasicConcepts.ProjectModule1;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        //your code goes here
        int jam = 24,menit = 60,detik=60;

        jam *= days;
        menit *= jam;
        detik *= menit;

        System.out.println(detik);
    }
}
