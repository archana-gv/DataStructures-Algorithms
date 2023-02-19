import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SmallestDifference {
    public static void main(String[] args) {

        int arrayOne[] = {-1, 5, 10, 28, 3};
        int arrayTwo[] = {26, 134, 135, 15, 17};

        int result[] = smallestDifference(arrayOne, arrayTwo);

        System.out.println(Arrays.toString(result));

    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {

        int pairOfNumber[] = new int[2];
        int tempDiff = Integer.MAX_VALUE;
        int i = 0, j = 0;
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        while (i < arrayOne.length && j < arrayTwo.length) {
            int minDiff = Math.abs(arrayOne[i] - arrayTwo[j]);
            if (minDiff < tempDiff) {
                pairOfNumber[0] = arrayOne[i];
                pairOfNumber[1] = arrayTwo[j];
                tempDiff = minDiff;
            } if (arrayOne[i] < arrayTwo[j]) {
                i++;
            } else {
                j++;
            }
        }
        return pairOfNumber;
    }
}