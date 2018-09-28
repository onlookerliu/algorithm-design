import java.util.Scanner;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        if (n == 1) return 1;
        int sum = 1+n, r = 0;
        for (int i = 2; i < n; i++) {
            r = n % i;
            if (r == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}


public class Interfaces {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        AdvancedArithmetic myCalculator = new Calculator();

        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}