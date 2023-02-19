import java.util.*;

public class SortedSquaredArray {
    public static void main(String[] args) {

        int array[] = {1, 2, 3, 5, 6, 8, 9};
        int ans[] = sortedSquaredArray(array);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] sortedSquaredArray(int[] array) {

        int result[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * array[i];
        }
        Arrays.sort(result);
        return result;
    }
}