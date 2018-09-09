import java.io.BufferedInputStream;
import java.util.Scanner;

public class MaximizingXORSubset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.println(maxSubsetXOR(nums));
        }
    }

    public static int maxSubsetXOR(int nums[]) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int index = 0;
        for (int i = 31; i >= 0; i--) {
            int maxValue = Integer.MIN_VALUE;
            int maxIndex = index;
            for (int j = index; j < nums.length; j++) {
                if (((nums[j] >> i) & 1) == 1 && nums[j] > maxValue) {
                    maxValue = nums[j];
                    maxIndex = j;
                }
            }

            if (maxValue == Integer.MIN_VALUE) {
                continue;
            }

            int temp = nums[index];
            nums[index] = nums[maxIndex];
            nums[maxIndex] = index;

            maxIndex = index;

            for (int j = 0; j < nums.length; j++) {
                if (j != maxIndex && ((nums[j] >> i) & 1) == 1) {
                    nums[j] ^= nums[maxIndex];
                }
            }

            index++;
        }

        int rst = 0;
        for (int i = 0; i < nums.length; i++) {
            rst ^= nums[i];
        }
        return rst;
    }
}