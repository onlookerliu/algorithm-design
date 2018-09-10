import java.io.BufferedInputStream;
import java.util.*;

public class DeliveryProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        // 位置个数
        int N = sc.nextInt();
        // 道路数目
        int M = sc.nextInt();
        // 起点位置
        int S = sc.nextInt();
        // 快递位置
        int T = sc.nextInt();

        // build the graph
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int i = 0; i < M; i++) {
            graph.computeIfAbsent(sc.nextInt(), x -> new ArrayList<>()).add(new int[]{sc.nextInt(), sc.nextInt()});
        }

        int sTot = dijkstra(graph, S, T);
        int tTos = dijkstra(graph, T, S);
        System.out.println(sTot + tTos);
    }

    private static int dijkstra(Map<Integer, List<int[]>> graph, int start, int end) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(new int[]{start, 0});
        Map<Integer, Integer> distances = new HashMap<>();

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int pos = curr[0], dis = curr[1];
            if (distances.containsKey(pos)) {
                continue;
            }
            distances.put(pos, dis);

            if (graph.containsKey(pos)) {
                for (int[] neigh : graph.get(pos)) {
                    if (distances.containsKey(neigh[0])) {
                        continue;
                    }
                    pq.offer(new int[]{neigh[0], neigh[1] + dis});
                }
            }
        }

        return distances.get(end);
    }

}

// run.sh
// echo -e "3 3 1 3\n1 2 3\n2 3 3\n3 1 1\n" | java DeliveryProblem
// 7