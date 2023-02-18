import java.util.ArrayList;
import java.util.List;

public class LongestPeak {
    public static void main(String[] args) {

        int array[] = {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        int result = longestPeak(array);
        System.out.println(result);
    }

    public static int longestPeak(int[] array) {

        List<Integer> list = new ArrayList<>();
        int count = 3, result = 3;

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                list.add(i);
            }
        }
        if (list.isEmpty()) return 0;
        int j = 0;
        while (j < list.size()) {
            int k = list.get(j) - 1;
            int l = list.get(j) + 1;
            while (k > 0 && array[k - 1] < array[k]) {
                count++;
                k--;
            }
            while (l+ 1 < array.length && array[l + 1] < array[l]) {
                count++;
                l++;
            }
            if (count > result) {
                result = count;
            }
            count = 3;
            j++;
        }
        return result;
    }
}