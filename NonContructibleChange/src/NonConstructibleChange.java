import java.util.Arrays;

public class NonConstructibleChange {
    public static void main(String[] args) {

        int[] coins = {5, 7, 1, 1, 2, 3, 22};

        int result = nonConstructibleChange(coins);

        System.out.println(result);
    }

    public static int nonConstructibleChange(int[] coins) {

        int change = 0;
        Arrays.sort(coins);

        if (coins.length == 0) {
            return 1;
        }

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] > change + 1) {
                return change + 1;
            } else {
                change = change + coins[i];
            }
        }
        return change + 1;
    }
}