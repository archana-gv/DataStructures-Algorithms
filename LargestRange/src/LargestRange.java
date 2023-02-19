import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestRange {
    public static void main(String[] args) {

        int array[] = {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
        int result[] = largestRange(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] largestRange(int[] array) {
        int bestRange[] = new int[2];
        int longestLength = 0;
        Map<Integer, Boolean> nums = new HashMap<>();
        for (int num : array) {
            nums.put(num, true);
        }
        for (int num : array) {
            nums.put(num, false);
            int currentLength = 1;
            int left = num - 1;
            int right = num + 1;
            while (nums.containsKey(left)) {
                currentLength++;
                left--;
            }
            while (nums.containsKey(right)) {
                currentLength++;
                right++;
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                bestRange = new int[]{left + 1, right - 1};
            }
        }
        return bestRange;
    }
}