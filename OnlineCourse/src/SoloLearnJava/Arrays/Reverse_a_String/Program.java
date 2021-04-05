package SoloLearnJava.Arrays.Reverse_a_String;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        //your code goes here
        for(int huruf = arr.length - 1; huruf >= 0; huruf-- ){
            System.out.print(arr[huruf]);
        }

    }
}
