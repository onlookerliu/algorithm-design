import java.util.Scanner;

public class MagicalNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int count = 0;

        for (int i = l; i < r; i++) {
            String s = String.valueOf(i);
            char[] ch = s.toCharArray();
            int[] nums = new int[ch.length];
            for (int j = 0; j < nums.length; j++) {
                nums[j] = ch[j] - '0';
            }

            if (isMagicalNumber(nums)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isMagicalNumber(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }
        if (sum % 2 == 1) {
            return false;
        }
        sum /= 2;

        boolean[] dp = new boolean[sum+1];
        for (int i = 0; i <= sum; i++) {
            dp[i] = false;
        }
        dp[0] = true;

        for (int i = 0; i < len; i++) {
            for (int j = sum; j >= nums[i]; j--) {
                dp[j] |= dp[j - nums[i]];
            }
        }

        return dp[sum];
    }
}