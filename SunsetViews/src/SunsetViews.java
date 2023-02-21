import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SunsetViews {
    public static void main(String[] args) {

        int buildings[] = {3, 5, 4, 4, 3, 1, 3, 2};
        String direction = "EAST";
        //String direction = "WEST";

        List<Integer> list = sunsetViews(buildings, direction);

        System.out.println(list);
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {

        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;

        if (direction.equals("EAST")) {
            for (int i = buildings.length - 1; i >= 0; i--) {
                if (buildings[i] > max) {
                    list.add(i);
                    max = buildings[i];
                }
            }
            Collections.sort(list);
            return list;
        } else if (direction.equals("WEST")) {
            for (int i = 0; i < buildings.length; i++) {
                if (buildings[i] > max) {
                    list.add(i);
                    max = buildings[i];
                }
            }
            return list;
        }
        return new ArrayList<Integer>();
    }
}