// import java.io.BufferedInputStream;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Scanner;

// public class AnniversaryParty {

//     static class Node {
//         int rate;
//         List<Node> child;

//         public Node(int rate) {
//             this.rate = rate;
//             this.child = new LinkedList<>();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(new BufferedInputStream(System.in));
//         int n = sc.nextInt();
//         Node[] nodes = new Node[n+1];
//         for (int i = 1; i <= n; i++) {
//             nodes[i] = new Node(sc.nextInt());
//         }
        
//         // 建立多叉树
//         int l, k;
//         boolean[] father = new boolean[n+1];
//         for (int i = 1; i <= n; i++) {
//             l = sc.nextInt();
//             k = sc.nextInt();
//             if (l == 0 && k == 0) {
//                 break;
//             }
//             father[l] = true;
//             nodes[k].child.add(nodes[i]);
//         }

//         // 获得根节点
//         Node root = null;
//         for (int i = 1; i <= n; i++) {
//             if (father[i]) {
//                 continue;
//             }
//             root = nodes[i];
//         }

//         int[] rst = maxRate(root);
//         System.out.println(Math.max(rst[0], rst[1]));
//     }

//     private static int[] maxRate(Node root) {
//         // rst[0]: 不来的活跃度；rst[1]: 来的活跃度
//         int[] rst = new int[2];
//         rst[1] = root.rate;
//         for (Node child : root.child) {
//             int[] childRst = maxRate(child);
//             rst[0] += Math.max(childRst[0], childRst[1]);
//             rst[1] += childRst[0];
//         }
//         return rst;
//     }
// }

import java.io.BufferedInputStream;
import java.util.Scanner;

public class AnniversaryParty {

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int n = sc.nextInt();
        // matrix[i][0]: 第 i 位员工的上司
        // matrix[i][1]: 第 i 位员工自身的活跃度
        int[][] matrix = new int[n+1][2];
        for (int i = 1; i <= n; i++) {
            matrix[i][1] = sc.nextInt();
        }

        int l, k;
        for (int i = 1; i <= n; i++) {
            l = sc.nextInt();
            k = sc.nextInt();
            if (l == 0 && k == 0) {
                break;
            }
            matrix[l][0] = k;
        }

        int root = 0;
        for (int i = 1; i <= n; i++) {
            if (matrix[i][0] == 0) {
                root = i;
                break;
            }
        }

        boolean[] visited = new boolean[n + 1];
        // dp[i][0]: 第 i 位员工未到场的最高活跃度
        // dp[i][1]: 第 i 位员工到场的最高活跃度
        int[][] dp = new int[n+1][2];
        maxRate(matrix, dp, visited, root);
        System.out.println(Math.max(dp[root][0], dp[root][1]));
    }

    private static void maxRate(int[][] matrix, int[][] dp, boolean[] visited, int root) {
        visited[root] = true;
        dp[root][1] = matrix[root][1];
        for (int i = 1; i < matrix.length; i++) {
            if (!visited[i] && matrix[i][0] == root) {
                maxRate(matrix, dp, visited, i);
                dp[root][0] += Math.max(dp[i][0], dp[i][1]);
                dp[root][1] += dp[i][0];
            }
        }
    }
}