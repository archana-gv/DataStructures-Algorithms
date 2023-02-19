import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
    public static void main(String[] args) {

        int array[] = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        int result[] = twoNumberSum(array, targetSum);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {

        Set<Integer> map = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            int x = targetSum - array[i];
            if (map.contains(x)) {
                return new int[]{x, array[i]};
            } else {
                map.add(array[i]);
            }
        }
        return new int[0];
    }
}