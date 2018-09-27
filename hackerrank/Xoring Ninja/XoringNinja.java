import java.math.BigInteger;
import java.util.Scanner;

public class XoringNinja {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            BigInteger sum = BigInteger.ZERO;
            for (int j = 0; j < n; j++) {
                sum = sum.or(BigInteger.valueOf(in.nextInt()));
            }
            sum = sum.multiply(BigInteger.valueOf(2).pow(n - 1)).mod(BigInteger.valueOf(1000000007));
            System.out.println(sum);
        }
    }
}