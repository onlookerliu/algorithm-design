public class FindMin {

    public static void main(String[] args) {
        int[] A = {19, 11, 3, 8, 10};
        System.out.println(BinarySearch(A));
    }

    private static int BinarySearch(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }
        
        int len = nums.length;
        if (nums[0] < nums[1]) {
            return nums[0];
        }
        if (nums[len-1] < nums[len-2]) {
            return nums[len-1];
        }

        int start = 0;
        int end = len - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return (nums[start] < nums[start + 1]) ? nums[start] : nums[end];
    }
}