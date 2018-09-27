import java.util.List;
import java.util.Scanner;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(lengthOfLIS(nums));
    }

    public static int lengthOfLIS(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for (int num : nums) {
            if (list.size() == 0 || list.get(list.size() - 1) < num) {
                list.add(num);
            } else {
                int index = findPosition(list, num);
                list.set(index, num);
            }
        }
        return list.size();
    }

    public static int findPosition(List<Integer> list, int target) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == list.get(mid)) {
                return mid;
            } else if (target < list.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}