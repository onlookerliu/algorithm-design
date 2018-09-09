import java.util.Arrays;
import java.util.Scanner;

public class PrimePairs {

    static boolean[] isPrime = new boolean[1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isPrime();
        while (sc.hasNext()) {
            int a = sc.nextInt();
            System.out.println(countPrimePairs(a));
        }
        sc.close();
    }

    private static int countPrimePairs(int a) {
        int count = 0;
        for (int i = 2; i <= a / 2; i++) {
            if (isPrime[i] && isPrime[a-i]) {
                count++;
            }
        }
        return count;
    }

    private static void isPrime() {
        Arrays.fill(isPrime, 2, 999, true);
        for (int i = 2; i * i < 1000; i++) {
            if (isPrime[i]) {
                for (int j = i*i; j < 1000; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    
}