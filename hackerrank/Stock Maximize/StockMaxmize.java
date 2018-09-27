import java.util.Scanner;

public class StockMaxmize {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int[] stock = new int[N];
            for (int j = 0; j < N; j++) {
                stock[j] = in.nextInt();
            }
            System.out.println(stockMax(stock));
        }
    }

    public static long stockMax(int[] nums) {
        int rightMax = Integer.MIN_VALUE;
        long maxProfit = 0;
        for (int i = nums.length - 1; i >= 0; --i) {
            rightMax = Math.max(rightMax, nums[i]);
            maxProfit += rightMax - nums[i];
        }
        return maxProfit;
    }
}