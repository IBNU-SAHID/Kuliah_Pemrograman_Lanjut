package Arrays.EnhancedForLoop;

public class EnhancedforLoop {
    public static void main(String[] args) {
        //Fill in the blanks to use the enhanced for loop for an array called "arr":
        int total = 0;
        int arr[] = {1,2,3,4,5,6,7,8};

        for(int x : arr) {
            total += x;
        }
        System.out.println(total);

    }
}
