import java.util.Scanner;

public class MaximumSubarray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; ++i) {
            int N = in.nextInt();
            int[] array = new int[N];
            for (int j = 0; j < N; ++j) {
                array[j] = in.nextInt();
            }

            int sum1 = Integer.MIN_VALUE;
            int sum2 = 0;
            for (int j = 0, curSum1 = 0; j < N; j++) {
                curSum1 += array[j];
                sum1 = Math.max(sum1, curSum1);
                if (curSum1 < 0) {
                    curSum1 = 0;
                }
                sum2 = j == 0 ? array[j] : Math.max(sum2 + array[j], Math.max(array[j], sum2));
            }
            System.out.println(sum1 + " " + sum2);
        }
    }
}