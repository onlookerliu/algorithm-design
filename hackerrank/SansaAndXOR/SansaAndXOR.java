import java.util.Scanner;

public class SansaAndXOR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int xor = 0;
            for (int j = 0; j < N; j++) {
                int value = sc.nextInt();
                if ((j+1) * (N-j) % 2 != 0) {
                    xor ^= value;
                }
            }
            System.out.println(xor);
        }
    }
}