package BasicConcepts.GettingUserInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        System.out.println(st);
    }
}
