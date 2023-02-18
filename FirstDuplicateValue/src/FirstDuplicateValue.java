import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateValue {
    public static void main(String[] args) {

        int[] array = {2, 1, 5, 2, 3, 3, 4};

        int result = firstDuplicateValue(array);

        System.out.println(result);
    }

    public static int firstDuplicateValue(int[] array) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                return array[i];
            } else {
                set.add(array[i]);
            }
        }
        return -1;
    }
}