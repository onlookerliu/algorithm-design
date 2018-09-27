import java.util.Scanner;

public class TwosComplement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(solve(A, B));
        }
    }

    public static long solve(int a, int b) {
        if (a > b) {
            throw new IllegalArgumentException();
        }

        long count = 0;
        if (a < 0 && b < 0) {
            count = twosComplement(a) - twosComplement(b + 1);
        } else if (a < 0 && b >= 0) {
            count = twosComplement(a) + twosComplement(b);
        } else if (a >= 0 && b >= 0) {
            count = twosComplement(b) - twosComplement(Math.max(0, a-1));
        }
        return count;
    }

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n-1);
        }
        return count;
    }

    public static long twosComplement(int n) {
        if (n == 0) {
            return 0;
        } else if (n > 0) {
            if (n % 2 == 0) {
                return twosComplement(n-1) + hammingWeight(n);
            }
            return ((long) n + 1) / 2 + 2 * twosComplement(n / 2);
        } else {
            return (-(long) n) * 32 - twosComplement(-n-1);
        }
    }
}