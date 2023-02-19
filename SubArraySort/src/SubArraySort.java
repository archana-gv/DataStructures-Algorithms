import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArraySort {
    public static void main(String[] args) {

        int array[] = {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
        int result[] = subarraySort(array);

        System.out.println(Arrays.toString(result));
    }

    public static int[] subarraySort(int[] array) {

        List<Integer> list = new ArrayList<>();
        int resultArray[] = new int[2];

        if (array.length == 2) {
            if (array[0] > array[1]) {
                resultArray[0] = 0;
                resultArray[1] = 1;
                return resultArray;
            } else {
                resultArray[0] = -1;
                resultArray[1] = -1;
            }
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i + 1] || array[i] < array[i - 1]) {
                list.add(array[i]);
            }
        }
        if (array[array.length - 1] < array[array.length - 2]) {
            list.add(array[array.length - 1]);
        }
        if (list.size() == 0) {
            resultArray[0] = -1;
            resultArray[1] = -1;
            return resultArray;
        }
        int smallest = list.get(0);
        int largest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
            }
            if (list.get(i) > largest) {
                largest = list.get(i);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > smallest) {
                resultArray[0] = i;
                break;
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < largest) {
                resultArray[1] = i;
                break;
            }
        }
        return resultArray;
    }
}