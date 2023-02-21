import java.util.ArrayList;

public class SortStack {
    public static void main(String[] args) {

        ArrayList<Integer> stack = new ArrayList<>();
        stack.add(-5);
        stack.add(2);
        stack.add(-2);
        stack.add(4);
        stack.add(3);
        stack.add(1);

        SortStack sortStack = new SortStack();

        ArrayList<Integer>list = sortStack.sortStack(stack);

        System.out.println(list);
    }

    public ArrayList<Integer> sortStack(ArrayList<Integer> stack) {

        if (stack.size() == 0) {
            return stack;
        }
        int top = stack.remove(stack.size() - 1);
        sortStack(stack);
        insertStack(stack, top);
        return stack;
    }

    public void insertStack(ArrayList<Integer> stack, int value) {
        if (stack.size() == 0 || stack.get(stack.size() - 1) <= value) {
            stack.add(value);
            return;
        }
        int top = stack.remove(stack.size() - 1);
        insertStack(stack, value);
        stack.add(top);
    }
}