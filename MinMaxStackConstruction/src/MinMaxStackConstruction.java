import java.util.ArrayList;
import java.util.List;

public class MinMaxStackConstruction {

    List<Integer> stack = new ArrayList<>();
    List<Integer> min = new ArrayList<>();
    List<Integer> max = new ArrayList<>();

    public static void main(String[] args) {

        MinMaxStackConstruction stackConstruction = new MinMaxStackConstruction();
        stackConstruction.push(5);
        System.out.println(stackConstruction.getMin());
        System.out.println(stackConstruction.getMax());
        System.out.println(stackConstruction.peek());
        stackConstruction.push(7);
        System.out.println(stackConstruction.getMin());
        System.out.println(stackConstruction.getMax());
        System.out.println(stackConstruction.peek());
        stackConstruction.push(2);
        System.out.println(stackConstruction.getMin());
        System.out.println(stackConstruction.getMax());
        System.out.println(stackConstruction.peek());
        System.out.println(stackConstruction.pop());
        System.out.println(stackConstruction.pop());
        System.out.println(stackConstruction.getMin());
        System.out.println(stackConstruction.getMax());
        System.out.println(stackConstruction.peek());

    }
    public  int peek() {
        return stack.get(stack.size() - 1);
    }
    public int pop() {
        if (max.get(max.size() - 1) == peek()) {
            max.remove(max.size() - 1);
        }
        if (min.get(min.size() - 1) == peek()) {
            min.remove(min.size() - 1);
        }
        return stack.remove(stack.size() - 1);
    }
    public void push(int number) {
        if (stack.isEmpty()) {
            max.add(number);
            min.add(number);
        } else {
            if (number >= max.get(max.size() - 1)) {
                max.add(number);
            }
            if (number <= min.get(min.size() - 1)) {
                min.add(number);
            }
        }
        stack.add(number);
    }
    public int getMin() {
        return min.get(min.size() - 1);
    }
    public int getMax() {
        return max.get(max.size() - 1);
    }

}