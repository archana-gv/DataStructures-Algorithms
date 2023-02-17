import java.util.ArrayList;
import java.util.List;

public class MonotonicArray {
    public static void main(String[] args) {

        int array[] = {-1, -5, -10, -1100, -1100, -1101, -9001};

        boolean result = isMonotonic(array);

        System.out.println(result);
    }

    public static boolean isMonotonic(int[] array) {

        List<Integer> list = new ArrayList<>();

        if (array.length == 0 || array.length == 1) {
            return true;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                list.add(array[i]);
            }
        }
        list.add(array[array.length - 1]);

        if (list.size() <= 1) return true;
        else if (list.get(1) < list.get(0)) {
            for (int j = 2; j < list.size(); j++) {
                if (list.get(j - 1) < list.get(j)) return false;
            }
        } else if (list.get(1) > list.get(0)) {
            for (int j = 2; j < list.size(); j++) {
                if (list.get(j - 1) > list.get(j)) return false;
            }
        }
        return true;
    }
}