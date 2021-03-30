package SoloLearnJava.ConditionalsAndLoops.LoanCalculator;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int total = 0, bayar = 0, bulan=3, i=0;

        //your code goes here
        do{
            bayar = amount * 10/100;
            total = amount - bayar;
            amount =total;
            i++;
        }while (i<bulan);
        System.out.println(total);


    }
}
