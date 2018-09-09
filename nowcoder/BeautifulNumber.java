import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BeautifulNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = sc.nextInt();
        for (int i = 1; i <= t; ++i) {
            long n = sc.nextLong();
            System.out.println("Case #" + i + ": " + getResultLarge(n));
        }
    }

    private static long getResultSmall(long num) {
        for (long radix = 2; radix < num; radix++) {
            if (isBeautiful(num, radix)) {
                return radix;
            }
        }
        return num - 1;
    }

    private static boolean isBeautiful(long num, long radix) {
        while (num > 0) {
            if (num % radix != 1) {
                return false;
            }
            num /= radix;
        }
        return true;
    }

    private static long getResultLarge(long num) {
        for (int k = 64; k >= 2; k--) {
            long radix = getRadix(num, k);
            if (radix != -1) {
                return radix;
            }
        }
        return num - 1;
    }

    private static long getRadix(long num, int bits) {
        long minRadix = 2, maxRadix = num;
        while (minRadix < maxRadix) {
            long midRadix = minRadix + (maxRadix - minRadix) / 2;
            long x = convert(midRadix, bits);
            if (x == num) {
                return minRadix;
            } else if (x < num) {
                minRadix = midRadix + 1;
            } else {
                maxRadix = midRadix;
            }
        }
        return -1;
    }

    private static long convert(long radix, int bits) {
        long component = 1, sum = 0;
        for (int i = 0; i < bits; i++) {
            if (Long.MAX_VALUE - sum < component) {
                sum = Long.MAX_VALUE;
            } else {
                sum += component;
            }

            if (Long.MAX_VALUE / component < radix) {
                component = Long.MAX_VALUE;
            } else {
                component *= radix;
            }
        }
        return sum;
    }
}

// run.sh
// echo -e "1\n14919921443713777\n" >> input.txt
// cat input.txt | java BeatifulNumber >> output.txt