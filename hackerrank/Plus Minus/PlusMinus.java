import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            if (input > 0) {
                a++;
            } else if (input < 0) {
                b++;
            }
        }
        System.out.printf("%.3f\n", (double) a / n);
        System.out.printf("%.3f\n", (double) b / n);
        System.out.printf("%.3f\n", (double) (n - a - b) / n);
    }
}