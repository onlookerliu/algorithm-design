public class CountIslands {

    public static void main(String[] args) {
        int[][] m1 = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0, 1, 1, 1, 0},
            {0, 1, 1, 1, 0, 0, 0, 1, 0},
            {0, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 1, 0, 0},
            {0, 0, 0, 0, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
        System.out.println(countIslands(m1));
    }

    public static int countIslands(int[][] m) {
        if (m == null || m[0] == null) {
            return 0;
        }

        int N = m.length;
        int M = m[0].length;
        int res = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (m[i][j] == 1) {
                    res++;
                    traverse(m, i, j, N, M);
                }
            }
        }
        return res;
    }

    public static void traverse(int[][] m, int i, int j, int N, int M) {
        if (i < 0 || i >= N || j < 0 || j >= M || m[i][j] != 1) {
            return;
        }

        m[i][j] = 2;
        traverse(m, i+1, j, N, M);
        traverse(m, i-1, j, N, M);
        traverse(m, i, j+1, N, M);
        traverse(m, i, j-1, N, M);
    }
}