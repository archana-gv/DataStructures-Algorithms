import java.util.ArrayList;
import java.util.List;

public class ValidateSubsequence {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(1);
        array.add(22);
        array.add(25);
        array.add(6);
        array.add(-1);
        array.add(8);
        array.add(10);

        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(6);
        sequence.add(-1);
        sequence.add(10);

        boolean result = isValidSubsequence(array, sequence);
        System.out.println(result);

    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int index = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == sequence.get(index)) {
                index++;
            }
            if (index == sequence.size()) {
                return true;
            }
        }
        return false;
    }
}