import java.util.Scanner;

public class FlippingBits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            long v = sc.nextLong();
            System.out.println((long) Math.pow(2, 32) - 1 - v);
        }
    }
}