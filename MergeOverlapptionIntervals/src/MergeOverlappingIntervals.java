import java.util.Arrays;
import java.util.HashMap;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {

        int intervals[][] = {{1, 2}, {3, 5}, {4, 7}, {6, 8}, {9, 10}};

        int resultArray[][] = mergeOverlappingIntervals(intervals);

        System.out.println(Arrays.deepToString(resultArray));
    }

    public static int[][] mergeOverlappingIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < intervals.length; i++) {
            int s = intervals[i][0];
            int e = intervals[i][1];
            if (i == intervals.length - 1) {
                map.put(s, e);
            } else {
                int s1 = intervals[i + 1][0];
                int e1 = intervals[i + 1][1];
                if (s1 < e) {
                    e = Math.max(e, e1);
                    intervals[i + 1][0] = s;
                    intervals[i + 1][1] = e;
                } else {
                    map.put(s, e);
                }
            }
        }
        int mapLength = map.size();
        int resultArray[][] = new int[mapLength][2];
        int k = 0;
        for (int key : map.keySet()) {
            resultArray[k][0] = key;
            resultArray[k][1] = map.get(key);
            k++;
        }
        return resultArray;
    }
}