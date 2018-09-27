import java.util.Scanner;

public class LonelyInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int xor = 0;
        for (int i = 0; i < N; i++) {
            xor ^= sc.nextInt();
        }
        System.out.println(xor);
    }
}