import java.util.ArrayList;
import java.util.List;

public class MoveElementToEnd {
    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(1);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(2);

        int toMove = 2;

        List<Integer> result = moveElementToEnd(array, toMove);
        System.out.println(result);
    }

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {

        int count = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != toMove) {
                list.add(array.get(i));
            } else {
                count++;
            }
        }
        while (count != 0) {
            list.add(toMove);
            count--;
        }
        return list;
    }
}