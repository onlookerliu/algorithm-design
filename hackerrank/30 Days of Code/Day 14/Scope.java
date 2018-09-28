import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;
    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int maxNum = elements[0];
        int minNum = maxNum;
        for (int i = 1; i < elements.length; i++) {
            maxNum = elements[i] > maxNum ? elements[i] : maxNum;
            minNum = elements[i] > minNum ? minNum : elements[i];
        }
        maximumDifference = Math.abs(maxNum - minNum);
    }
}

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.println(difference.maximumDifference);
    }
}