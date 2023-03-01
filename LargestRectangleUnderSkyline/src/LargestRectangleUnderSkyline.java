import java.util.ArrayList;

public class LargestRectangleUnderSkyline {
    public static void main(String[] args) {

        ArrayList<Integer>buildings = new ArrayList<>();
        buildings.add(1);
        buildings.add(3);
        buildings.add(3);
        buildings.add(2);
        buildings.add(4);
        buildings.add(1);
        buildings.add(5);
        buildings.add(3);
        buildings.add(2);

        int result = largestRectangleUnderSkyline(buildings);
        System.out.println(result);

    }

    public static int largestRectangleUnderSkyline(ArrayList<Integer> buildings) {
        int result = 0, count = 1, currentNumber = 0;
        while (currentNumber < buildings.size()){
            int left = currentNumber - 1;
            int right = currentNumber + 1;
            while (left >= 0 && buildings.get(left) >= buildings.get(currentNumber)){
                count++;
                left--;
            }
            while (right < buildings.size() && buildings.get(right) >= buildings.get(currentNumber)){
                count++;
                right++;
            }
            count = count * buildings.get(currentNumber);
            if(result < count){
                result = count;
            }
            currentNumber++;
            count = 1;
        }
        return result;
    }
}