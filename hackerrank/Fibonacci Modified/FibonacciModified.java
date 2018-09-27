import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        int n = in.nextInt();
        for (int i = 1; i < n; ++i) {
            BigInteger temp = a.add(b.pow(2));
            a = b;
            b = temp;
        }
        System.out.println(a);
    }
}