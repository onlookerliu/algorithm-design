import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (j >= n - 1 - i) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}