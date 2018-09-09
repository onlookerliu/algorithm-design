import java.io.BufferedInputStream;
import java.util.Scanner;

public class PathInMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    matrix[row][col] = sc.nextInt();
                }
            }
            System.out.println(getResult(matrix));
        }
    }

    private static int getResult(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int n = matrix.length;
        int[][] dp = new int[2][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = matrix[0][i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i & 1][j] = Math.max(dp[(i-1) & 1][j], Math.max(dp[(i-1) & 1][j+1 >= n ? n - 1 : j + 1], dp[(i-1) & 1][j-1 < 0 ? 0 : j-1])) + matrix[i][j];
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i : dp[(n-1) & 1]) {
            max = Math.max(max, i);
        }
        return max;
    }
}

// run.sh
// javac PathInMatrix.java && echo -e "1\n2\n348 391 618 193\n" | java PathInMatrix