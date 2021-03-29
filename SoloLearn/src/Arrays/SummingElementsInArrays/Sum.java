package Arrays.SummingElementsInArrays;

public class Sum {
    public static void main(String[] args) {
        /*
        Fill in the blanks to calculate the sum of myArray's elements using the for loop,
        and print it to the screen. myArray is an array of doubles, containing 4 elements.
         */
        double sum = 4.0;
        double myArray[] = {7,2,9,4,10,6};

        for (int x = 0; x < 4; x++) {

            sum += myArray[x];

        }

        System.out.println(sum);
    }
}
