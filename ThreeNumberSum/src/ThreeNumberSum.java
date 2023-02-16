import java.util.*;

public class ThreeNumberSum {
    public static void main(String[] args) {

        int array[] = {12, 3, 1, 2, -6, 5, -8, 6};
        int targetSum = 0;

        List<Integer[]> result = threeNumberSum(array, targetSum);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(Arrays.toString(result.get(i)));
        }
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {

        List<Integer[]> list = new ArrayList<>();
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int sum = currentNumber + array[left] + array[right];
                if (sum == targetSum) {
                    Integer[] tempArray = new Integer[]{currentNumber, array[left], array[right]};
                    list.add(tempArray);
                    left++;
                    right--;
                } else if (sum < targetSum) {
                    left++;
                } else if (sum > targetSum) {
                    right--;
                }
            }
        }
        return list;
    }
}