package SoloLearnJava.Arrays.Module3Quiz;

public class Quiz1 {
    public static void main(String[] args) {
        //What is the output of this code?
        int arr[ ] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = i;
        }
        int res = arr[0] + arr[2];
        System.out.println(res);
    }
}
