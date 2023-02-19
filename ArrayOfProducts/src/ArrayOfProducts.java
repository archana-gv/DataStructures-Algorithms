import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOfProducts {
    public static void main(String[] args) {

        int array[] = {5, 1, 4, 2};
        int result[] = arrayOfProducts(array);

        System.out.println(Arrays.toString(result));
    }

    public static int[] arrayOfProducts(int[] array) {

        int productArray[] = new int[array.length];
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    product = product * array[j];
                }
            }
            productArray[i] = product;
            product = 1;
        }
        return productArray;
    }
}