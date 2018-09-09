import java.util.Scanner;

public class MaximizingXOR {

    static int maximizingXOR(int l, int r) {
        int xor = l ^ r;
        int significantBit = 31 - Integer.numberOfLeadingZeros(xor);
        int res = (1 << (significantBit + 1)) - 1;
        return res;
    }

    static int maximizingXOR2(int l, int r) {
        int xor = l ^ r;
        int res = 0;
        while (xor > 0) {
            res <<= 1;
            res |= 1;
            xor >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int res = maximizingXOR(l, r);
        System.out.println(res);
        in.close();
    }
}

// run.sh
// echo -e "10\n15\n7\n" | java MaximizingXOR