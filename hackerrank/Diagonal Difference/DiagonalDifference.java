import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                int a = in.nextInt();
                if (i == j) {
                    sum1 += a;
                }
                if (i == n - 1 - j) {
                    sum2 += a;
                }
            }
        }
        System.out.println(Math.abs(sum1 - sum2));
    }
}