import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpriralTraverse {
    public static void main(String[] args) {

        int array[][] = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};
        List<Integer> list = spiralTraverse(array);
        System.out.println(list);
    }

    public static List<Integer> spiralTraverse(int[][] array) {

        if (array.length == 0) return Collections.emptyList();

        int sR = 0, sC = 0, eR = array.length - 1, eC = array[0].length - 1, c, r;

        List<Integer> list = new ArrayList<>();

        while (sR <= eR && sC <= eC) {
            for (c = sR; c <= eC; c++) {
                list.add(array[sR][c]);
            }

            if (sR == eR) break;

            for (r = sR + 1; r <= eR; r++) {
                list.add(array[r][eC]);
            }

            if (sC == eC) break;

            for (c = eC - 1; c >= sC; c--) {
                list.add(array[eR][c]);
            }

            for (r = eR - 1; r >= sR + 1; r--) {
                list.add(array[r][sC]);
            }
            sR++;
            sC++;
            eC--;
            eR--;
        }
        return list;
    }
}