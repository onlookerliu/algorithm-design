import java.util.Scanner;

public class MaximizingXOR {

    public static int maxXor(int l, int r) {
        int xor = l ^ r;
        return (1 << Integer.toBinaryString(xor).length()) - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(maxXor(sc.nextInt(), sc.nextInt()));
    }
}