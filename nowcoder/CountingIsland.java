import java.util.Arrays;
import java.util.Scanner;

public class CountingIsland {
    static int[] uf = new int[1000000];
    static int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    static int count = 0;

    public static void main(String[] args) {
        Arrays.fill(uf, -1);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x, y, index;
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            index = 1000 * x + y;
            uf[index] = index;
            count++;

            for (int[] dir : dirs) {
                int nextX = x + dir[0];
                int nextY = y + dir[1];
                int nextP = 1000 * nextX + nextY;
                if (nextX < 0 || nextX >= 1000 || nextY < 0 || nextY >= 1000 || uf[nextP] == -1) {
                    continue;
                }

                int rootA = findFather(index);
                int rootB = findFather(nextP);
                if (rootA != rootB) {
                    uf[rootA] = rootB;
                    count--;
                }
            }
            System.out.println(count);
        }
    }

    private static int findFather(int index) {
        while (index != uf[index]) {
            uf[index] = uf[uf[index]];
            index = uf[index];
        }
        return index;
    }
}

// run.sh
// echo -e "3\n0 0\n1 1\n1 0\n" | java CountingIsland