package SoloLearnJava.Arrays.Module3Quiz;

public class Quiz3 {
    public static void main(String[] args) {
         /*
    Fill in the blanks to calculate the sum of all elements in the array "arr"
    using an enhanced for loop:
     */
        int res = 0;
        int arr[] = {2,4,3,5,7,9,8,10};

        for (int el : arr) {
            res += el;
        }
        System.out.println(res);

    }

}
