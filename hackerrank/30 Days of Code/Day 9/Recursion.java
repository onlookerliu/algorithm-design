import java.util.Scanner;

public class Recursion {

    public static int factorial(int i) {
        if (i == 1 || i == 0) {
            return 1;
        } else {
            return i * factorial(i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(factorial(i));
        sc.close();
    }
}