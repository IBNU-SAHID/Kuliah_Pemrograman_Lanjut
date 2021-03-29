package ConditionalsAndLoops.LoanCalculator;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int total = 0, bayar = 0, i=0;
        double per = 0.10;
        //your code goes here
        do{
            bayar = amount * 10/100;
            total = amount - bayar;
            amount =total;
            i++;
        }while (i<3);
        System.out.println(total);


    }
}
