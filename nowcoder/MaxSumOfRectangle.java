public class MaxSumOfRectangle {

    public static void main(String[] args) {
        int[][] matrix = {
            {0, -2, -7, 0},
            {9, 2, -6, 2},
            {-4, 1, -4, 1},
            {-1, 8, 0, -2},
        };
        System.out.println(maxSubmatrix(matrix));
    }

    public static int maxSubmatrix(int[][] matrix) {
        if (matrix == null || matrix[0] == null) {
            return 0;
        }

        int max = 0;
        int col = matrix[0].length;
        int row = matrix.length;
        for (int i = 0; i < row; i++) {
            int[] arr = new int[col];
            for (int j = i; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    arr[k] += matrix[j][k];
                }
                max = Math.max(maxSubArray(arr), max);
            }
        }
        return max;
    }

    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            sum += i;
            max = Math.max(max, sum);
            sum = Math.max(sum , 0);
        }
        return max;
    }
}